/**
 * 1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
 *     multiplicación, división y módulo (resto de la división).
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 0;

        System.out.println("suma: " + suma(num1,num2));
        System.out.println("resta: " + resta(num1,num2));
        System.out.println("multiplicación: " + multiplicacion(num1,num2));
        try{
            System.out.println("division: " + division(num1,num2));
        }catch (ArithmeticException e){
            System.out.println("No es posible dividir por cero");
        }
        System.out.println("modulo: " + modulo(num1,num2));
    }

    public static double suma(double num1, double num2){

        return num1 + num2;
    }
    public static double resta(double num1, double num2){

        return num1 - num2;
    }
    public static double multiplicacion(double num1, double num2){

        return num1 * num2;
    }
    public static double division(double num1, double num2) throws ArithmeticException {
        if(num2 == 0){
            throw new ArithmeticException();
        }
        return num1 / num2;
    }
    public static double modulo(double num1, double num2){

        return num1 % num2;
    }
}
