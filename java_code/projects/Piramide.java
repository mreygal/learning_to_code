/* Pirámide de estrellas.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Establezco la clase "Piramide".
public class Piramide {
    public static void main(String[] args) {
        
        //Declaro las variables a utilizar.
        int n, fila, espacio, asterisco;
        
        // Creo un nuevo Scanner y lo denomino "entrada".
        Scanner entrada = new Scanner(System.in);
        
        /* Hago un do while loop para que me siga pidiendo datos si el número
         * introducido es igual o menor que 0, o mayor que 20. */
        do {
            // Pido el número que determinará la altura de la pirámide.
            System.out.print("Introduce un número entero entre 1 y 20: ");
            n = entrada.nextInt();
            
            /* Hago un condicional con un boolean para que muestre un mensaje aclaratorio
             * si el número pedido es < 1 o > 20. Esto está dentro del bucle. */
            if (n < 1 || n > 20) {
                System.out.println("El número introducido no está entre 1 y 20. Inténtalo de nuevo.\n");
            }
        } while (n < 1 || n > 20);
        
        // Hago un for loop para el número de filas.
        for (fila = 0; fila < n; fila++) {
            
            // Hago un for loop anidado para el espacio inicial de cada fila.
            for (espacio = n - fila; espacio > 1; espacio--) {
                System.out.print(" ");
            }
            
            // Hago otro for loop anidado para el número de "*", seguido de un espacio.
            for (asterisco = 0; asterisco <= fila; asterisco++) {
                System.out.print("* ");
            }
            
            // Hago que se salte a la siguiente línea
            System.out.print("\n");
        }
    }
}