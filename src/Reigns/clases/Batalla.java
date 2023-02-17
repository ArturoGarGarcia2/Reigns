
package Reigns.clases;

import java.util.Random;

public class Batalla {
    private Personaje ene;
    private Rey rey;
    private boolean cargaRey;
    private boolean cargaEne;
    private int posRey;
    private int posEne;
    
    private boolean reyAtacando;
    private boolean eneAtacando;
    private boolean reyDefendiendo;
    private boolean eneDefendiendo;
    private boolean reyCargando;
    private boolean eneCargando;
    
    private int resultado;
    
    public Batalla(Personaje ene, Rey rey) {
        this.ene = ene;
        this.rey = rey;
        cargaRey = false;
        cargaEne = false;
        posRey = 3;
        posEne = 5;
        reyAtacando = false;
        eneAtacando = false;
        reyDefendiendo = false;
        eneDefendiendo = false;
        reyCargando = false;
        eneCargando = false;
        
    }
    
    public String getMensajeRandom(){
        String[] m = {"Voy a atacar ahora","Vais a caer","¡Rendíos ante mí!","Voy a defender","Voy a cargar"};
        int a = new Random().nextInt(m.length);
        return m[a];
    }

    public boolean rA() {
        return reyAtacando;
    }
    public boolean eA() {
        return eneAtacando;
    }
    public boolean rD() {
        return reyDefendiendo;
    }
    public boolean eD() {
        return eneDefendiendo;
    }
    public boolean rC() {
        return reyCargando;
    }
    public boolean eC() {
        return eneCargando;
    }

    public int getPosRey() {
        return posRey;
    }

    public int getPosEne() {
        return posEne;
    }
    
    
    public int cargas(){
        int res = 0;
        if(cargaRey){
            res+=1;
        }
        if(cargaEne){
            res+=2;
        }
        return res;
    }
    
    public int getRes(){
        return resultado;
    }
    
    
    public boolean batallaAcabada(){
        if(posRey==0){
            resultado = 1;
        }
        if(posEne==8){
            resultado = 2;
        }
        return posRey==0||posEne==8;
    }
    
    public void ToString(){
        System.out.println("Defendeos del ataque de "+ene.getNombre());
        System.out.println("");
        System.out.println("");
        switch (cargas()) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("¡Podéis atacar!");
                break;
            case 2:
                System.out.println("¡"+ene.getNombre()+" ha preparado un ataque!");
                break;
            case 3:
                System.out.println("¡Podéis atacaros mutuamente!");
                break;
            default:
                break;
        }
        for(int i = 1 ; i<8 ; i++){
            String a = posRey==i? "R" :
                       posEne==i? "E" : "_";
            System.out.print(a+" ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println(ene.getNombre()+" os dice...");
        System.out.println(getMensajeRandom());
        System.out.println("");
        System.out.println("""
                           1. Atacar
                           2. Defender
                           3. Cargar""");
        
    }
    
    public void Accion(boolean rA, boolean rD, boolean rC, boolean eA, boolean eD, boolean eC){
        boolean sepa = (posEne-posRey)<=2;
        if(rA&&eA){
            if(cargaRey&&cargaEne&&sepa){
                cargaRey=false;
                cargaEne=false;
            }else if(cargaRey&&!cargaEne&&sepa){
                cargaRey=false;
                posEne++;
            }else if(!cargaRey&&cargaEne&&sepa){
                cargaEne=false;
                posRey--;
            }
        }else if(rA&&eD&&sepa){
            if(cargaRey){
                cargaRey=false;
            }else{
                posEne--;
                Separar();
            }
        }else if(eA&&rD&&sepa){
            if(cargaEne){
                cargaEne=false;
            }else{
                posRey++;
                Separar();
            }
        }else if(rA&&eC&&sepa){
            if(cargaRey){
                cargaRey=false;
                cargaEne=true;
                posEne++;
            }else{
                cargaEne=true;
            }
        }else if(eA&&rC&&sepa){
            if(cargaEne){
                cargaEne=false;
                cargaRey=true;
                posRey--;
            }else{
                cargaRey=true;
            }
        }else if(rD&&eD){
            posRey++;
            posEne--;
            Separar();
        }else if(rD&&eC){
            cargaEne=true;
            Separar();
        }else if(eD&&rC){
            cargaRey=true;
            Separar();
        }else if(rC&&eC){
            cargaRey=true;
            cargaEne=true;
        }
    }
    
    public void Separar(){
        if(posRey>=posEne){
            if(posEne>5){
                posRey--;
            }else if(posRey<3){
                posEne++;
            }else{
                posRey--;
                posEne++;
            }
        }
    }
    
    public void ReyAtaca(){
        reyAtacando=true;
        reyDefendiendo=false;
        reyCargando=false;
    }
    public void EneAtaca(){
        eneAtacando=true;
        eneDefendiendo=false;
        eneCargando=false;
    }
    public void ReyDefen(){
        reyAtacando=false;
        reyDefendiendo=true;
        reyCargando=false;
    }
    public void EneDefen(){
        eneAtacando=false;
        eneDefendiendo=true;
        eneCargando=false;
    }
    public void ReyCarga(){
        reyAtacando=false;
        reyDefendiendo=false;
        reyCargando=true;
    }
    public void EneCarga(){
        eneAtacando=false;
        eneDefendiendo=false;
        eneCargando=true;
    }
}