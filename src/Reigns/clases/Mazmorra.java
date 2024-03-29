
package Reigns.clases;

public class Mazmorra {
    private int[] pos;
    private Rey rey;
    
    private int[][] sal = {{2,0},{5,0},{6,0},{0,1},{2,1},{3,2},{6,2},{2,3},{0,4},{3,4},{4,4},{6,5},{3,6},{5,6}};
    private boolean mercurio;
    private int[] posMercurio = {1,5};
    
    private boolean venus;
    private int[] posVenus = {1,3};
    
    private boolean marte;
    private int[] posMarte = {1,1};
    
    private boolean jupiter;
    private int[] posJupiter = {3,5};
    
    private boolean saturno;
    private int[] posSaturno = {3,3};
    
    private boolean urano;
    private int[] posUrano = {3,1};
    
    private boolean neptuno;
    private int[] posNeptuno = {5,5};
    
    private boolean luna;
    private int[] posLuna = {5,3};
    
    private boolean sol;
    private int[] posSol = {5,1};
    
    
    public Mazmorra(Rey r){
        rey = r;
        int[] a = {0,3};
        pos = a;
        mercurio = false;
        venus = false;
        marte = false;
        jupiter = false;
        saturno = false;
        urano = false;
        neptuno = false;
        luna = false;
        sol = false;
    }
    public int[] getPos(){
        return pos;
    }
    public void mover(int x, int y){
        pos[0]+=x;
        pos[1]+=y;
    }
    public boolean fuera(){
        boolean a = false;
        if(pos[0]<0 || pos[0]>7 || pos[1]<0 || pos[1]>7){
            a = true;
        }
        return a;
    }
    
    public void detectarPos(){
        if(pos[0]==posMercurio[0]&&pos[1]==posMercurio[1]){
            mercurio = true;
        }
        if(pos[0]==posVenus[0]&&pos[1]==posVenus[1]){
            venus = true;
        }
        if(pos[0]==posMarte[0]&&pos[1]==posMarte[1]){
            marte = true;
        }
        if(pos[0]==posJupiter[0]&&pos[1]==posJupiter[1]){
            jupiter = true;
        }
        if(pos[0]==posSaturno[0]&&pos[1]==posSaturno[1]){
            saturno = true;
        }
        if(pos[0]==posUrano[0]&&pos[1]==posUrano[1]){
            urano = true;
        }
        if(pos[0]==posNeptuno[0]&&pos[1]==posNeptuno[1]){
            neptuno = true;
        }
        if(pos[0]==posLuna[0]&&pos[1]==posLuna[1]){
            luna = true;
        }
        if(pos[0]==posSol[0]&&pos[1]==posSol[1]){
            sol = true;
        }
        if(pos[0]<0){
            pos[0]++;
        }
        if(pos[0]>6){
            pos[0]--;
        }
        if(pos[1]<0){
            pos[1]++;
        }
        if(pos[1]>6){
            pos[1]--;
        }
        for(int i = 0 ; i<sal.length ; i++){
            if(sal[i][0]==pos[0]&&sal[i][1]==pos[1]){
                rey.añadir(0, 0, 0, 0, 0, -35, true, 0, 0, 0, 0, 0, 0);
            }
        }
    }
    
    public void ToString(){
        System.out.println("Salud:");
        System.out.println(rey.SaludToString());
        System.out.println("");
        /*
        System.out.print("("+pos[0]+","+pos[1]+")");
        System.out.print("("+posMercurio[0]+","+posMercurio[1]+")");
        System.out.print("("+posVenus[0]+","+posVenus[1]+")");
        System.out.print("("+posMarte[0]+","+posMarte[1]+")");
        System.out.print("("+posJupiter[0]+","+posJupiter[1]+")");
        System.out.print("("+posSaturno[0]+","+posSaturno[1]+")");
        System.out.print("("+posUrano[0]+","+posUrano[1]+")");
        System.out.print("("+posNeptuno[0]+","+posNeptuno[1]+")");
        System.out.print("("+posLuna[0]+","+posLuna[1]+")");
        System.out.print("("+posSol[0]+","+posSol[1]+")");
        System.out.println("");
        */
        for(int i = 6 ; i>-1 ; i--){
            for(int j = 0 ; j<7 ; j++){
                System.out.print("##### ");
            }
            System.out.println("");
            for(int j = 0 ; j<7 ; j++){
                int[] a = {j,i};
                String L = a[0]==posMercurio[0]&&a[1]==posMercurio[1]&&mercurio? "V" :
                           a[0]==posVenus[0]&&a[1]==posVenus[1]&&venus? "m" :
                           a[0]==posMarte[0]&&a[1]==posMarte[1]&&marte? "M" :
                           a[0]==posJupiter[0]&&a[1]==posJupiter[1]&&jupiter? "J" :
                           a[0]==posSaturno[0]&&a[1]==posSaturno[1]&&saturno? "s" :
                           a[0]==posUrano[0]&&a[1]==posUrano[1]&&urano? "U" :
                           a[0]==posNeptuno[0]&&a[1]==posNeptuno[1]&&neptuno? "N" :
                           a[0]==posLuna[0]&&a[1]==posLuna[1]&&luna? "L" :
                           a[0]==posSol[0]&&a[1]==posSol[1]&&sol? "S" :
                           a[0]==pos[0]&&a[1]==pos[1]? "R" : " ";
                           
                System.out.print("# "+L+" # ");
            }
            System.out.println("");
            for(int j = 0 ; j<7 ; j++){
                System.out.print("##### ");
            }
            System.out.println("");
        }
    }
    
    public boolean mazmorraCompletada(){
        return mercurio&&venus&&marte&&jupiter&&saturno&&urano&&neptuno&&luna&&sol;
    }
}