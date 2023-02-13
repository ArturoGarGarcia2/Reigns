
package Reigns.clases;

public class Mazmorra {
    private int[] pos;
    private boolean mercurio;
    private int[] posMercurio = {2,6};
    
    private boolean venus;
    private int[] posVenus = {2,4};
    
    private boolean marte;
    private int[] posMarte = {2,2};
    
    private boolean jupiter;
    private int[] posJupiter = {4,6};
    
    private boolean saturno;
    private int[] posSaturno = {4,4};
    
    private boolean urano;
    private int[] posUrano = {4,2};
    
    private boolean neptuno;
    private int[] posNeptuno = {6,6};
    
    private boolean luna;
    private int[] posLuna = {6,4};
    
    private boolean sol;
    private int[] posSol = {6,2};
    
    
    public Mazmorra(){
        int[] a = {1,4};
        int[] b = {6,2};
        pos = b;
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
    }
    
    public void ToString(){
        for(int i = 0 ; i<7 ; i++){
            for(int j = 0 ; j<7 ; j++){
                System.out.print("##### ");
            }
            System.out.println("");
            for(int j = 0 ; j<7 ; j++){
                int[] a = {i+1,j+1};
                String L = a[0]==posMercurio[0]&&a[1]==posMercurio[1]&&mercurio? "V" :
                           a[0]==posVenus[0]&&a[1]==posVenus[1]&&venus? "m" :
                           a[0]==posMarte[0]&&a[1]==posMarte[1]&&marte? "M" :
                           a[0]==posJupiter[0]&&a[1]==posJupiter[1]&&jupiter? "J" :
                           a[0]==posSaturno[0]&&a[1]==posSaturno[1]&&saturno? "s" :
                           a[0]==posUrano[0]&&a[1]==posUrano[1]&&urano? "U" :
                           a[0]==posNeptuno[0]&&a[1]==posNeptuno[1]&&neptuno? "N" :
                           a[0]==posLuna[0]&&a[1]==posLuna[1]&&luna? "L" :
                           a[0]==posSol[0]&&a[1]==posSol[1]&&sol? "S" : "?";
                           
                System.out.print("# "+L+" # ");
            }
            System.out.println("");
            for(int j = 0 ; j<7 ; j++){
                System.out.print("##### ");
            }
            System.out.println("");
            System.out.println("");
        }
    }
}