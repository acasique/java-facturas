package facturas.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "facturas")
public class FacturaEntity {

	/** The id. */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "num_factura")
	private int numFactura;

	@Column(name = "cantidad")
	private Double cantidad;
	
	@Column(name = "moneda")
	private String moneda;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "folio")
	private String folio;
	
	@Column(name = "concepto")
	private String concepto;
	
	@Column(name = "sub_total")
	private Double subtotal;
	
	@Column(name = "iva")
	private Double iva;
	
	@Column(name = "total")
	private Double total;
	
	@ManyToOne  
	@JoinColumn(name = "emisor_id")
	private ContribuyenteEntity emisor;
	
	@ManyToOne  
	@JoinColumn(name = "receptor_id")
	private ContribuyenteEntity receptor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public ContribuyenteEntity getEmisor() {
		return emisor;
	}

	public ContribuyenteEntity getReceptor() {
		return receptor;
	}

	public int getNumFactura() {
		return numFactura;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public String getMoneda() {
		return moneda;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getFolio() {
		return folio;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public Double isSubtotal() {
		return subtotal;
	}

	public Double isIVA() {
		return iva;
	}

	public Double isTotal() {
		return total;
	}

	public void setEmisor(ContribuyenteEntity emisor) {
		this.emisor = emisor;
	}

	public void setReceptor(ContribuyenteEntity receptor) {
		this.receptor = receptor;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public void setIVA(double iva) {
		this.iva = iva;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public FacturaEntity() {
		super();
	}

	@Override
	public String toString() {
		return "Factura [emisor=" + emisor.getNombre() + ", receptor=" + receptor.getNombre() + ", cantidad=" + cantidad
				+ ", moneda=" + moneda + ", fecha=" + fecha + ", folio=" + folio + ", concepto" + concepto
				+ ", subtotal" + subtotal + ", iva" + iva + ", total" + total + "]";
	}

}
