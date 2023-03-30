import java.util.Scanner;

public class Main {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        boolean func = true;
        while (func) {
            System.out.println("----------- Menu ONG --------------\n" +
                    "1- Banc Aliments\n" +
                    "2- Menu d'Associacions\n" +
                    "3- Donar Aliments\n" +
                    "-----------------------------------");
            int eleccio = ent.nextInt();

            switch (eleccio) {
                case 1 : {
                    System.out.println("Banc Aliments");
                    break;
                }
                case 2 : {
                    MenuAssociacions.main(args);
                    break;
                }
                case 3 : {
                    System.out.println("Donar Aliments");
                    break;
                }
                case 4 : {
                    func = false;
                }

            }

        }
    }
}
