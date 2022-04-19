/**
 * 3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por
 *     consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre = "Daniel";
        saludo(nombre);
    }

    public static  void saludo(String nombre){
        System.out.println("Bienvenido " + nombre);
    }

}
