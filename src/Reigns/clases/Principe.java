
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Principe extends Personaje{
    public Principe() {
        super("El Príncipe", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"El pelaje de mi caballo está perdiendo brillo",
                                              "Mi cuartel está escaso de personal",
                                              "La cruzada me llama la atención"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Busca un buen lavativo",
                                                "Alista a la población",
                                                "Aprende sus métodos"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Deja de quejarte",
                                                "Entrena mejor a tus hombres",
                                                "Céntrate en el reino"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Eje +10 / Eco -20",
                                                ": Eje +20 / Pob -15 / Eco -15",
                                                ": Eje +15 / Igl +10 / Eco -5"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Eje -10 / Eco -5",
                                                ": Eje +5 / Eco -5",
                                                ": Eje +10 / Igl -10 / Eco -5"};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 0, 10, -20, 0, res, 0, 0, 0, -10, -5, 0);
            case 1 -> R.añadir(0, 0, -15, 20, -15, 0, res, 0, 0, 0, 5, -5, 0);
            case 2 -> R.añadir(0, 10, 0, 15, -5, 0, res, 0, -10, 0, 10, -5, 0);
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