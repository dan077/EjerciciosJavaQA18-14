/**
 * 8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y
 * muestre su código en la tabla ASCII.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;

        System.out.print("Ingrese un número: ");
        caracter = sc.next().charAt(0);

        System.out.println("El caracer " + caracter + " se encuentra en la posición " + (int)caracter + " de la tabla ASCII");
    }
}
