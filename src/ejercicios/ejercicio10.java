/**
 * 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

public class ejercicio10 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            System.out.print(i + (i == 100? "": ", ") + (i % 10 == 0? "\n": ""));
            i += 1;
        }
    }
}
