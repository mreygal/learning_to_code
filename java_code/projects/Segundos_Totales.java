/* Calculadora de segundos totales.
 *
 * Hecho por mreygal para ASIR.
 */


package examples;

// Importo el scanner:
import java.util.Scanner;


public class Segundos_Totales {
    
    // Función que calcula el total de segundos en base a los días, horas y minutos
    // introducidos por el usuario más abajo. Después de calcular el total de
    // segundos, la función hace un return de ese total:
    static int totalSegundos (int dias, int horas, int minutos) {
        return ((dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60));
    }

    public static void main(String[] args) {
        
        // Creo un scanner:
        Scanner entrada = new Scanner(System.in);

        // Pido el número de días, horas y minutos y los asigno a los int dias,
        // horas, minutos:
        System.out.print("Introduce número de días: ");
        int dias = entrada.nextInt();

        System.out.print("Introduce número de horas: ");
        int horas = entrada.nextInt();

        System.out.print("Introduce número de minutos: ");
        int minutos = entrada.nextInt();

        // Llamo a la función declarada al principio del programa, la cual me
        // devuelve el return. Lo hago dentro de un System.out.println:
        System.out.println("El número total de segundos es: " + totalSegundos(dias, horas, minutos) + ".");
    }
}
