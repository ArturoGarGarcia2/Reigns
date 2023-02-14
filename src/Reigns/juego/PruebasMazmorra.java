package Reigns.juego;

import Reigns.clases.Mazmorra;
import Reigns.clases.Rey;
import java.util.Scanner;

public class PruebasMazmorra {
    public static void main(String[] args) {
        Rey R = new Rey();
        Mazmorra m = new Mazmorra(R);
        boolean mActiva = true;
        while (mActiva) {
            R.alv();
            m.ToString();
            boolean a = true;
            while (a) {
                int res = new Scanner(System.in).nextInt();
                switch (res) {
                    case 1 -> {
                        m.mover(0, 1);
                        a = false;
                    }
                    case 2 -> {
                        m.mover(1, 0);
                        a = false;
                    }
                    case 3 -> {
                        m.mover(0, -1);
                        a = false;
                    }
                    case 4 -> {
                        m.mover(-1, 0);
                        a = false;
                    }
                    default -> {
                    }
                }
            }
            m.detectarPos();
            
            if(R.Muerto()!=0){
                R.alv();
                R.fraseMuerto();
                mActiva = false;
            }
        }
    }
}