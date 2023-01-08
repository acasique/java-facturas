/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas;

/**
 *
 * @author Dell
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String domicilio;
    private int cp;
    private TipoRegimenSocial tipo=TipoRegimenSocial.TipoMoral;

    public Alumno(String nombre, String apellido, String domicilio, int cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cp = cp;
    }

    public TipoRegimenSocial getTipo() {
        return tipo;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Cliente: " ).append(this.nombre).append(this.apellido);
        sb.append("Ciudad: ").append(this.domicilio);
        sb.append("\n").append("Regimen Social").append(this.getTipo());
        
        return sb.toString();       
    }
    
    
    
    
}
