
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Medico extends Personaje{
    public Medico() {
        super("El Médico", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"La población está enferma, necesito más recursos",
                             "Necesito vuestro permiso para poder experimentar",
                             "Algunos de vuestros soldados necesitan descansar",
                             "Estoy trabajando en un unguento, ¿Queréis probarlo?"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Tomad cuanto necesitéis",
                                                "Y yo os lo doy",
                                                "Tenéis razón",
                                                "Sí"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Que se unten aceite en los pies",
                                                "No me convence",
                                                "Son fuertes",
                                                "No"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Pob +25 / Eco -25",
                                                ": Pob +25 / Igl -25",
                                                ": Pob +25 / Eje -25",
                                                ""};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Pob -25 / Eco +10",
                                                ": Pob -25 / Igl +25",
                                                ": Pob -25 / Eje +25",
                                                ""};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 25, 0, -25, 0, res, 0, 0, -25, 0, 10, 0);
            case 1 -> R.añadir(0, -25, 25, 0, 0, 0, res, 0, 25, -25, 0, 0, 0);
            case 2 -> R.añadir(0, 0, 25, -25, 0, 0, res, 0, 0, -25, 25, 0, 0);
            case 3 -> {
                if(res){
                    R.setClarividencia(true);
                    R.setApelativo(", el Clarividente");
                }else{
                    System.out.println("A");
                }
            }
            default -> {
            }
        }
    }
    
    public void dibujar(Graphics G){
        int fX = 2;
        int fY = 2;
        int pX = 340;
        int pY = 100;
        dibujarCara(G,new Color(224,172,105),new Color(100,148,143),fX,fY,pX,pY);
        
//        int[] ojoDerX = {525, 550, 525, 500};
//        int[] ojoDerY = {250, 300, 350, 300};
//        int[] ojoIzqX = {675, 700, 675, 650};
//        int[] ojoIzqY = {250, 300, 350, 300};
        
        int[] gafasIzqX = {450,475,500,550,575,600,550,500};
        int[] gafasIzqY = {325,325,375,375,325,325,400,400};
        gafasIzqX = formaModificada(gafasIzqX, fX, pX);
        gafasIzqY = formaModificada(gafasIzqY, fY, pY);
        int[] gafasDerX = {600,625,650,700,725,750,700,650};
        int[] gafasDerY = {325,325,375,375,325,325,400,400};
        gafasDerX = formaModificada(gafasDerX, fX, pX);
        gafasDerY = formaModificada(gafasDerY, fY, pY);
        
        int[] patillaIzqX = {400,475,475,400};
        int[] patillaIzqY = {300,300,325,325};
        patillaIzqX = formaModificada(patillaIzqX, fX, pX);
        patillaIzqY = formaModificada(patillaIzqY, fY, pY);
        int[] patillaDerX = {725,800,800,725};
        int[] patillaDerY = {300,300,325,325};
        patillaDerX = formaModificada(patillaDerX, fX, pX);
        patillaDerY = formaModificada(patillaDerY, fY, pY);
        G.setColor(new Color(0,0,0));
        G.fillPolygon(gafasIzqX, gafasIzqY, gafasIzqX.length);
        G.fillPolygon(gafasDerX, gafasDerY, gafasDerX.length);
        G.fillPolygon(patillaIzqX, patillaIzqY, patillaIzqX.length);
        G.fillPolygon(patillaDerX, patillaDerY, patillaDerX.length);
        
        int[] barbaX = {400,550,650,800,800,650,550,400};
        int[] barbaY = {325,450,450,325,450,550,550,450};
        barbaX = formaModificada(barbaX, fX, pX);
        barbaY = formaModificada(barbaY, fY, pY);
        G.setColor(new Color(51,51,51));
        G.fillPolygon(barbaX, barbaY, barbaX.length);
    }
}