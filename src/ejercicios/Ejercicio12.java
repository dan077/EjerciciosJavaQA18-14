/**
 * 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
 *     desees
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        int contador = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0 && i % 3 == 0){
                contador ++;
                System.out.print(i + ", " + (contador % 10 == 0? "\n": ""));
            }
        }
    }
}
