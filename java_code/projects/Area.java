/* Área de un triángulo.
 *
 * Hecho por mreygal para ASIR.
 *
 * NOTA IMPORTANTE: A la hora de ejecutar el programa, los decimales han de ser escritos
 * con comas, no con puntos, por cómo trata el software la región. */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario
import java.util.Scanner;

// Establezco la clase "Area".
public class Area {
    public static void main(String[] args) {
        
        //Declaro las variables
        float base;
        float altura;
        float resultado;
        
        // Creo un nuevo Scanner y lo denomino "reader
        Scanner reader = new Scanner(System.in);
        
        /* Hago un do while loop para que me siga pidiendo datos si la base o la altura
         * son iguales a 0 o menores a 0 */
        do {
            // Pido la base y la altura
            System.out.print("Introduce la BASE del triángulo: ");
            base = reader.nextFloat();
        
            System.out.print("Introduce la ALTURA del triángulo: ");
            altura = reader.nextFloat();
            
            /* Hago un condicional con un boolean para que muestre un mensaje aclaratorio
             * si la base o la altura son 0 o menores que 0. Esto está dentro del bucle. */
            if (base <= 0 || altura <= 0) {
                System.out.println("La base y la altura deben ser mayores que 0. Inténtalo de nuevo.\n");
            }
        } while (base <= 0 || altura <= 0);
        
        // Calculo el resultado
        resultado = (base * altura) / 2;
        
        // Imprimo el resultado
        System.out.println("El ÁREA del triángulo es: " + resultado);
    }
}
