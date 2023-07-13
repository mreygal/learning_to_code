/* Distancias.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario
import java.util.Scanner;

// Establezco la clase "Distancias".
public class Distancias {
    public static void main(String[] args) {
        
        //Declaro las variables
        int milimetros;
        int centimetros;
        int metros;
        float resultado; // resultado es float por la división de int milimetros de la línea 26
        
        // Creo un nuevo Scanner y lo denomino "reader
        Scanner reader = new Scanner(System.in);
        
        // Pido las tres medidas
        System.out.print("Introduce primera medida (en mm): ");
        milimetros = reader.nextInt();
        
        System.out.print("Introduce segunda medida (en cm): ");
        centimetros = reader.nextInt();
        
        System.out.print("Introduce tercera medida (en m): ");
        metros = reader.nextInt();
        
        // Operación. Convierto milimetros en float para conservar los decimales
        
        resultado = ((float) milimetros / 10) + centimetros + (metros * 100);
        
        System.out.println("La suma de las tres medidas en cm es: " + resultado + " cm.");
        
    }
    
}
