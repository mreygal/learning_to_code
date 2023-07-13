/* Calculadora de cumpleaños "compleja".
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Importo las dos clases de debajo para calcular la fecha actual y el rango entre dos fechas, respectivamente.
import java.time.*;
import java.time.temporal.ChronoUnit;

// Establezco la clase "Cumpleanos_complejo".
public class Cumpleanos_complejo {
    public static void main(String[] args) {
        
        // Declaro las tres variables que introducirá el usuario.
        int ano;
        int mes;
        int dia;
        
        
        // Creo un nuevo Scanner y lo denomino "reader".
        Scanner reader = new Scanner(System.in);
        
        // Pido al usuario que introduzca su año, mes y día de nacimiento.
        System.out.print("Introduce tu AÑO de nacimiento: ");
        ano = reader.nextInt();
        
        System.out.print("Introduce tu MES de nacimiento (1-12): ");
        mes = reader.nextInt();
        
        System.out.print("Introduce tu DÎA de nacimiento (1-31): ");
        dia = reader.nextInt();
        
        /* Creo "fecha_actual" y "fecha_nacimiento" y les asigno sus respectivas fechas
         * (la actual en base al reloj del equipo y la de nacimiento en base a lo introducido
         * por el usuario). */
        LocalDate fecha_actual = LocalDate.now();
        LocalDate fecha_nacimiento = LocalDate.of(ano, mes, dia);
        
        // Gracias a java.time.temporal.ChronoUnit, calculo la distancia en años entre las fechas.
        long distancia_en_anos = ChronoUnit.YEARS.between(fecha_nacimiento, fecha_actual);
        
        // Muestro en pantalla los datos introducidos, la fecha actual y la edad.
        System.out.println("\nNaciste en la siguiente fecha (AAAA-MM-DD): " + fecha_nacimiento + ".");
        System.out.println("Hoy es: " + fecha_actual + ".");
        System.out.println("\nPor lo tanto, ahora mismo tienes " + distancia_en_anos + " años de edad.");

    }
}
