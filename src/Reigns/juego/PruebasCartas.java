
package Reigns.juego;

import Reigns.clases.Baraja;

public class PruebasCartas {
    public static void main(String[] args) {
        Baraja B = new Baraja();
        B.Barajar();
        for(int i = 0 ; i<75 ; i++){
            System.out.print(B.getCartasDisponibles());
            System.out.println(" "+B.sacarCarta());
            
        }
    }
}
