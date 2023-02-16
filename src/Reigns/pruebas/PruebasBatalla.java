
package Reigns.pruebas;

import Reigns.clases.Batalla;
import Reigns.clases.Conquistador;
import Reigns.clases.Rey;
import java.util.Random;
import java.util.Scanner;

public class PruebasBatalla {
    public static void main(String[] args) {
        Rey R = new Rey();
        Conquistador Q = new Conquistador();
        Batalla B = new Batalla(Q,R);
        boolean batallaActiva = true;
        while(batallaActiva){
            R.alv();
            System.out.println(B.getPosRey()+" "+B.getPosEne());
            B.ToString();
            boolean resp = false;
            boolean a = true;
            while (a) {
                String res = new Scanner(System.in).nextLine();
                if (res.equals("1")) {
                    B.ReyAtaca();
                    a = false;
                } else if (res.equals("2")) {
                    B.ReyDefen();
                    a = false;
                } else if (res.equals("3")){
                    B.ReyCarga();
                    a = false;
                }
            }
            int movEne = new Random().nextInt(3);
            if(movEne==0){
                B.EneAtaca();
            } else if(movEne==1){
                B.EneDefen();
            } else if(movEne==2){
                B.EneCarga();
            }
            
            B.Accion(B.rA(), B.rD(), B.rC(), B.eA(), B.eD(), B.eC());
            
            if(B.batallaAcabada()){
                batallaActiva=false;
                R.alv();
                if(B.getRes()==1){
                    System.out.println("¡Habéis perdido!");
                }else if(B.getRes()==2){
                    System.out.println("¡Habéis ganado!");
                }
            }
        }
    }
}