
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Campesino extends Personaje{
    public Campesino() {
        super("El Campesino", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"Su majestad, no tenemos dinero para pagar los impuestos",
                                              "Su majestad, tenemos hambre",
                                              "Su majestad, no tenemos tiempo para ir a misa y trabajar"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Seré indulgente por ahora",
                                                "Pedid y se os dará",
                                                "Trabajad"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Panda de gandules",
                                                "Cultivad mejor la próxima vez",
                                                "Id a misa"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Pob +20 / Eco -15",
                                                ": Pob +15 / Eco -5",
                                                ": Pob +20 / Igl -15"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Pob -25 / Eco +10",
                                                ": Pob -20",
                                                ": Pob -15 / Igl +20"};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 20, 0, -15, 0, res, 0, 0, -25, 0, 10, 0);
            case 1 -> R.añadir(0, 0, 15, 0, -5, 0, res, 0, 0, -20, 0, 0, 0);
            case 2 -> R.añadir(0, -15, 20, 0, 0, 0, res, 0, 20, -15, 0, 0, 0);
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