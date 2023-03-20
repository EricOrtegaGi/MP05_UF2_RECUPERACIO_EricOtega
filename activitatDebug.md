## Metode Factorial ##

**Codi de programa**

```
public class Factorial {

    public static void main(String[] args) {
        System.out.println(metodeFactorial(5));
    }
    public static int metodeFactorial(int n){
      if (n == 0) return 1;
      else return (n*metodeFactorial(n-1));
    }
}


```
**Punt d'interrupcio**

![image](https://user-images.githubusercontent.com/114953110/226298781-9901ea31-6cdf-4c26-9a40-6fe4df742c78.png)
![image](https://user-images.githubusercontent.com/114953110/226298840-d043662f-8772-4a91-a386-5e58323a4edb.png)

# Taula de Multiplicar #

**Codi de programa**

```
import java.util.Scanner;

public class TaulaMultiplicar {

    static int[]  taula = new int[]{1,2,3,4,5,6,7,8,9,10};


    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        int n = ent.nextInt();
        for (int i = 0; i < taula.length; i++) {
            int resultat = taula[i] * n;
            System.out.println(resultat);
        }
    }

}

```
**Introduccio Numero**

**Punt interrupcio**

![image](https://user-images.githubusercontent.com/114953110/226303342-de861edf-9eb6-47cb-8a0a-9ce28421dc43.png)

**Modificacio valors matriu**



- Despres de fer els canvis

![image](https://user-images.githubusercontent.com/114953110/226304192-9a0199b7-acee-4cb0-88d2-f757eaf3c1ed.png)
![image](https://user-images.githubusercontent.com/114953110/226304033-886e9969-90f6-4c4c-8e02-1035c7a6b7d4.png)
![image](https://user-images.githubusercontent.com/114953110/226304131-593bac22-d10a-41c2-9b08-7a04af3b76df.png)


