# Proves Unitaries de Caixa Negra amb Junit #

## Proves Pizzeria Pepe ##

codi

```
public class pizzeriaPepe {

    public static boolean potCarregar(int pizzes){
        boolean pot = false;
        if(pizzes <=10 && pizzes >= 1){
            pot = true;
        }
        return pot;
    }
}
```
tests

```
import org.junit.jupiter.api.*;


class pizzeriaPepeTest {

 
    @Test //Valor entre els límits
    void prova1() {
        boolean pot = pizzeriaPepe.potCarregar(3);
        Assertions.assertTrue(pot);
    }
    
    @Test //Valor superior al límit superior
    void prova2() {
        boolean pot = pizzeriaPepe.potCarregar(11);
        Assertions.assertFalse(pot);
    }


    @Test //Valor inferior al límit inferior
    void prova3() {
        boolean pot = pizzeriaPepe.potCarregar(-2);
        Assertions.assertFalse(pot);
    }
    
    
    @Test//Valor no és un número
    void prova4() {
        Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
            pizzeriaPepe.potCarregar(Integer.parseInt("cinc"));
        });
}
```

## Proves JeanClaude ##

codi

```
 public static void main(String[] args) {
        int carrega1 = 450;
        System.out.println(potPortar(carrega1));
    }
    public static int potPortar(int carrega) {
        if (carrega < 500) {
            return -1;
        } else if (carrega > 750) {
            return -1;
        } else if (carrega > 900) {
            return -1;
        }
        return 1;
    }
```
tests
```
class jeanClaudeTest {

    //entre els limits
    @Test
    void prova() {
        System.out.println( jeanClaude.potPortar(500));
    }

    // superior al limit superior
    @Test
    void prova1() {
        System.out.println( jeanClaude.potPortar(1000));
    }
    //inferior al limit inferior
    @Test
    void prova2() {
        System.out.println( jeanClaude.potPortar(450));
    }
    
    //no numeric
    @Test
    void prova3() {
        System.out.println( jeanClaude.potPortar(a));
    }
   

}
```
