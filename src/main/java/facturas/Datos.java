package facturas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.lang.StringBuilder;

import facturas.constantes.RegimenFiscalEnum;
import facturas.constantes.TipoContribuyente;
import facturas.constantes.TipoPago;
import facturas.entidades.ContribuyenteEntity;
import facturas.entidades.FacturaEntity;
import facturas.entidades.PagoEntity;
import facturas.repositorios.ContribuyenteRepository;
import facturas.repositorios.FacturaRepository;
import facturas.repositorios.PagoRepository;

@Component
public class Datos {
	
	@Autowired
	private ContribuyenteRepository contribuyenteRepository;
	
	@Autowired
	private PagoRepository pagoRepository;
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@EventListener
	public void applicationReadyEvent(ApplicationReadyEvent event)  {
		
		ContribuyenteEntity escuela = new ContribuyenteEntity();
		escuela.setNombre("Artek");
		escuela.setRegimen(RegimenFiscalEnum.MORAL);
		escuela.setCp(4355);
		escuela.setRfc("ARTEC1234567");
		escuela.setTipoPago(TipoPago.PUE);
		escuela.setTipoContribuyente(TipoContribuyente.ESCUELA);
		escuela = contribuyenteRepository.save(escuela);
		
		ContribuyenteEntity alumno = new ContribuyenteEntity();
		alumno.setNombre("Juanito");
		alumno.setApellido("Sanchez");
		alumno.setCp(43213);
		alumno.setRfc("JUANITO45678");
		alumno.setRegimen(RegimenFiscalEnum.FISICA);
		alumno.setTipoContribuyente(TipoContribuyente.ALUMNO);
		alumno.setTipoPago(TipoPago.PUE);
		alumno = contribuyenteRepository.save(alumno);
		
		ContribuyenteEntity profesor = new ContribuyenteEntity();
		profesor.setNombre("Alheli�");
		profesor.setApellido("Lopez");
		profesor.setCp(54343);
		profesor.setRfc("ALHELI875455");
		profesor.setRegimen(RegimenFiscalEnum.FISICA);
		profesor.setTipoContribuyente(TipoContribuyente.PROFESOR);
		profesor.setTipoPago(TipoPago.PUE);
		profesor = contribuyenteRepository.save(profesor);
		
		PagoEntity pago = new PagoEntity();
		pago.setCantidad(1000d);
		pago.setFecha(new Date());
		pago.setFolio(java.util.UUID.randomUUID().toString());
		pago.setMoneda("MXN");
		pago.setEmisor(alumno);
		pago.setReceptor(escuela);
		pagoRepository.save(pago);
		
		
		PagoEntity pago2 = new PagoEntity();
		pago2.setCantidad(1000d);
		pago2.setFecha(new Date());
		pago2.setFolio(java.util.UUID.randomUUID().toString());
		pago2.setMoneda("MXN");
		pago2.setEmisor(escuela);
		pago2.setReceptor(profesor);
		pagoRepository.save(pago2);

		
		
		FacturaEntity factura = new FacturaEntity();
		factura.setCantidad(1000d);
		factura.setFecha(new Date());
		factura.setFolio(java.util.UUID.randomUUID().toString());
		factura.setMoneda("MXN");
		factura.setEmisor(escuela);
		factura.setReceptor(alumno);
		facturaRepository.save(factura);
		
		FacturaEntity factura2 = new FacturaEntity();
		factura2.setCantidad(1800d);
		factura2.setFecha(new Date());
		factura2.setFolio(java.util.UUID.randomUUID().toString());
		factura2.setMoneda("MXN");
		factura2.setEmisor(profesor);
		factura2.setReceptor(escuela);
		facturaRepository.save(factura2);
		

//		
//		System.out.println("Impresion de transacciones");
//		
//		System.out.println("----Pagos realizados----");
//		
//		for (Pago p : pagos) {
//			
//			StringBuilder sb = new StringBuilder();
//			sb.append("Emisor:").append(p.getEmisor().getNombre())
//			.append(" Receptor:").append(p.getReceptor().getNombre())
//			.append(" Cantidad:").append(p.getCantidad())
//			.append(" Fecha:").append(p.getFecha())
//			.append(" Folio:").append(p.getFolio())
//                        .append(" IVA:").append(p.getCantidad() * 0.16)
//                        .append(" Total:").append(p.getCantidad() * 1.16);
//			
//			System.out.println(sb);
//			
//		}
//		System.out.println("----Facturas expedidas----");
//		for (Factura p : facturas) {
//			
//			StringBuilder sb = new StringBuilder();
//			sb.append("Emisor:").append(p.getEmisor().getNombre())
//			.append(" Receptor:").append(p.getReceptor().getNombre())
//			.append(" Cantidad:").append(p.getCantidad())
//			.append(" Fecha:").append(p.getFecha())
//			.append(" Folio:").append(p.getFolio())
//                        .append(" IVA:").append(p.getCantidad() * 0.16)
//                        .append(" Total:").append(p.getCantidad() * 1.16);
//			
//			System.out.println(sb);
//			
//		}
//		
		
		
	}
	
	
//	public void getFacturas(Integer index) {
//		
//		if(index==null) {
//			
//			System.out.println(facturas.toString());
//		}else {
//			Factura factura = facturas.get(index);
//			System.out.println(factura.toString());
//		}	
//		
//	}
//	
//	public void generarFactura(Factura factura) {
//
//		this.facturas.add(factura);
//	
//	}
	

}
