package Reigns.clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private List<Carta> cartas;

    public Baraja(boolean ordenado) {
        cartas = new ArrayList<>();
        String[] numero = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Lacayo", "Noble", "Guardián", "Reina", "Rey"};
        String[] palo = {" de Llaves", " de Cráneos", " de Dagas", " de Pentáculos", " de Nubes"};

        for (int i = 0; i < 75; i++) {
            Carta carta = new Carta((i%15),(i/15));
            cartas.add(carta);
        }
        if(!ordenado){
            Barajar();
        }
    }
    
    public List<Carta> getBaraja(){
        return cartas;
    }

    public void Barajar() {
        for(int i = 0 ; i<10 ; i++){
            Collections.shuffle(cartas);
        }
    }
    
    public Carta sacarCarta(){
        Carta c = cartas.get(0);
        cartas.remove(0);
        return c;
    }
    
    public int getCartasDisponibles(){
        return cartas.size();
    }
}
