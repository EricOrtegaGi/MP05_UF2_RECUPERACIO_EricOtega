
import java.util.Date;
import java.util.Scanner;

public class MenuAssociacions {
    static Scanner ent = new Scanner(System.in);
    public static Associacio[] associacions = new Associacio[5];
    public static comandes[] comandes = new comandes[3];

    public static void main(String[] args) {

        Associacio test1 = new Associacio("Associacio de prova", 1222333344, 50);
        Associacio test2 = new Associacio("Associacio de prova2", 455566677, 345);
        associacions[0] = test1;
        associacions[1] = test2;
        boolean func = true;
        while (func) {
            System.out.println("------------------------------ Benvingut a la seccio d'associacions ------------------------------\n" +
                    "--------------------------------------seleccioni una opcio---------------------------------------\n" +
                    "1: Agregar Associacio\n" +
                    "2: Modificar Associacio\n" +
                    "3: Realitzar Comanda\n"  +
                    "4: Veure Associacions\n" +
                    "5: Veure Comandes\n" +
                    "6: Sortir");

            switch (ent.nextInt()){
                case 1 : {
                    agregarAssociacio();
                    break;
                }
                case 2 : {
                    modificarAssociacio();
                    break;
                }
                case 3 : {
                    ferComanda();
                    break;
                }
                case 4 : {
                    veureAssociacions();
                    break;
                }
                case 5 : {
                    veureComandes();
                    break;
                }
                case 6 : {
                    func = false;
                }
            }
        }
    }
    private static void ferComanda() {
        int patates = 50;
        int llegums = 120;
        int macarrons = 250;
        int posicio = 0;
        int associacio;

        System.out.println("A quina associacio pertany:");
        for (int i = 0; i < associacions.length-1 && associacions[i] != null; i++) {
            System.out.print(posicio+": "); associacions[i].getAssociacions();
            posicio++;
        }
        associacio = ent.nextInt();
        System.out.println("\n" +
                "Seleccioni l'Aliment que vol demanar: \n" +
                "--------------------------------------\n" +
                "1. Patates\n" +
                "2. Llegums\n" +
                "3. Macarrons\n" +
                "-------------------------------------");
        int aliment = ent.nextInt();
        int cantitat;
        if (aliment == 1 ){
            double preu;
            System.out.println("Has seleccionat patates, selecciona la cantitat en kg:");
            cantitat = ent.nextInt();

            patates = patates-cantitat;
            if (patates < 0){
                System.out.println("tenim un total de:" + (patates+cantitat) + "kg de patates, no tenim suficient stock");
            }else if (cantitat > 300) {
                System.out.println("Esteu excedin la cantitat maxima per comanda");
            }
            else {
                if (cantitat < 200 ){
                    preu = associacions[associacio].getDistancia()*0.19;
                    System.out.println(cantitat+"kg de patates, a entregar a l'associacio: "+ associacions[associacio].getNom()+", per un cost de: 0,19€ * "+associacions[associacio].getDistancia()+" km = "+preu+"€");
                    comandes novaComanda = new comandes(associacions[associacio].getNom(), "patates", cantitat, preu);
                    if (comandes[0] == null) {
                        comandes[0] = novaComanda;
                    }else {
                        int ultimaPosicio = 0;
                        for (int i = 0; i < comandes.length; i++) {
                            if (comandes[i] != null) {
                                ultimaPosicio = i;
                            }
                        }
                        comandes[ultimaPosicio + 1] = novaComanda;
                    }
                }else {
                    preu = associacions[associacio].getDistancia()*0.20;
                    System.out.println(cantitat+"kg de patates, a entregar a l'associacio: "+ associacions[associacio].getNom()+", per un cost de: 0,20€ * "+associacions[associacio].getDistancia()+" km = "+preu+"€");
                    comandes novaComanda = new comandes(associacions[associacio].getNom(), "patates", cantitat,  preu);
                    if (comandes[0] == null) {
                        comandes[0] = novaComanda;
                    }else {
                        int ultimaPosicio = 0;
                        for (int i = 0; i < comandes.length; i++) {
                            if (comandes[i] != null) {
                                ultimaPosicio = i;
                            }
                        }
                        comandes[ultimaPosicio + 1] = novaComanda;
                    }
                }
            }

        } else if (aliment == 2) {
            double preu;
            System.out.println("Has seleccionat llegums, selecciona la cantitat en kg:");
            cantitat = ent.nextInt();
            llegums = llegums-cantitat;
            if (patates < 0){
                System.out.println("tenim un total de:" + (llegums+cantitat) + "kg de llegums, no tenim suficient stock");
            }else if (cantitat > 300) {
                System.out.println("Esteu excedin la cantitat maxima per comanda");
            }
            else {
                if (cantitat < 200 ){
                    preu = associacions[associacio].getDistancia()*0.19;
                    System.out.println(cantitat+"kg de llegums, a entregar a l'associacio: "+ associacions[associacio].getNom()+", per un cost de: 0,19€ * "+associacions[associacio].getDistancia()+" km = "+(associacions[associacio].getDistancia()*0.19)+"€");
                    comandes novaComanda = new comandes(associacions[associacio].getNom(), "llegums", cantitat, preu);
                    if (comandes[0] == null) {
                        comandes[0] = novaComanda;
                    }else {
                        int ultimaPosicio = 0;
                        for (int i = 0; i < comandes.length; i++) {
                            if (comandes[i] != null) {
                                ultimaPosicio = i;
                            }
                        }
                        comandes[ultimaPosicio + 1] = novaComanda;
                    }
                }else {
                    preu = associacions[associacio].getDistancia()*0.20;
                    System.out.println(cantitat+"kg de llegums, a entregar a l'associacio: "+ associacions[associacio].getNom()+", per un cost de: 0,20€ * "+associacions[associacio].getDistancia()+" km = "+(associacions[associacio].getDistancia()*0.20)+"€");
                    comandes novaComanda = new comandes(associacions[associacio].getNom(), "llegums", cantitat, preu);
                    if (comandes[0] == null) {
                        comandes[0] = novaComanda;
                    }else {
                        int ultimaPosicio = 0;
                        for (int i = 0; i < comandes.length; i++) {
                            if (comandes[i] != null) {
                                ultimaPosicio = i;
                            }
                        }
                        comandes[ultimaPosicio + 1] = novaComanda;
                    }
                }

            }
        } else if (aliment == 3) {
            double preu;
            System.out.println("Has seleccionat macarrons, selecciona la cantitat en kg:");
            cantitat = ent.nextInt();
            macarrons = macarrons-cantitat;
            if (macarrons < 0 ){
                System.out.println("tenim un total de:" + (macarrons+cantitat) + "kg de macarrons, no tenim suficient stock");
            } else if (cantitat > 300) {
                System.out.println("Esteu excedin la cantitat maxima per comanda");
            } else {
                if (cantitat < 200 ){
                    preu = associacions[associacio].getDistancia()*0.19;
                    System.out.println(cantitat+"kg de macarrons, a entregar a l'associacio: "+ associacions[associacio].getNom()+", per un cost de: 0,19€ * "+associacions[associacio].getDistancia()+" km = "+(associacions[associacio].getDistancia()*0.19)+"€");
                    comandes novaComanda = new comandes(associacions[associacio].getNom(), "macarrons", cantitat, preu);
                    if (comandes[0] == null) {
                        comandes[0] = novaComanda;
                    }else {
                        int ultimaPosicio = 0;
                        for (int i = 0; i < comandes.length; i++) {
                            if (comandes[i] != null) {
                                ultimaPosicio = i;
                            }
                        }
                        comandes[ultimaPosicio + 1] = novaComanda;
                    }
                }else {
                    preu = associacions[associacio].getDistancia()*0.20;
                    System.out.println(cantitat+"kg de macarrons, a entregar a l'associacio: "+ associacions[associacio].getNom()+", per un cost de: 0,20€ * "+associacions[associacio].getDistancia()+" km = "+(associacions[associacio].getDistancia()*0.20)+"€");
                    comandes novaComanda = new comandes(associacions[associacio].getNom(), "macarrons", cantitat, preu);
                    if (comandes[0] == null) {
                        comandes[0] = novaComanda;
                    }else {
                        int ultimaPosicio = 0;
                        for (int i = 0; i < comandes.length; i++) {
                            if (comandes[i] != null) {
                                ultimaPosicio = i;
                            }
                        }
                        comandes[ultimaPosicio + 1] = novaComanda;
                    }
                }
            }
        }
    }
    private static void modificarAssociacio() {
        int posicio = 0;
        System.out.println("quina associacio ha de ser modificada?:");

        for (int i = 0; i < associacions.length-1 && associacions[i] != null; i++) {
            System.out.print(posicio+": "); associacions[i].getAssociacions();
            posicio++;
        }

        int associacio = ent.nextInt();
        posicio = 0;
        System.out.println("Que ha de ser modificat");
        System.out.print(posicio+"Nom: "); associacions[associacio].getAssociacions();
        posicio++;
        System.out.print(posicio+"Numero: "); associacions[associacio].getNumero();
        posicio++;
        System.out.print(posicio+"Distancia al banc: "); associacions[associacio].getDistanciaBanc();
        switch (ent.nextInt()) {
            case 0 : {
                associacions[associacio].setNom(ent.next());
                break;
            }
            case 1 :{
                associacions[associacio].setNumero(Integer.parseInt(ent.next()));
                break;
            }
            case 2 : {
                associacions[associacio].setDistanciaBanc(Integer.parseInt(ent.next()));
                break;
            }
        }


    }
    public static void agregarAssociacio() {
        System.out.println("Introdueix el nom de la associacio: \n");
        String nom = ent.next();
        System.out.println("Introdueix el numero de telefono: \n");
        int numero = ent.nextInt();
        System.out.println("Introdueix la distancia (en km) al banc d'aliments: \n");
        int distancia = ent.nextInt();
        Associacio nova = new Associacio(nom,numero,distancia);

        int ultimaPosicio = 0;
        for (int i = 0; i < associacions.length; i++) {
            if (associacions[i] != null) {
                ultimaPosicio = i;
            }
        }
        associacions[ultimaPosicio+1] = nova;


    }

    public static void veureAssociacions(){
        int posicio = 0;
        for (int i = 0; i < associacions.length-1 && associacions[i] != null; i++) {
            System.out.print(posicio+": "); associacions[i].getAssociacions();
            posicio++;
        }
    }
    public static void veureComandes(){
        int posicio = 0;
        for (int i = 0; i < comandes.length-1 && comandes[i] != null; i++) {
            System.out.print(posicio+": "); comandes[i].getComanda();
            posicio++;
        }

    }
}
