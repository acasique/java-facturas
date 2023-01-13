package facturas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.lang.StringBuilder;

import facturas.clases.Contribuyente;
import facturas.clases.Factura;
import facturas.clases.Pago;
import facturas.clases.RegimenFiscalEnum;
import facturas.clases.TipoContribuyente;
import facturas.clases.TipoPago;

public class Datos {
	
	
	private List<Contribuyente> contribuyentes;
	private List<Pago> pagos = new ArrayList<>();
	private List<Factura> facturas = new ArrayList<>();
	
	
	public Datos() {
		super();
	}
	
	public void generarDatos() {
		
		Contribuyente escuela = new Contribuyente();
		escuela.setNombre("Artek");
		escuela.setRegimen(RegimenFiscalEnum.MORAL);
		escuela.setCp(4355);
		escuela.setRfc("ARTEC1234567");
		escuela.setTipoPago(TipoPago.PUE);
		escuela.setTipoContribuyente(TipoContribuyente.ESCUELA);
		
		Contribuyente alumno = new Contribuyente();
		alumno.setNombre("Juanito");
		alumno.setApellido("Sanchez");
		alumno.setCp(43213);
		alumno.setRfc("JUANITO45678");
		alumno.setRegimen(RegimenFiscalEnum.FISICA);
		alumno.setTipoContribuyente(TipoContribuyente.ALUMNO);
		alumno.setTipoPago(TipoPago.PUE);
		
		
		Contribuyente profesor = new Contribuyente();
		profesor.setNombre("Alheli­");
		profesor.setApellido("Lopez");
		profesor.setCp(54343);
		profesor.setRfc("ALHELI875455");
		profesor.setRegimen(RegimenFiscalEnum.FISICA);
		profesor.setTipoContribuyente(TipoContribuyente.PROFESOR);
		profesor.setTipoPago(TipoPago.PUE);
		
		contribuyentes = Arrays.asList(escuela, alumno, profesor);
				
		
		Pago pago = new Pago();
		pago.setCantidad(1000d);
		pago.setFecha(new Date());
		pago.setFolio(java.util.UUID.randomUUID().toString());
		pago.setMoneda("MXN");
		pago.setEmisor(alumno);
		pago.setReceptor(escuela);
		
		Pago pago2 = new Pago();
		pago2.setCantidad(1000d);
		pago2.setFecha(new Date());
		pago2.setFolio(java.util.UUID.randomUUID().toString());
		pago2.setMoneda("MXN");
		pago2.setEmisor(escuela);
		pago2.setReceptor(profesor);
		
		pagos = Arrays.asList(pago,pago2);	

		
		
		Factura factura = new Factura();
		factura.setCantidad(1000d);
		factura.setFecha(new Date());
		factura.setFolio(java.util.UUID.randomUUID().toString());
		factura.setMoneda("MXN");
		factura.setEmisor(escuela);
		factura.setReceptor(alumno);
		this.facturas.add(factura);
	
		
		Factura factura2 = new Factura();
		factura2.setCantidad(1800d);
		factura2.setFecha(new Date());
		factura2.setFolio(java.util.UUID.randomUUID().toString());
		factura2.setMoneda("MXN");
		factura2.setEmisor(profesor);
		factura2.setReceptor(escuela);
		
		this.facturas.add(factura2);
		
		System.out.println("Impresion de transacciones");
		
		System.out.println("----Pagos realizados----");
		
		for (Pago p : pagos) {
			
			StringBuilder sb = new StringBuilder();
			sb.append("Emisor:").append(p.getEmisor().getNombre())
			.append(" Receptor:").append(p.getReceptor().getNombre())
			.append(" Cantidad:").append(p.getCantidad())
			.append(" Fecha:").append(p.getFecha())
			.append(" Folio:").append(p.getFolio())
                        .append(" IVA:").append(p.getCantidad() * 0.16)
                        .append(" Total:").append(p.getCantidad() * 1.16);
			
			System.out.println(sb);
			
		}
		System.out.println("----Facturas expedidas----");
		for (Factura p : facturas) {
			
			StringBuilder sb = new StringBuilder();
			sb.append("Emisor:").append(p.getEmisor().getNombre())
			.append(" Receptor:").append(p.getReceptor().getNombre())
			.append(" Cantidad:").append(p.getCantidad())
			.append(" Fecha:").append(p.getFecha())
			.append(" Folio:").append(p.getFolio())
                        .append(" IVA:").append(p.getCantidad() * 0.16)
                        .append(" Total:").append(p.getCantidad() * 1.16);
			
			System.out.println(sb);
			
		}
		
		
		
	}
	
	
	public void getFacturas(Integer index) {
		
		if(index==null) {
			
			System.out.println(facturas.toString());
		}else {
			Factura factura = facturas.get(index);
			System.out.println(factura.toString());
		}	
		
	}
	
	public void generarFactura(Factura factura) {

		this.facturas.add(factura);
	
	}
	

}
