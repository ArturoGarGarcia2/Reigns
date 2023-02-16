package Reigns.juego;

import Reigns.clases.*;
import java.awt.List;
import java.util.ArrayList;
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
        Campesino Cam = new Campesino();
        Burgues Bur = new Burgues();
        Aventurero Ave = new Aventurero();
        Bufon Buf = new Bufon();
        Emisario Emi = new Emisario();
        Princesa PriA = new Princesa();
        Principe PriE = new Principe();
        Pitonisa Pit = new Pitonisa();
        Personaje[] corte = {Rei, Gen, Ext, Med, Ram, Car, Cam, Bur, Ave, Buf, Emi, PriA, PriE, Pit};
        //                    0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10, 11 , 12 , 13
        boolean repetir = true;
        boolean pruebaPersonaje = true;

        while (repetir) {

            int personajeSalido = new Random().nextInt(corte.length);
            Personaje P = corte[personajeSalido];
            int b = P.getNumMensajes();
            int c = new Random().nextInt(b);
            P.setNumero(c);

            /*
            PRUEBAS DE PERSONAJE ESPECÍFICO
            
            if (pruebaPersonaje) {
                personajeSalido = 8;
                P = corte[8];
                P.setNumero(0);
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
                String res = new Scanner(System.in).nextLine();
                if (res.equals("1")) {
                    resp = true;
                    a = false;
                } else if (res.equals("2")) {
                    resp = false;
                    a = false;
                }
            }
            P.aplicar(resp, R);
            if (P instanceof Pitonisa pit && resp) {
                if (!pit.getBaraja().isEmpty()) {
                    R.alv();
                    Carta C = pit.sacarCarta();
                    pit.aplicarCarta(R, C);
                    R.ToString();
                    System.out.println("");
                    System.out.println("La Pitonisa os dice...");
                    System.out.println("Os ha salido " + C.getNombre());
                    if (C.getNumero() > 10) {
                        System.out.println("Habéis tenido suerte, pues esta carta aún es inútil");
                    }
                    System.out.println("");
                    System.out.println("1. Ya veo");
                    System.out.println("2. Está bien");
                    boolean pitR = true;
                    while (pitR) {
                        String res = new Scanner(System.in).nextLine();
                        if (res.equals("1")) {
                            resp = true;
                            pitR = false;
                        } else if (res.equals("2")) {
                            resp = false;
                            pitR = false;
                        }
                    }
                } else {
                    R.alv();
                    R.ToString();
                    System.out.println("");
                    System.out.println("La Pitonisa os dice...");
                    System.out.println("Mi baraja se ha vaciado, no puedo serviros");
                    System.out.println("");
                    System.out.println("1. Ya veo");
                    System.out.println("2. Está bien");
                    boolean pitR = true;
                    while (pitR) {
                        int res = new Scanner(System.in).nextInt();
                        if (res == 1) {
                            resp = true;
                            pitR = false;
                        } else if (res == 2) {
                            resp = false;
                            pitR = false;
                        }
                    }
                }
            }

            if (P instanceof Aventurero && resp) {
                Mazmorra m = new Mazmorra(R);
                boolean mActiva = true;
                while (mActiva) {
                    R.alv();
                    m.ToString();
                    boolean respMaz = true;
                    while (respMaz) {
                        String res = new Scanner(System.in).nextLine();
                        switch (res) {
                            case "1" -> {
                                m.mover(0, 1);
                                respMaz = false;
                            }
                            case "2" -> {
                                m.mover(1, 0);
                                respMaz = false;
                            }
                            case "3" -> {
                                m.mover(0, -1);
                                respMaz = false;
                            }
                            case "4" -> {
                                m.mover(-1, 0);
                                respMaz = false;
                            }
                            default -> {
                            }
                        }
                    }
                    m.detectarPos();
                    if (R.Muerto() != 0) {
                        mActiva = false;
                        R.Trampa();
                    } else if (m.mazmorraCompletada()) {
                        R.alv();
                        System.out.println("""
                                           Una vez pisado el último símbolo se aparece frente a vos
                                           la salida y detrás un espejo
                                           ¿Salís de la mazmorra u os acercáis al espejo?
                                           
                                           1. Salir de la mazmorra
                                           2. Ir al espejo
                                           """);
                        boolean fMaz = true;
                        while (fMaz) {
                            int res = new Scanner(System.in).nextInt();
                            if (res == 1) {
                                resp = true;
                                fMaz = false;
                            } else if (res == 2) {
                                resp = false;
                                fMaz = false;
                            }
                        }
                        if (resp) {
                            mActiva = false;
                            R.setApelativo(", el Impertérrito");

                        } else {
                            R.mazmorraCompleta();
                            mActiva = false;
                        }
                    }
                }
            }
            R.añadirAño();

            if (R.Muerto() != 0) {
                R.alv();
                R.fraseMuerto();
                repetir = false;
            }
        }
    }
}
