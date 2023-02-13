
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Ramera extends Personaje{
    public Ramera() {
        super("La Ramera", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"Os veo muy tenso...",
                                              "¿Queréis que anime al pueblo?",
                                              "Mi burdel se está yendo a pique"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Tienes razón",
                                                "Sí",
                                                "Ya no"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Imaginaciones vuestras",
                                                "No",
                                                "Problema vuestro"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Igl -35 / Pob -15 / Eje -15 / Eco -15 / ",
                                                ": Pob +10 / Igl -20",
                                                ": Pob 10 / Eco -15 / Igl -30"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Igl +25",
                                                ": Igl +20",
                                                ": Igl +20"};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, -35, -15, -15, -15, 0, res, 0, 25, 0, 0, 0, 0);
            case 1 -> R.añadir(0, -20, 10, 0, 0, 0, res, 0, 20, 0, 0, 0, 0);
            case 2 -> R.añadir(0, -30, 10, 0, -30, 0, res, 0, 20, 0, 0, 0, 0);
            default -> {
            }
        }
    }
    
    public void dibujar(Graphics G){
        int fX = 2;
        int fY = 2;
        int pX = 340;
        int pY = 100;
        dibujarCara(G,new Color(255, 219, 172),new Color(0,0,0),fX,fY,pX,pY);
    }
}