/* Comprobador de int.
 * 
 * Programa de práctica para comprender ciertas funciones de Java.
 * Esencialmente, el programa pide un int y lo muestra por pantalla si
 * efectivamente el número es un int.
 *
 * Hecho por mreygal para ASIR.
 */
package examples;

import java.util.Scanner; // Importo el scanner
// Importo el Input MismatchException para que dentro de leerEntero() me siga
// pidiendo un int cuando la cadena introducida no es un int:
import java.util.InputMismatchException;

public class Cadena_correcta {

    Scanner entrada = new Scanner(System.in); // Creo el scanner
    int n; // declaro la variable a la que dará valor el input del usuario
    
    public static void main(String[] args) {

        Cadena_correcta programa = new Cadena_correcta(); // Creo la clase programa
        programa.leerEntero(); // Llamo al método leerEntero()
    }
    
    // Aquí está el método con un boolean para que siempre se ejecute hasta
    // llegar al break:
    public int leerEntero() {
        boolean activo = true;
        while (activo) {
            try {
                System.out.print("Introduce un número entero (int): ");
                n = entrada.nextInt();
                System.out.print(n + "\n");
                break;
            } catch (InputMismatchException ex) { // Esto lo ejecuta si no es un int
                System.out.println("La cadena introducida no es un número entero (int). Inténtelo de nuevo...");
                // Aquí debajo necesito hacer una nueva línea para que el
                // método limpie la cadena anterior y no entre en bucle:
                entrada.nextLine();
            }
        }
        // Necesito hacer un return porque el método especifica que sea int. Si
        // quisiera que no pidiera un return, podría hablerlo declarado como
        // public void leerEntero() en vez de public int:
        return n;
    }
}    
    

