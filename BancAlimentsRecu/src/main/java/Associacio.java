class Associacio {


    String nom;
    int numero;
    int distanciaBanc;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDistanciaBanc(int distanciaBanc) {
        this.distanciaBanc = distanciaBanc;
    }

    public void getNumero() {
        System.out.println(numero);
    }

    public void getDistanciaBanc() {
        System.out.println(distanciaBanc+"km");
    }

    public Associacio(String nom, int numero, int distanciaBanc) {
        this.nom = nom;
        this.numero = numero;
        this.distanciaBanc = distanciaBanc;
    }
    public void getAssociacions() {
        System.out.println(nom);
    }
    public String getNom(){
        return nom;
    }

    public int getDistancia() {
        return distanciaBanc;
    }

    public void getAll(){
        System.out.println(
                "Nom: " + nom + "\n" +
                "Numero: " + numero + "\n" +
                "Distancia: " + distanciaBanc+"km");
    }
}
