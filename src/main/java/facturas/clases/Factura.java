package facturas.clases;

import java.util.Date;

public class Factura extends Object {
	
	private Contribuyente emisor;
	private Contribuyente receptor;
        
        private int numFactura;

	private Double cantidad;
	private String moneda;
	private Date fecha;
	private String folio;
        private String concepto;
        private Double subtotal;
        private Double IVA;
        private Double total;

        public Contribuyente getEmisor() {
          return emisor;
        }

        public Contribuyente getReceptor() {
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
            return IVA;
        }

        public Double isTotal() {
            return total;
        }

        public void setEmisor(Contribuyente emisor) {
            this.emisor = emisor;
        }

        public void setReceptor(Contribuyente receptor) {
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

        public void setIVA(double IVA) {
            this.IVA = IVA;
        }

        public void setTotal(double total) {
            this.total = total;
        }


	public Factura() {
		super();
	}
        
	@Override
	public String toString() {
		return "Factura [emisor=" + emisor.getNombre() + ", receptor=" + receptor.getNombre() + ", cantidad=" + cantidad + ", moneda=" + moneda
				+ ", fecha=" + fecha + ", folio=" + folio + ", concepto"+ concepto + ", subtotal"+ subtotal + ", IVA"+ IVA 
                                + ", total" + total + "]";
	}
	
	

	
}
