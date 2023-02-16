package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pitonisa extends Personaje {
    private Baraja baraja;

    public Pitonisa() {
        super("La Pitonisa", 0);
        baraja = new Baraja(false);
        cargarFrases();
    }

    public void cargarFrases() {
        String[] mensajes = {"Vuestro futuro no está escrito sino por mis cartas"};
        setMensajes(mensajes);

        String[] rPositivas = {"Tenéis razón"};
        setrPositivas(rPositivas);

        String[] rNegativas = {"Marchaos"};
        setrNegativas(rNegativas);

        String[] ePositivas = {""};
        setePositivas(ePositivas);

        String[] eNegativas = {""};
        seteNegativas(eNegativas);
    }

    public String getMensajeEsp(int i) {
        return mensajesEsp[i];
    }

    public Carta sacarCarta() {
        return baraja.sacarCarta();
    }

    public void aplicarCarta(Rey R, Carta c) {
        if (c.getNumero() < 11) {
            if (c.getPalo() == 1) {
                R.setIgl(c.getNumero() * 10);
            } else if (c.getPalo() == 2) {
                R.setPob(c.getNumero() * 10);
            } else if (c.getPalo() == 3) {
                R.setEje(c.getNumero() * 10);
            } else if (c.getPalo() == 4) {
                R.setEco(c.getNumero() * 10);
            } else if (c.getPalo() == 5) {
                R.setOcu(c.getNumero() * 10);
            }
        }
    }
    
    public List<Carta> getBaraja(){
        return baraja.getBaraja();
    }

    @Override
    public void aplicar(boolean resp, Rey R) {
        switch (getNumero()) {
            case 0 -> {
            }
            default -> {
            }
        }
    }

    @Override
    public void dibujar(Graphics G) {
        int fX = 2;
        int fY = 2;
        int pX = 340;
        int pY = 100;
        dibujarCara(G, new Color(255, 219, 172), new Color(0, 0, 0), fX, fY, pX, pY);

        int[] peloX = {600, 800, 750, 900, 850, 600, 350, 300, 450, 400};
        int[] peloY = {150, 250, 650, 600, 150, 50, 150, 600, 650, 250};
        peloX = formaModificada(peloX, fX, pX);
        peloY = formaModificada(peloY, fY, pY);
        G.setColor(new Color(141, 85, 36));
        G.fillPolygon(peloX, peloY, peloX.length);

        int[] baseCoronaX = {425, 500, 600, 700, 775, 775, 600, 425};
        int[] baseCoronaY = {125, 125, 150, 125, 125, 075, 000, 075};
        baseCoronaX = formaModificada(baseCoronaX, fX, pX);
        baseCoronaY = formaModificada(baseCoronaY, fY, pY);
        G.setColor(new Color(255, 255, 0));
        G.fillPolygon(baseCoronaX, baseCoronaY, baseCoronaX.length);

        int[] joyaCoronaX = {600, 625, 625, 600, 575, 575};
        int[] joyaCoronaY = {25, 50, 100, 125, 100, 50};
        joyaCoronaX = formaModificada(joyaCoronaX, fX, pX);
        joyaCoronaY = formaModificada(joyaCoronaY, fY, pY);
        G.setColor(new Color(255, 0, 0));
        G.fillPolygon(joyaCoronaX, joyaCoronaY, joyaCoronaX.length);
    }
}
