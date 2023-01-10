package facturas.clases;

import java.util.List;

public class Contribuyente {
	
	private String rfc;
	private String nombre;
	private String apellido;
	private String domicilio;
	private TipoContribuyente tipoContribuyente;
	private int cp;
	private RegimenFiscalEnum regimen = RegimenFiscalEnum.FISICA;
	private TipoPago tipoPago = TipoPago.PUE;

	private List<Pago> pagos;
	private List<Factura> facturas;
	
	
	public TipoContribuyente getTipoContribuyente() {
		return tipoContribuyente;
	}

	public void setTipoContribuyente(TipoContribuyente tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}

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
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		return sb.append("Nombre del contribuyente: ").append(this.nombre).append(this.apellido)
		.append("\nRFC").append(this.getRfc())
		.append("\nDomicilio: ").append(this.domicilio)
		.append("\nRegimen Fiscal").append(this.getRegimen())
		.append("\nTipo de contribuyente").append(this.getTipoContribuyente())
		.append("\nTipo de pago").append(this.getTipoPago()).toString();
	}


}
