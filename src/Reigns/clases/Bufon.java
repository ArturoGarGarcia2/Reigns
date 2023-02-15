
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Bufon extends Personaje{
    public Bufon() {
        super("El Bufón", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"El pueblo está muy aburrido ¡Deberíamos divertirlos!",
                                              "¡Vengo a enseñaros este nuevo truco de magia!",
                                              "Tengo cajas sorpresa que pueden interesaros"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Me agrada la idea",
                                                "Seguid practicando",
                                                "Dejádmelas"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"No están tan mal",
                                                "Suficiente",
                                                "Vale"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Pob +25 / Eco -15 / Igl -15",
                                                ": Pob +10 / Igl -15",
                                                ": Eje +10 / Igl -15"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Pob -15 / Eco +15 / Igl +5",
                                                ": Pob -10 / Igl +5",
                                                ": Eje -15 / Igl +5"}; 
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, -15, 25, 0, -15, 0, res, 0, 5, -15, 0, 15, 0);
            case 1 -> R.añadir(0, -15, 10, 0, 0, 0, res, 0, 5, -10, 0, 0, 0);
            case 2 -> R.añadir(0, -15, 0, 10, 0, 0, res, 0, 5, 0, -15, 0, 0);
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