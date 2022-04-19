/**
 * 7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
 *     Por ejemplo: si introduzco un 97, me muestre una a.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.println("El número " + numero + " equivale al caracter ASCII: " + (char)numero);
    }
}
