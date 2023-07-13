/* Calculadora de letra final de DNI.
 * 
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Establezco la clase "Letra_dni".
public class Letra_dni {
    public static void main(String[] args) {
        
        //Declaro las variables a utilizar.
        int n, resto;
        
        // Aparte, para mayor claridad, declaro el array de letras.
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        // Creo un nuevo Scanner y lo denomino "entrada".
        Scanner entrada = new Scanner(System.in);
        
        /* Hago un do while loop para que me siga pidiendo datos si el número
         * introducido es incorrecto. */
        do {
            // Pido el número que determinará la altura de la pirámide.
            System.out.print("Introduce un DNI sin letra (ejemplo: 12345678): ");
            n = entrada.nextInt();
            
            /* Hago un condicional con un boolean para que muestre un mensaje aclaratorio
             * si el número pedido es < 0 o > 99999999 (máximo número de un DNI). */
            if (n < 0 || n > 99999999) {
                System.out.println("El número introducido no es correcto. Inténtalo de nuevo.\n");
            }
        } while (n < 0 || n > 99999999);
        
        // Separador.
        System.out.println("---------------------------------------------------------");
        
        // Calculo el resto.
        resto = n % 23;
        
        // Digo cuál es la letra, y luego digo cuál es el DNI entero, con la letra.
        System.out.println("La letra final correspondiente al DNI introducido es: " + letras[resto]);
        System.out.println("Por lo tanto, el DNI completo es: " + n + "-" + letras[resto]);
    }
}