/**
 * 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 *     son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        double num1 = 46;
        double num2 = 45;
        int _comparar = comparar(num1,num2);

        if(_comparar == 1){
            System.out.println("Num2 > Num1 ");
        }else if(_comparar == -1){
            System.out.println("Num2 < Num1 ");
        }else{
            System.out.println("Num2 == Num1 ");
        }
    }

    /**
     *
     * @param num1
     * @param num2
     * @return 0 si son iguales, 1 si num2 > num1 o -1 si num1 > num2
     */
    public static int comparar(double num1, double num2){
        if(num1 > num2){
            return -1;
        }else if(num1 < num2){
            return 1;
        }
        return 0;
    }
}
