/* Organizador alfabético de palabras en un array.
 * 
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo la clase Arrays, que más tarde me permitirá ordenar los strings de un array.
import java.util.Arrays;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Establezco la clase "programa_1".
public class Organizador_palabras {
    public static void main(String[] args) {
        
        // Declaro la variable frase para más tarde trabajar con ella.
        String frase;
        
        // Creo un nuevo Scanner y lo denomino "entrada".
        Scanner entrada = new Scanner(System.in);
        
        // Pido que el usuario introduzca una frase.
        System.out.println("Introduce una frase con varias palabras: ");
        frase = entrada.nextLine();
        
        // Convierto el string frase todo a minúsculas para que el parallelSort
        // de después no dé problemas (ya que ordena alfabéticamente y también
        // con un orden jerárquico de mayúsculas antes que minúsculas).
        frase = (frase.toLowerCase());
        
        // Declaro la variable palabras para tener las palabras separadas en un array.
        // Pongo " " para que divida las palabras cada vez que encuentre un espacio.
        String palabras[] = frase.split(" ");
        
        // Hago un parallelSort para ordenar las palabras del array...
        Arrays.parallelSort(palabras);
        
        // ...y finalmente muestro las palabras del array ya ordenadas, una a una.
        System.out.println(Arrays.toString(palabras));
    }
}

