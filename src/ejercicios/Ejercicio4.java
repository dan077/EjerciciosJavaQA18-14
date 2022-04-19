/**
 * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda
 *     usar JOptionPane).
 *
 * @author Daniel Miguel Vega Camargo - danielvegacmc@unimagdalena.edu.co
 */
package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingres tu nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }
}
