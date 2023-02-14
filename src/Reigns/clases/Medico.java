
package Reigns.clases;

import java.awt.Color;
import java.awt.Graphics;

public class Medico extends Personaje{
    public Medico() {
        super("El Médico", 0);
        cargarFrases();
    }
    
    public void cargarFrases(){
        String[] mensajes = {"La población está enferma, necesito más recursos",
                             "Necesito vuestro permiso para poder experimentar",
                             "Algunos de vuestros soldados necesitan descansar",
                             "Estoy trabajando en un unguento, ¿Queréis probarlo?"};
        setMensajes(mensajes);
        
        String[] rPositivas = {"Tomad cuanto necesitéis",
                                                "Y yo os lo doy",
                                                "Tenéis razón",
                                                "Sí"};
        setrPositivas(rPositivas);
        
        String[] rNegativas = {"Que se unten aceite en los pies",
                                                "No me convence",
                                                "Son fuertes",
                                                "No"};
        setrNegativas(rNegativas);
        
        String[] ePositivas = {": Pob +25 / Eco -25",
                                                ": Pob +25 / Igl -25",
                                                ": Pob +25 / Eje -25",
                                                ""};
        setePositivas(ePositivas);
        
        String[] eNegativas = {": Pob -25 / Eco +10",
                                                ": Pob -25 / Igl +25",
                                                ": Pob -25 / Eje +25",
                                                ""};
        seteNegativas(eNegativas);
    }
    
    @Override
    public void aplicar(boolean res,Rey R){
        switch (getNumero()) {
            case 0 -> R.añadir(0, 0, 25, 0, -25, 0, res, 0, 0, -25, 0, 10, 0);
            case 1 -> R.añadir(0, -25, 25, 0, 0, 0, res, 0, 25, -25, 0, 0, 0);
            case 2 -> R.añadir(0, 0, 25, -25, 0, 0, res, 0, 0, -25, 25, 0, 0);
            case 3 -> {
                if(res){
                    R.setClarividencia(true);
                    R.setApelativo(", el Clarividente");
                }else{
                    System.out.println("A");
                }
            }
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