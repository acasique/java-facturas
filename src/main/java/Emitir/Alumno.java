/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emitir;

/**
 *
 * @author Dell
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String domicilio;
    private int cp;
    private TipoRegimenSocial tipo=TipoRegimenSocial.TipoFisica;
    private TipoPago tipop=TipoPago.PUE;

    public Alumno(String nombre, String apellido, String domicilio, int cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cp = cp;
    }

    public TipoRegimenSocial getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getCp() {
        return cp;
    }

    public TipoPago getTipop() {
        return tipop;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setTipo(TipoRegimenSocial tipo) {
        this.tipo = tipo;
    }

    public void setTipop(TipoPago tipop) {
        this.tipop = tipop;
    }
    
    
    
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Cliente: " ).append(this.nombre).append(this.apellido);
        sb.append("Ciudad: ").append(this.domicilio);
        sb.append("\n").append("Regimen Social").append(this.getTipo());
        
        return sb.toString();       
    }
    
    
    
    
}
