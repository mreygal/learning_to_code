/* UF1ACT2 Programa 1: Divisor de palabras.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Establezco la clase "Divisor_palabras".
public class Divisor_palabras {
    public static void main(String[] args) {
        
        // Declaro las variables a utilizar.
        int n;
        String palabra;
        
        // Creo un nuevo Scanner y lo denomino "entrada".
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce una palabra: ");
        palabra = entrada.nextLine();

        System.out.print("Introduce un número entero: ");
        n = entrada.nextInt();

        // Declaro una variable que me indique la longitud  de la palabra.
        int longitud = palabra.length();
        
        // Hago un bucle para que podamos imprimir y modificar la palabra en base a su longitud
        while (longitud > 0) {
            
            // Hago que, si la longitud es menor al número introducido por el usuario,
            // el número del usuario pase a ser la longitud, para poder imprimir la
            // última línea sin problemas.
            if (longitud < n) {
                n = longitud;
            }
            
            // Declaro el string linea y lo convierto en un substring desde 0 hasta n
            String linea = palabra.substring(0, n);
            
            // Elimino los primeros n caracteres del string palabra
            palabra = palabra.substring(n);
            
            // Hago que la longitud pase a ser n menos de lo que era antes para que
            // el bucle siga funcionando hasta el final de la palabra
            longitud = longitud - n;
            
            // Imprimo el string linea. Es decir, n caracteres
            System.out.println(linea);
        }
    }
}