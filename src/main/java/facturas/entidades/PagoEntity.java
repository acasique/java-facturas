/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name = "pagos")
public class PagoEntity {
	
	/** The id. */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cantidad")
	private Double cantidad;
	
	@Column(name = "folio")
	private String folio;
	
	@Column(name = "moneda")
	private String moneda;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha")
	private Date fecha;
	
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

	public void setEmisor(ContribuyenteEntity emisor) {
		this.emisor = emisor;
	}

	public ContribuyenteEntity getReceptor() {
		return receptor;
	}

	public void setReceptor(ContribuyenteEntity receptor) {
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

	public PagoEntity() {
		super();
	}

	
	
   
}
