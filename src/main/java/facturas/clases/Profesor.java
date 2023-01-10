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
public class Profesor {
	
	private String rfc;
	private String nombre;
	private String apellido;
	private String domicilio;
	private int cp;
	private RegimenFiscalEnum regimen = RegimenFiscalEnum.FISICA;
	private TipoPago tipo = TipoPago.PUE;

	private List<Pago> pagos;
	private List<Factura> facturas;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
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


	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre del Profesor: ").append(this.nombre).append(this.apellido);
		sb.append("Domicilio: ").append(this.domicilio);
		sb.append("\n").append("Regimen Fiscal").append(this.getTipo());

		return sb.toString();
	}

    
}
