package Reigns.juego;

import Reigns.clases.Mazmorra;
import Reigns.clases.Rey;
import java.util.Scanner;

public class Pruebas2 {

    public static void main(String[] args) {
        Mazmorra m = new Mazmorra();
        Rey R = new Rey();
        while (true) {
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
        }
    }
}