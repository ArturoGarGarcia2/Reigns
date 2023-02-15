
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Princesa extends Personaje{
    public Princesa() {
        super("La Princesa", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"Necesito cambiar mis aposentos",
                                              "Me he comprometido con el príncipe del reino vecino",
                                              "No sé a qué dedicarme cuando crezca"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Cámbialos a tu gusto",
                                                "Cedo tu mano",
                                                "Ya tendrás tiempo para decidir"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Está bien así",
                                                "Te quedas aquí",
                                                "El convento está aquí al lado"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Pob +10 / Eco -25",
                                                ": Eje +15 / Igl +20 / Eco -5",
                                                ": Pob +15 / Igl -10 / Eco -5"};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Pob -5 / Eco -5",
                                                ": Eje -10 / Igl -15 / Eco -5",
                                                ": Igl +25 / Eco -5"};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 10, 0, -25, 0, res, 0, 0, -5, 0, -5, 0);
            case 1 -> R.añadir(0, 20, 0, 15, -5, 0, res, 0, -15, 0, -10, -5, 0);
            case 2 -> R.añadir(0, -10, 15, 0, -5, 0, res, 0, 25, 0, 0, -5, 0);
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