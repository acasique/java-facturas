package facturas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import facturas.constantes.RegimenFiscalEnum;
import facturas.constantes.TipoContribuyente;
import facturas.constantes.TipoPago;

@Entity
@Table(name = "contribuyentes")
public class ContribuyenteEntity {
	
	/** The id. */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rfc")
	private String rfc;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Enumerated(EnumType.STRING)
	private TipoContribuyente tipoContribuyente;
	
	@Column(name = "cp")
	private int cp;
	
	@Column(name = "regimen")
	@Enumerated(EnumType.STRING)
	private RegimenFiscalEnum regimen = RegimenFiscalEnum.FISICA;
	
	@Column(name = "tipo_pago")
	@Enumerated(EnumType.STRING)
	private TipoPago tipoPago = TipoPago.PUE;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		return sb.append("Nombre del contribuyente: ").append(this.nombre).append(this.apellido)
		.append("\nRFC").append(this.getRfc())
		.append("\nDomicilio: ").append(this.domicilio)
                .append("\nCodigo Postal: ").append(this.cp)
		.append("\nRegimen Fiscal").append(this.getRegimen())
		.append("\nTipo de contribuyente").append(this.getTipoContribuyente())
		.append("\nTipo de pago").append(this.getTipoPago()).toString();
	}


}
