
package Reigns.juego;

import Reigns.clases.*;
import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Rey R = new Rey();
        Reina Rei = new Reina();
        General Gen = new General();
        Extraño Ext = new Extraño();
        Medico Med = new Medico();
        Ramera Ram = new Ramera();
        Cardenal Car = new Cardenal();
        Personaje[] corte = {Rei, Gen, Ext, Med, Ram, Car};
        boolean repetir = true;
        boolean pruebaPersonaje = true;

        while (repetir) {

            Personaje P = corte[new Random().nextInt(corte.length)];
            int b = P.getNumMensajes();
            int c = new Random().nextInt(b);
            P.setNumero(c);
            
            /*
            PRUEBAS DE PERSONAJE ESPECÍFICO
            
            if(pruebaPersonaje){
                P = corte[3];
                P.setNumero(3);
                pruebaPersonaje = false;
            }
            */
            
            
            R.alv();
            
            R.ToString();
            System.out.println("");
            P.ToString(R);
            boolean resp = false;
            boolean a = true;
            while (a) {
                int res = new Scanner(System.in).nextInt();
                if (res == 1) {
                    resp = true;
                    a = false;
                } else if (res == 2) {
                    resp = false;
                    a = false;
                }
            }
            P.aplicar(resp, R);
            R.añadirAño();

            if (R.Muerto()!=0) {
                R.alv();
                R.fraseMuerto();
                repetir=false;
            }
        }
    }
}
