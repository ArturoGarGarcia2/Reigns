
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;

public class General extends Personaje{

    public General() {
        super("El General", 0,
                new String[] {},
                new String[] {},
                new String[] {},
                new String[] {},
                new String[] {},
                
                new String[] {},
                new String[] {},
                new String[] {},
                new String[] {},
                new String[] {}
        );
    }
    
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 0, 15, -15, 0, res, 0, 0, 0, -15, 0, 0);
            case 1 -> R.añadir(0, 0, 0, -15, -20, 0, res, 0, 0, -20, -15, 0, 0);
            case 2 -> R.añadir(0, -10, 0, 10, -30, 0, res, 0, +10, 0, -20, 0, 0);
            default -> {
            }
        }
    }
    
    public void dibujar(Graphics G){
        int fX = 2;
        int fY = 2;
        int pX = 340;
        int pY = 100;
        dibujarCara(G,new Color(241,194,125),new Color(0,0,0),fX,fY,pX,pY);
        
        int[] yelmoX = {600,825,850,850,800,800,600,400,400,350,350,375};
        int[] yelmoY = {050,100,200,400,400,200,250,200,400,400,200,100};
        yelmoX = formaModificada(yelmoX, fX, pX);
        yelmoY = formaModificada(yelmoY, fY, pY);
        G.setColor(Color.gray);
        G.fillPolygon(yelmoX, yelmoY, yelmoX.length);
        
        int[] hueco1X = {590,610,610,590};
        int[] hueco1Y = {100,100,200,200};
        hueco1X = formaModificada(hueco1X, fX, pX);
        hueco1Y = formaModificada(hueco1Y, fY, pY);
        int[] hueco2X = {530,550,550,530};
        int[] hueco2Y = {105,105,195,195};
        hueco2X = formaModificada(hueco2X, fX, pX);
        hueco2Y = formaModificada(hueco2Y, fY, pY);
        int[] hueco3X = {650,670,670,650};
        int[] hueco3Y = {105,105,195,195};
        hueco3X = formaModificada(hueco3X, fX, pX);
        hueco3Y = formaModificada(hueco3Y, fY, pY);
        int[] hueco4X = {470,490,490,470};
        int[] hueco4Y = {115,115,185,185};
        hueco4X = formaModificada(hueco4X, fX, pX);
        hueco4Y = formaModificada(hueco4Y, fY, pY);
        int[] hueco5X = {710,730,730,710};
        int[] hueco5Y = {115,115,185,185};
        hueco5X = formaModificada(hueco5X, fX, pX);
        hueco5Y = formaModificada(hueco5Y, fY, pY);
        G.setColor(Color.BLACK);
        G.fillPolygon(hueco1X, hueco1Y, hueco1X.length);
        G.fillPolygon(hueco2X, hueco2Y, hueco2X.length);
        G.fillPolygon(hueco3X, hueco3Y, hueco3X.length);
        G.fillPolygon(hueco4X, hueco4Y, hueco4X.length);
        G.fillPolygon(hueco5X, hueco5Y, hueco5X.length);
    }
}