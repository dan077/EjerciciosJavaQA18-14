/**
 * 13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá
 *     tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de
 *     todas las ventas. Piensa que es lo que se repite y lo que no.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        ArrayList<Float> ventas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int cantidadDeVentas;
        float valor;
        float valorTotal;

        System.out.print("Inserte la cantidad de ventas: ");
        cantidadDeVentas = sc.nextInt();

        for (int i = 1; i <= cantidadDeVentas; i++) {
            System.out.print("Ingrese el valor de la venta #" + i + ": " );
            valor = sc.nextFloat();
            ventas.add(valor);
        }

        valorTotal = ventas.stream().reduce(0.0f,Float::sum);

        System.out.println("Suma de las ventas: " + valorTotal);
    }

}
