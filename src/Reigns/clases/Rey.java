
package Reigns.clases;

import java.util.Random;

public class Rey {

    private String nombre;
    private String apelativo;
    private int ocu;
    private int igl;
    private int pob;
    private int eje;
    private int eco;
    private int salud;
    private boolean clarividencia;
    private int años;
    private boolean trampa=false;
    private boolean mazmorraCompleta=false;

    public Rey() {
        String[] nombres = {"Argenis","Abarth","Auréllium","Árcturus","Astair","Fávro","Feltnos","Ferroz","Fénit","Kaenó","Kazrefti","Kolapsi","Kárthild","Vodbar","Zsolt","Závert","Zeldrie","Zósimo"};
        nombre = nombres[new Random().nextInt(nombres.length)];
        apelativo = "";
        ocu = 0;
        igl = 45;
        pob = 45;
        eje = 45;
        eco = 45;
        salud = 105;
    }
    
    public void añadirAño(){
        años++;
    }

    public int getIgl() {
        return igl;
    }
    public int getPob() {
        return pob;
    }
    public int getEje() {
        return eje;
    }
    public int getEco() {
        return eco;
    }
    public boolean clarividencia() {
        return clarividencia;
    }
    public void setClarividencia(boolean clarividencia) {
        this.clarividencia = clarividencia;
    }

    public void alv() {
        for (int i = 0; i < 105; i++) {
            System.out.println("");
        }
    }

    public void añadir(int Ocu, int Igl, int Pob, int Eje, int Eco, int Salud, boolean res, int nOcu, int nIgl, int nPob, int nEje, int nEco, int nSalud) {
        if (res) {
            ocu += Ocu;
            igl += Igl;
            pob += Pob;
            eje += Eje;
            eco += Eco;
            salud += Salud;
        } else {
            ocu += nOcu;
            igl += nIgl;
            pob += nPob;
            eje += nEje;
            eco += nEco;
            salud += nSalud;
        }
    }

    public void setOcu(int ocu) {
        this.ocu = ocu;
    }
    public void setIgl(int igl) {
        this.igl = igl;
    }
    public void setPob(int pob) {
        this.pob = pob;
    }
    public void setEje(int eje) {
        this.eje = eje;
    }
    public void setEco(int eco) {
        this.eco = eco;
    }
    
    public void setApelativo(String a){
        apelativo = a;
    }

    public void ToString() {
        /*
        System.out.println("Ocultismo: ");
        System.out.println(OcuToString());
        System.out.println("Salud: ");
        System.out.println(SaludToString());
        */
        System.out.println(nombre+apelativo);
        System.out.println("Año: "+(años+1309));
        System.out.println("");
        System.out.println("Iglesia: ");
        System.out.println(IglToString());
        System.out.println("Población: ");
        System.out.println(PobToString());
        System.out.println("Ejército: ");
        System.out.println(EjeToString());
        System.out.println("Economía: ");
        System.out.println(EcoToString());
    }

    public String OcuToString() {
        String L = "";
        int a = this.ocu / 5;
        int b = (105 - this.ocu) / 5;
        for (int j = 0; j < a; j++) {
            L += "*";
        }
        for (int j = 0; j < b; j++) {
            L += "-";
        }
        return L;
    }

    public String IglToString() {
        String L = "";
        int a = this.igl / 5;
        int b = (105 - this.igl) / 5;
        for (int j = 0; j < a; j++) {
            L += "*";
        }
        for (int j = 0; j < b; j++) {
            L += "-";
        }
        return L;
    }

    public String PobToString() {
        String L = "";
        int a = this.pob / 5;
        int b = (105 - this.pob) / 5;
        for (int j = 0; j < a; j++) {
            L += "*";
        }
        for (int j = 0; j < b; j++) {
            L += "-";
        }
        return L;
    }

    public String EjeToString() {
        String L = "";
        int a = this.eje / 5;
        int b = (105 - this.eje) / 5;
        for (int j = 0; j < a; j++) {
            L += "*";
        }
        for (int j = 0; j < b; j++) {
            L += "-";
        }
        return L;
    }

    public String EcoToString() {
        String L = "";
        int a = this.eco / 5;
        int b = (105 - this.eco) / 5;
        for (int j = 0; j < a; j++) {
            L += "*";
        }
        for (int j = 0; j < b; j++) {
            L += "-";
        }
        return L;
    }

    public String SaludToString() {
        String L = "";
        int a = this.salud / 5;
        int b = (105 - this.salud) / 5;
        for (int j = 0; j < a; j++) {
            L += "*";
        }
        for (int j = 0; j < b; j++) {
            L += "-";
        }
        return L;
    }

    public void fraseMuerto() {
        
        int muerte = Muerto();
        switch (muerte) {
            case 1 -> {
                System.out.println("""
                                   Vuestro reino ha sido víctima de vuestra megalomanía, habéis querido asir lo
                                   inasible condenando así a vuestro pueblo al infierno en vida, una vida que no
                                   pueden
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Oscuro");
                }
            }
            case 2 -> {
                System.out.println("""
                                   La iglesia os toma por insignificante,
                                   os han relevado de vuestros poderes,
                                   pasaréis el resto de vuestros días encerrado en las mazmorras
                                   mas vuestro nombre será recordado como mártir.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Mártir");
                }
            }
            case 3 -> {
                System.out.println("""
                                   La iglesia está demasiado enfadada con vuestros actos,
                                   os han execrado y han mandado a la inquisición para
                                   erradicar vuestro reino como consecuencia a vuestra blasfemia.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Hereje");
                }
            }
            case 4 -> {
                System.out.println("""
                                   El pueblo nunca se ha visto tan bien,
                                   los habéis colmado de tantos lujos que ya no les sois necesarios.
                                   Han tomado posesión del palacio real y os han exiliado educadamente.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Exiliado");
                }
            }
            case 5 -> {
                System.out.println("""
                                   El pueblo nunca ha estado tan mal
                                   No tiene nada que perder por lo que os han hecho perder la cabeza,
                                   Literalmente.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Tirano");
                }
            }
            case 6 -> {
                System.out.println("""
                                   Vuestro general ha mordido la mano que le daba de comer,
                                   ha reunido el ejército y han logrado un golpe de estado,
                                   habéis huido dejando atrás todo temiendo por vuestra vida.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Revocado");
                }
            }
            case 7 -> {
                System.out.println("""
                                   El estado de vuestro ejército es deplorable,
                                   no habéis podido soportar la conquista del reino vecino.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Derrotado");
                }
            }
            case 8 -> {
                System.out.println("""
                                   El reino nunca ha visto un periodo tan frutífero como este,
                                   Os habéis atiborrado de los manjares más exóticos como el kebab,
                                   La deshidratación producida por las salsas tan exquisitas
                                   terminaron por acabar con vos.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Acaudalado");
                }
            }
            case 9 -> {
                System.out.println("""
                                   El pueblo, la iglesia y el ejército os han abandonado
                                   No se han molestado ni en saquear las pelusas de vuestros bolsillos.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Paupérrimo");
                }
            }
            case 10 -> {
                System.out.println("""
                                   Cien puntas de lanza atraviesan vuestro cuerpo,
                                   no habéis soportado las heridas que durante vuestra travesía os han ido acribillando.
                                   Esta última trampa acabó por terminar con vuestra vida, dejándoos como comida para los
                                   gusanos que en algún futuro puedan encontraros
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Olvidado");
                }
            }
            case 11 -> {
                System.out.println("""
                                   El espejo no es sólido, al tocarlo lo atravesáis con la mano y os asustáis
                                   el miedo no se apodera de vos y lo atravesais completamente haciéndoos
                                   aparecer en el interior de una catedral enorme, no sabéis qué hacéis ahí
                                   mas conocéis que el futuro de vuestro reino ha quedado atrás y que el vuestro
                                   va a ser más diferente al de cualquier otro monarca.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Perdido");
                }
            }
            case 12 -> {
                System.out.println("""
                                   Lleváis tiempo sufriendo por el unguento, el tiempo sólo os ponía más cargas
                                   a vuestra espalda, la tos era cada vez peor y vuestras facultades fallaban cada
                                   vez con más asiduidad. Vuestro último día se vio repleto de despedidas de
                                   vuestros familiares que lloraban a los pies de vuestra cama.
                                   """);
                if(apelativo.equals("")){
                    setApelativo(", el Enfermo");
                }
            }
            default -> {
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Larga vida al rey "+nombre+apelativo);
        System.out.println("1287 - "+(años+1309));
        System.out.println("");
        System.out.println("Años reinados: "+años);
        System.out.println("");
    }
    
    public void Trampa(){
        if(salud<0){
            trampa=true;    
        }
    }
    public void mazmorraCompleta(){
        mazmorraCompleta = true;
    }

    public int Muerto() {
        
        return ocu>105? 1 :
                igl>=105? 2 :
                igl<=0? 3:
                pob>=105? 4:
                pob<=0? 5:
                eje>=105? 6:
                eje<=0? 7:
                eco>=105? 8:
                eco<=0? 9:
                trampa? 10: //trampa
                mazmorraCompleta? 11: //mazmorra realizada
                salud<0? 12:0;
    }
}
