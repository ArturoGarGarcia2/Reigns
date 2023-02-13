
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Cardenal extends Personaje{
    public Cardenal() {
        super("El Cardenal", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"La Santa Madre Iglesia os necesita",
                                              "El pueblo está perdiendo la fe",
                                              "El diezmo no se está recaudando"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Y yo le respondo",
                                                "Haré que la recuperen",
                                                "Me encargaré de ello"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Bien por ella",
                                                "Dejadlos en paz",
                                                "Es una lástima"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Igl +30 / Eje -15",
                                                ": Igl +20 / Pob -20",
                                                ": Igl +30 / Eco -20"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Igl -10 / Eje +10",
                                                ": Igl -20 / Pob +20",
                                                ": Igl -30 / Eco +20"};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 30, 0, -15, 0, 0, res, 0, -10, 0, 10, 0, 0);
            case 1 -> R.añadir(0, 20, -20, 0, 0, 0, res, 0, -20, 20, 0, 0, 0);
            case 2 -> R.añadir(0, 30, 0, 0, -20, 0, res, 0, -30, 0, 0, 20, 0);
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