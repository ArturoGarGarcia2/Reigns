
package Reigns.clases;

public class Carta {
    private String nombre;
    private int numero;
    private int palo;
    private static final String[] numeros = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Lacayo", "Noble", "Guardián", "Reina", "Rey"};
    private static final String[] palos = {" de Llaves", " de Cráneos", " de Dagas", " de Pentáculos", " de Nubes"};
    
    public Carta(int n,int p){
        numero = n+1;
        palo = p+1;
        nombre = numeros[n]+palos[p];
    }
    public String getNombre(){
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
    public int getPalo() {
        return palo;
    }
}