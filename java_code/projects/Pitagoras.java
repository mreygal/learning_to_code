/* Calculadora de hipotenusa (con clase math).
 * 
 * NOTA: La clase Math está incluida por defecto en el paquete java.lang,
 * por lo que no me es necesario hacer un import java.lang.Math al principio
 * del código.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

public class Pitagoras {

    public static void main (String[] args) {
        Pitagoras programa = new Pitagoras();
        programa.inicio();
    }
    
    public void inicio() {
        double base = 4.5;
        double altura = 10;
        // Utilizo el método Math.hypot de la clase Math de Java, que calcula la hipotenusa:
        System.out.println("El valor de la hipotenusa es " + Math.hypot(base, altura));
    }
}
