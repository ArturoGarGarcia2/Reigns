
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Medico extends Personaje{
    public Medico() {
        super("El Médico", 0,
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
        dibujarCara(G,new Color(255, 219, 172),new Color(0,0,0),fX,fY,pX,pY);
    }
}