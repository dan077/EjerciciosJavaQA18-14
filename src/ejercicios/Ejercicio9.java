/**
 * 9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
 *     el precio final con IVA. El IVA sera una constante que sera del 21%.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precio;
        float precioConIva;
        final float IVA = 0.21f;

        System.out.print("Ingrese el precio del articulo: ");
        precio = sc.nextFloat();

        precioConIva = precio + precio*IVA;

        System.out.println(String.format("Precio del articulo: %.2f \nIVA aplicado: %.2f%% \nPrecio con iva %.2f", precio,IVA*100, precioConIva));
    }
}
