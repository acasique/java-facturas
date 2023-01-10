package facturas.clases;

import java.util.Date;

public class Factura extends Object {
	
	private Contribuyente emisor;
	private Contribuyente receptor;

	private Double cantidad;
	private String moneda;
	private Date fecha;
	private String folio;
	
	
	
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
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public Factura() {
		super();
	}
	@Override
	public String toString() {
		return "Factura [emisor=" + emisor.getNombre() + ", receptor=" + receptor.getNombre() + ", cantidad=" + cantidad + ", moneda=" + moneda
				+ ", fecha=" + fecha + ", folio=" + folio + "]";
	}
	
	

	
}
