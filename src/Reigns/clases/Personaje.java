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

    public Personaje(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.mensajes = new String[0];
        this.rPositivas = new String[0];
        this.rNegativas = new String[0];
        this.ePositivas = new String[0];
        this.eNegativas = new String[0];
        this.mensajesEsp = new String[0];
        this.rPositivasEsp = new String[0];
        this.rNegativasEsp = new String[0];
        this.ePositivasEsp = new String[0];
        this.eNegativasEsp = new String[0];
    }

    public void setMensajes(String[] mensajes) {
        this.mensajes = mensajes;
    }

    public void setrPositivas(String[] rPositivas) {
        this.rPositivas = rPositivas;
    }

    public void setrNegativas(String[] rNegativas) {
        this.rNegativas = rNegativas;
    }

    public void setePositivas(String[] ePositivas) {
        this.ePositivas = ePositivas;
    }

    public void seteNegativas(String[] eNegativas) {
        this.eNegativas = eNegativas;
    }

    public void setMensajesEsp(String[] mensajesEsp) {
        this.mensajesEsp = mensajesEsp;
    }

    public void setrPositivasEsp(String[] rPositivasEsp) {
        this.rPositivasEsp = rPositivasEsp;
    }

    public void setrNegativasEsp(String[] rNegativasEsp) {
        this.rNegativasEsp = rNegativasEsp;
    }

    public void setePositivasEsp(String[] ePositivasEsp) {
        this.ePositivasEsp = ePositivasEsp;
    }

    public void seteNegativasEsp(String[] eNegativasEsp) {
        this.eNegativasEsp = eNegativasEsp;
    }

    public void aplicar(boolean resp, Rey R) {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumMensajes() {
        return mensajes.length;
    }

    public void ToString(Rey R) {

        if (R.clarividencia()) {
            System.out.println(nombre + " os dice...");
            System.out.println(mensajes[numero]);
            System.out.println("");
            System.out.println("1. " + rPositivas[numero]+ePositivas[numero]);
            System.out.println("2. " + rNegativas[numero]+eNegativas[numero]);
        } else {
            System.out.println(nombre + " os dice...");
            System.out.println(mensajes[numero]);
            System.out.println("");
            System.out.println("1. " + rPositivas[numero]);
            System.out.println("2. " + rNegativas[numero]);
        }
    }

    public int[] formaModificada(int[] i, int f, int p) {
        int[] res = new int[i.length];
        for (int j = 0; j < i.length; j++) {
            res[j] = i[j] / f + p;
        }
        return res;
    }

    public void dibujarCara(Graphics G, Color piel, Color ojos, int fX, int fY, int pX, int pY) {
        int[] caraX = {400, 800, 800, 650, 550, 400};
        int[] caraY = {150, 150, 450, 550, 550, 450};
        caraX = formaModificada(caraX, fX, pX);
        caraY = formaModificada(caraY, fY, pY);
        G.setColor(piel);
        G.fillPolygon(caraX, caraY, caraX.length);

        int[] ojoDerX = {525, 550, 525, 500};
        int[] ojoDerY = {250, 300, 350, 300};
        int[] ojoIzqX = {675, 700, 675, 650};
        int[] ojoIzqY = {250, 300, 350, 300};
        ojoDerX = formaModificada(ojoDerX, fX, pX);
        ojoDerY = formaModificada(ojoDerY, fY, pY);
        ojoIzqX = formaModificada(ojoIzqX, fX, pX);
        ojoIzqY = formaModificada(ojoIzqY, fY, pY);
        G.setColor(ojos);
        G.fillPolygon(ojoDerX, ojoDerY, ojoDerX.length);
        G.fillPolygon(ojoIzqX, ojoIzqY, ojoIzqX.length);
    }

    public void dibujar(Graphics G) {
    }
}
