
package Reigns.clases;

public class Rey {

    private String nombre;
    private int ocu;
    private int igl;
    private int pob;
    private int eje;
    private int eco;
    private int salud;
    private String[] nomPropiedades = {"Ocultismo: ", "Iglesia: ", "Población: ", "Ejército: ", "Economía: ", "Salud: "};

    public Rey(String n) {
        nombre = n;
        ocu = 0;
        igl = 40;
        pob = 40;
        eje = 40;
        eco = 40;
        salud = 100;
    }

    public void alv() {
        for (int i = 0; i < 100; i++) {
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

    public void ToString() {
        System.out.println("Ocultismo: ");
        System.out.println(OcuToString());
        System.out.println("Salud: ");
        System.out.println(SaludToString());
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
        int b = (100 - this.ocu) / 5;
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
        int b = (100 - this.igl) / 5;
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
        int b = (100 - this.pob) / 5;
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
        int b = (100 - this.eje) / 5;
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
        int b = (100 - this.eco) / 5;
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
        int b = (100 - this.salud) / 5;
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
            case 1 ->
                System.out.println("""
                                   Vuestro reino ha sido víctima de vuestra megalomanía, habéis querido asir lo
                                   inasible condenando así a vuestro pueblo al infierno en vida, una vida que no
                                   pueden
                                   """);
            case 2 ->
                System.out.println("""
                                   La iglesia os toma por insignificante,
                                   os han relevado de vuestros poderes,
                                   pasaréis el resto de vuestros días encerrado en las mazmorras
                                   mas vuestro nombre será recordado como mártir.
                                   """);
            case 3 ->
                System.out.println("""
                                   La iglesia está demasiado enfadada con vuestros actos,
                                   os han execrado y han mandado a la inquisición para
                                   erradicar vuestro reino como consecuencia a vuestra blasfemia.
                                   """);
            case 4 ->
                System.out.println("""
                                   El pueblo nunca se ha visto tan bien,
                                   los habéis colmado de tantos lujos que ya no les sois necesarios.
                                   Han tomado posesión del palacio real y os han exiliado educadamente.
                                   """);
            case 5 ->
                System.out.println("""
                                   El pueblo nunca ha estado tan mal
                                   No tiene nada que perder por lo que os han hecho perder la cabeza,
                                   Literalmente.
                                   """);
            case 6 ->
                System.out.println("""
                                   Vuestro general ha mordido la mano que le daba de comer,
                                   ha reunido el ejército y han logrado un golpe de estado,
                                   habéis huido dejando atrás todo temiendo por vuestra vida.
                                   """);
            case 7 ->
                System.out.println("""
                                   El estado de vuestro ejército es deplorable,
                                   no habéis podido soportar la conquista del reino vecino.
                                   """);
            case 8 ->
                System.out.println("""
                                   El reino nunca ha visto un periodo tan frutífero como este,
                                   Os habéis atiborrado de los manjares más exóticos como el kebab,
                                   La deshidratación producida por las salsas tan exquisitas
                                   terminaron por acabar con vos.
                                   """);
            case 9 ->
                System.out.println("""
                                   El pueblo, la iglesia y el ejército os han abandonado
                                   No se han molestado ni en saquear las pelusas de vuestros bolsillos.
                                   """);
            case 10 ->
                System.out.println("""
                                   Cien puntas de lanza atraviesan vuestro cuerpo,
                                   por error pisasteis una losa trampa que activó un mecanismo
                                   que acabó con vuestra vida, pasarán cientos de años hasta que alguien
                                   logre encontrar vuestro cuerpo, mas los gusanos os dejarán irreconocible.
                                   """);
            case 11 ->
                System.out.println("""
                                   El espejo no es sólido, al tocarlo lo atravesáis con la mano y os asustáis
                                   el miedo no se apodera de vos y lo atravesais completamente haciéndoos
                                   aparecer en el interior de una catedral enorme, no sabéis qué hacéis ahí
                                   mas conocéis que el futuro de vuestro reino ha quedado atrás y que el vuestro
                                   va a ser más diferente al de cualquier otro monarca.
                                   """);
            case 12 ->
                System.out.println("""
                                   Lleváis tiempo sufriendo por el unguento, el tiempo sólo os ponía más cargas
                                   a vuestra espalda, la tos era cada vez peor y vuestras facultades fallaban cada
                                   vez con más asiduidad. Vuestro último día se vio repleto de despedidas de
                                   vuestros familiares que lloraban a los pies de vuestra cama.
                                   """);
            default -> {
            }
        }
    }

    public int Muerto() {
        int muerto = ocu>100? 1 :
                     igl>=100? 2 :
                     igl<=0? 3:
                     pob>=100? 4:
                     pob<=0? 5:
                     eje>=100? 6:
                     eje<=0? 7:
                     eco>=100? 8:
                     eco<=0? 9:
                     false? 10: //trampa
                     false? 11: //mazmorra realizada
                     salud<0? 12:0;
        return muerto;
    }
}
