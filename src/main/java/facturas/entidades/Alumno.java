/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas.entidades;

import java.util.List;

import facturas.constantes.RegimenFiscalEnum;
import facturas.constantes.TipoPago;

/**
 *
 * @author Dell
 * 
 *         nombres de variables y métodos inician con minusculas
 * 
 */
public class Alumno {
	
	private String rfc;
	private String nombre;
	private String apellido;
	private String domicilio;
	private int cp;
	private RegimenFiscalEnum regimen = RegimenFiscalEnum.FISICA;
	private TipoPago tipo = TipoPago.PUE;

	private List<PagoEntity> pagos;
	private List<FacturaEntity> facturas;
	
	
	
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

	public List<PagoEntity> getPagos() {
		return pagos;
	}

	public void setPagos(List<PagoEntity> pagos) {
		this.pagos = pagos;
	}

	public List<FacturaEntity> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<FacturaEntity> facturas) {
		this.facturas = facturas;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre del Alumno: ").append(this.nombre).append(this.apellido);
		sb.append("Domicilio: ").append(this.domicilio);
		sb.append("\n").append("Regimen Fiscal").append(this.getTipo());

		return sb.toString();
	}

}
