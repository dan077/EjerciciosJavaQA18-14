/**
 * 5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 *     (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow
 *     de Math
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double radio;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();

        area = Math.PI * Math.pow(radio,2);

        System.out.println(String.format("El area del circulo con radio %.2f es %.2f", radio,area));

    }
}
