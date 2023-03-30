import java.util.Date;

public class comandes {
    String Associacio;
    String Aliment;
    int Cantitat;
    double Preu;

    public comandes(String associacio, String aliment, int cantitat, double Preu) {
        Associacio = associacio;
        Aliment = aliment;
        Cantitat = cantitat;
        Preu = Preu;
    }

    public void getComanda() {
        System.out.println(Associacio + "Demana " + Cantitat + "kg de" + Aliment + "per un total de: " + Preu + "€");
    }
}
