/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas.clases;

import java.util.List;

/**
 *
 * @author Dell
 */
public class Escuela {
    
    private String rfc;
    private String nombre;
    private String domicilio;
	private RegimenFiscalEnum regimen = RegimenFiscalEnum.MORAL;
	private TipoPago tipo = TipoPago.PUE;
    private int cp;
    
	private List<Pago> pagos;
	private List<Factura> facturas;
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public RegimenFiscalEnum getRegimen() {
		return regimen;
	}
	public void setRegimen(RegimenFiscalEnum regimen) {
		this.regimen = regimen;
	}
	public TipoPago getTipo() {
		return tipo;
	}
	public void setTipo(TipoPago tipo) {
		this.tipo = tipo;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public List<Pago> getPagos() {
		return pagos;
	}
	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	public Escuela(String rfc, String nombre, String domicilio, RegimenFiscalEnum regimen, TipoPago tipo, int cp,
			List<Pago> pagos, List<Factura> facturas) {
		super();
		this.rfc = rfc;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.regimen = regimen;
		this.tipo = tipo;
		this.cp = cp;
		this.pagos = pagos;
		this.facturas = facturas;
	}
	public Escuela() {
		super();
	}
	
	

    
    
}
