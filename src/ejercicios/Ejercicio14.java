/**
 * 14) Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las
 * variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz
 * cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes
 * de traza.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float discriminante;
        float numeradorPositivo;
        float numeradorNegativo;
        float dosVecesA;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de a: ");
        a = sc.nextFloat();
        System.out.print("Ingresa el valor de b: ");
        b = sc.nextFloat();
        System.out.print("Ingresa el valor de c: ");
        c = sc.nextFloat();

        discriminante = (float)Math.pow(b,2) - 4*a*c;

        if(discriminante > 0){
            numeradorPositivo = -1*b + discriminante;
            numeradorNegativo = -1*b - discriminante;
            dosVecesA = 2*a;

            System.out.println(">> Valor del discriminante ( raiz( b^2 - 4*a*c ) ): " + discriminante);
            System.out.println(String.format(">> Númerador de X1 ( -b + %.2f ) = %.2f ", discriminante,numeradorPositivo));
            System.out.println(String.format(">> Númerador de X2 ( -b - %.2f ) = %.2f ", discriminante,numeradorNegativo));

            if(dosVecesA != 0){
                System.out.println(">> Valor del denominador (2*a) : " + dosVecesA);
                System.out.println("\n!--- Solución ---!");
                System.out.println(String.format(">> X1 %.2f/(2*a) = ", numeradorPositivo) + numeradorPositivo/dosVecesA);
                System.out.println(String.format(">> X2 %.2f/(2*a) = ", numeradorNegativo) + numeradorNegativo/dosVecesA);
            }else{
                System.out.println(">> Valor del denominador igual a cero. no se puede calcular");
            }

        }else if(discriminante == 0){
            System.out.println(">> El discriminante es igual a 0. no se puede calcular");
        }else{
            System.out.println(">> El valor del discriminante no pertenece a los reales.");
        }
    }
}
