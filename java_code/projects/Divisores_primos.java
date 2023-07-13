/* Divisores primos.
 * 
 * Hecho por mreygal para ASIR.
 */


package examples;

// Importo el scanner:
import java.util.Scanner;

public class Divisores_primos {

    // Declaro la función divisores primos con la función esPrimo dentro.
    // Básicamente, se busca divisor a divisor con la función divisoresPrimos,
    // y luego se comprueba con esPrimo si cada divisor es o no es primo. Por
    // último, se imprime cada número que cumpla con esas dos características
    // (ser divisor y ser primo del número n):
    static void divisoresPrimos(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Función que comprueba si los números sacados con divisoresPrimos son, de
    // hecho, números primos. El primer condicional if es para asegurarse de que
    // el número 1 o los números menores a él no sean etiquetados como primos,
    // ya que no lo son:
    static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    // Programa principal con el scanner declarado, le petición de entrada de
    // datos y la declaración de la función divisoresPrimos:
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce número entero para hallar sus divisores primos: ");
        int n = entrada.nextInt();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Los divisores primos del número introducido son: ");
        
        divisoresPrimos(n);
    }
}
