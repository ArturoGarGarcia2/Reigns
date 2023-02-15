package Reigns.clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private List<String> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] numero = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Lacayo", "Noble", "Guardián", "Reina", "Rey"};
        String[] palo = {" de Llaves", " de Cráneos", " de Dagas", " de Pentáculos", " de Nubes"};

        for (int i = 0; i < 75; i++) {
            String carta = "";
            carta += numero[i % 15];
            carta += palo[i / 15];
            cartas.add(carta);
        }
    }

    public void Barajar() {
        for(int i = 0 ; i<10 ; i++){
            Collections.shuffle(cartas);
        }
    }
    
    public String sacarCarta(){
        String a = cartas.get(0);
        cartas.remove(0);
        return a;
    }
    
    public int getCartasDisponibles(){
        return cartas.size();
    }
}
