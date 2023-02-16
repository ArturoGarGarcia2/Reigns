
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Extraño extends Personaje{
    
    public Extraño() {
        super("???", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"¿De qué queréis que me ocupe?",
                                              "¿De qué queréis que me ocupe?",
                                              "¿De qué queréis que me ocupe?",
                                              "¿De qué queréis que me ocupe?"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"De la Iglesia",
                                                "De la Población",
                                                "Del Ejército",
                                                "De la Economía"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"De la Economía",
                                                "De la Iglesia",
                                                "De la Población",
                                                "Del Ejército"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Igl =55",
                                                ": Pob =55",
                                                ": Eje =55",
                                                ": Eco =55"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Eco =55",
                                                ": Igl =55",
                                                ": Pob =55",
                                                ": Eje =55"};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, (-R.getIgl()+55), 0, 0, 0, 0, res, 0, 0, 0, 0, -R.getEco()+55, 0);
            case 1 -> R.añadir(0, 0, (-R.getPob()+55), 0, 0, 0, res, 0, -R.getIgl()+55, 0, 0, 0, 0);
            case 2 -> R.añadir(0, 0, 0, (-R.getEje()+55), 0, 0, res, 0, 0, -R.getPob()+55, 0, 0, 0);
            case 3 -> R.añadir(0, 0, 0, 0, (-R.getEco()+55), 0, res, 0, 0, 0, -R.getEje()+55, 0, 0);
            default -> {
            }
        }
    }
    
    public void dibujar(Graphics G){
        int fX = 2;
        int fY = 2;
        int pX = 340;
        int pY = 100;
        dibujarCara(G,new Color(0,0,0),new Color(255,255,255),fX,fY,pX,pY);
    }
}
