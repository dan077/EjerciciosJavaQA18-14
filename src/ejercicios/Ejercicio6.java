/**
 * 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
 *     debemos indicarlo
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.println("El número " + numero + " " + (numero%2 != 0?"No":"") +  " es divisible entre dos");
    }
}
