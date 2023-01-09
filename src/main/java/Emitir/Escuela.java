/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emitir;

/**
 *
 * @author Dell
 */
public class Escuela {
    
    private String RFC;
    private String mombre;
    private String DomicilioFiscal;
    private String MetodoPago;
    private TipoRegimenSocial tipo=TipoRegimenSocial.TipoMoral;
    private int cp;
    

    public Escuela(String RFC, String mombre, String DomicilioFiscal, String MetodoPago, int cp) {
        this.RFC = RFC;
        this.mombre = mombre;
        this.DomicilioFiscal = DomicilioFiscal;
        this.MetodoPago = MetodoPago;
        this.cp = cp;
    }
    
    
    
    
    
}
