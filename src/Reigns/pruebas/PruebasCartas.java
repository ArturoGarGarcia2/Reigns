package Reigns.pruebas;

import Reigns.clases.Baraja;
import Reigns.clases.Carta;

public class PruebasCartas {

    public static void main(String[] args) {
        Baraja B1 = new Baraja(true);
        for(int i = 0;i<75;i++){
            Carta c = B1.sacarCarta();
            System.out.print(c.getNumero()+"-"+c.getPalo()+" ");
            System.out.println(c.getNombre());
        }
    }
}
