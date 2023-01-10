/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas.clases;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Pago {
	
	
	private Contribuyente emisor;
	
	private Contribuyente receptor;
	
	private Date fecha;
	
	private Double cantidad;
	
	private String folio;
	
	private String moneda;

	public Contribuyente getEmisor() {
		return emisor;
	}

	public void setEmisor(Contribuyente emisor) {
		this.emisor = emisor;
	}

	public Contribuyente getReceptor() {
		return receptor;
	}

	public void setReceptor(Contribuyente receptor) {
		this.receptor = receptor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Pago() {
		super();
	}

	
	
   
}
