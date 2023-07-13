/* Calculador de cumpleaños básica.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Establezco la clase "Cumpleanos_basico".
public class Cumpleanos_basico {
    public static void main(String[] args) {
        
        //Declaro las variables.
        int actual;
        int dob;
        int edad;
        
        // Creo un nuevo Scanner y lo denomino "reader".
        Scanner reader = new Scanner(System.in);
        
        /* Hago un do while loop para que me siga pidiendo los datos
         * si el año de nacimiento es superior al año actual. */        
        do {
            System.out.print("Introduce el año ACTUAL: ");
            actual = reader.nextInt();
        
            System.out.print("Introduce el año EN QUE NACISTE: ");
            dob = reader.nextInt();
            
            // Condicional con un par de bromas si el resultado fuera negativo (if) o fuera 0 (else if).
            if (dob > actual) {
                System.out.println("El año en que naciste no puede ser mayor que el año actual,\na menos que tengas una máquina del tiempo.\nInténtalo de nuevo.\n");
            }
            else if(dob == actual) {
                System.out.println("Los dos años son iguales, y dudo que tengas 0 años (¡no sabrías leer!). Inténtalo de nuevo.\n");
            }
        } while (dob >= actual);
        
        // Calculo la edad, restando el año actual del año de nacimiento.
        edad = actual - dob;
        
        // Muestro en pantalla los años que tiene el usuario.
        System.out.println("Si ya has cumplido años en " + actual + ", entonces ahora tienes " + edad + " años.");
    }
}

