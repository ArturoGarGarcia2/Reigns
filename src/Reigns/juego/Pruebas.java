package Reigns.juego;

import Reigns.clases.Extraño;
import Reigns.clases.General;
import Reigns.clases.Personaje;
import Reigns.clases.Reina;
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.FondoColorSolido;
import bpc.daw.consola.Teclado;
import java.awt.Graphics;

public class Pruebas {

    public static void main(String[] args) {
        Consola c = new Consola();
        CapaFondo cf = c.getCapaFondo();
        CapaCanvas cc = c.getCapaCanvas();
        Teclado t = c.getTeclado();
        Fondo f = new FondoColorSolido(0, 128, 128);
        Graphics G = cc.getGraphics();
        Personaje P = null;
        cf.setFondo(f);
        P = new Reina();
        P.dibujar(G);
        t.leerCaracter();
        P = new General();
        cc.cls();
        P.dibujar(G);
        t.leerCaracter();
        cc.cls();
        P = new Extraño();
        P.dibujar(G);
        t.leerCaracter();
    }
}
