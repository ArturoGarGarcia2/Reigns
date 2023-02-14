
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Burgues extends Personaje{
    public Burgues() {
        super("El Burgués", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"Tengo una oferta jugosa para vos",
                                              "Os traigo mis impuestos",
                                              "Quisiera compraros terrenos"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Acepto",
                                                "Gracias",
                                                "Acepto"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Marchaos",
                                                "Gracias",
                                                "No gracias"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Eco +30 / Eje -15",
                                                ": Eco +30",
                                                ": Eco +30 / Pob -20"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Eco -10 / Eje +20",
                                                ": Eco +30",
                                                ": Eco -15 / Pob +20"}; 
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 0, -15, 30, 0, res, 0, 0, 0, 20, -10, 0);
            case 1 -> R.añadir(0, 0, 0, 0, 30, 0, res, 0, 0, 0, 0, 30, 0);
            case 2 -> R.añadir(0, 0, -20, 0, 30, 0, res, 0, 0, 20, 0, -15, 0);
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