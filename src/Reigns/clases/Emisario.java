
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Emisario extends Personaje{
    public Emisario(){
        super("El Emisario", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"Os traigo obsequios de mi tierra",
                                              "Quisiera traer una figura que me haga sentir como en casa",
                                              "Mi país necesita gente que ayude a prosperar"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Muchas gracias",
                                                "Adelante",
                                                "Llevaos a quien se ofrezca"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"No los necesito",
                                                "Lo siento pero no",
                                                "No os puedo ayudar"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Eco +20 / Eje -10",
                                                ": Igl -15 / Eco +20 / Eje -5",
                                                ": Pob -20 / Eco +20 / Eje -5"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Eco -10 / Eje +5",
                                                ": Igl +15 / Eco -10",
                                                ": Pob +20 / Eco -20"}; 
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 0, -10, 20, 0, res, 0, 0, 0, 5, -10, 0);
            case 1 -> R.añadir(0, -15, 0, -5, 20, 0, res, 0, 15, 0, 0, -10, 0);
            case 2 -> R.añadir(0, 0, -20, -5, 20, 0, res, 0, 0, 20, 0, -20, 0);
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