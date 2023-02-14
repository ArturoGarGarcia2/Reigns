
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Aventurero extends Personaje{
    public Aventurero() {
        super("El Aventurero", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"Su majestad, hemos encontrado unas mazmorras, ¿queréis verlas?"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Preparad a los caballos"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Desisto"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {""};
        setePositivas(ePositivas);
        
        String[] eNegativas = {""};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> {}
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