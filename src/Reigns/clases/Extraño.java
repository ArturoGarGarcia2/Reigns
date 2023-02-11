
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Extraño extends Personaje{
    
    public Extraño() {
        super("???", 0,
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
    
    public void dibujar(Graphics G){
        int fX = 2;
        int fY = 2;
        int pX = 340;
        int pY = 100;
        dibujarCara(G,new Color(0,0,0),new Color(255,255,255),fX,fY,pX,pY);
    }
}
