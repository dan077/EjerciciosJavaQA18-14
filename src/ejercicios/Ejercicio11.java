/**
 * 11) Haz el mismo ejercicio anterior con un bucle for.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.print(i + (i == 100? "": ", ") + (i % 10 == 0? "\n": ""));
        }
    }
}
