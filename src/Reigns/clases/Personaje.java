
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Personaje {
    private String nombre;
    private int numero;
    
    protected String[] mensajes;
    protected String[] rPositivas;
    protected String[] rNegativas;
    protected String[] ePositivas;
    protected String[] eNegativas;
    
    protected String[] mensajesEsp;
    protected String[] rPositivasEsp;
    protected String[] rNegativasEsp;
    protected String[] ePositivasEsp;
    protected String[] eNegativasEsp;

    public Personaje(String nombre, int numero, String[] mensajes, String[] rPositivas, String[] rNegativas, String[] ePositivas, String[] eNegativas, String[] mensajesEsp, String[] rPositivasEsp, String[] rNegativasEsp, String[] ePositivasEsp, String[] eNegativasEsp) {
        this.nombre = nombre;
        this.numero = numero;
        this.mensajes = mensajes;
        this.rPositivas = rPositivas;
        this.rNegativas = rNegativas;
        this.ePositivas = ePositivas;
        this.eNegativas = eNegativas;
        this.mensajesEsp = mensajesEsp;
        this.rPositivasEsp = rPositivasEsp;
        this.rNegativasEsp = rNegativasEsp;
        this.ePositivasEsp = ePositivasEsp;
        this.eNegativasEsp = eNegativasEsp;
    }
    
    
    public void aplicar(boolean resp,Rey R){
        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public int getNumMensajes(){
        return mensajes.length;
    }
    
    public void ToString(){
        System.out.println(this.nombre+" os dice...");
        System.out.println(this.mensajes[this.numero]);
        System.out.println("");
        System.out.println("1. "+this.rPositivas[this.numero]);
        System.out.println("2. "+this.rNegativas[this.numero]);
    }
    
    public int[] formaModificada(int[] i,int f,int p){
        int[] res = new int[i.length];
        for(int j = 0 ; j<i.length ; j++){
            res[j] = i[j]/f+p;
        }
        return res;
    }
    
    public void dibujarCara(Graphics G, Color piel,Color ojos,int fX,int fY,int pX, int pY){
        int[] caraX = {400,800,800,650,550,400};
        int[] caraY = {150,150,450,550,550,450};
        caraX = formaModificada(caraX, fX, pX);
        caraY = formaModificada(caraY, fY, pY);
        G.setColor(piel);
        G.fillPolygon(caraX, caraY, caraX.length);
        
        int[] ojoDerX = {525,550,525,500};
        int[] ojoDerY = {250,300,350,300};
        int[] ojoIzqX = {675,700,675,650};
        int[] ojoIzqY = {250,300,350,300};
        ojoDerX = formaModificada(ojoDerX, fX, pX);
        ojoDerY = formaModificada(ojoDerY, fY, pY);
        ojoIzqX = formaModificada(ojoIzqX, fX, pX);
        ojoIzqY = formaModificada(ojoIzqY, fY, pY);
        G.setColor(ojos);
        G.fillPolygon(ojoDerX, ojoDerY, ojoDerX.length);
        G.fillPolygon(ojoIzqX, ojoIzqY, ojoIzqX.length);
    }
    public void dibujar(Graphics G){
    }
}