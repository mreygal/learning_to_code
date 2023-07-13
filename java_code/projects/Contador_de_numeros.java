/* Contador de números.
 * 
 * NOTA: El programa funciona, aunque es enrevesado. No tengo paciencia
 * ni tiempo para escribirlo de nuevo. Sorry, WAY too many comments...
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

// Importo el paquete Arrays para poder imprimirlos
import java.util.Arrays;

// Importo el paquete stream para poder sumar los ints de un array
import java.util.stream.*;

// Importo el Scanner para poder leer información del teclado introcida por el usuario.
import java.util.Scanner;

// Establezco la clase "programa_1".
public class Contador_de_numeros {
    public static void main(String[] args) {
        
                // Creo un nuevo Scanner y lo denomino "entrada".
        Scanner entrada = new Scanner(System.in);
        
        // Declaro la variable n para saber la longitud del array de números.
        int n;
        
        // Declaro la variable i para el loop de después.
        int i;
        
        // Declaro la variable introducido para ir almacenando los números después.
        int introducido;
        
        // Declaro la variable ceros para ir sumando el número de ceros, de haberlos.
        int ceros = 0;
        
        // Pido que el usuario introduzca una frase.
        System.out.print("¿Cuántos números (ENTEROS) desea introducir?: ");
        n = entrada.nextInt();
        
        // Creo el array listaNumeros cuyo número de números int es n.
        int[] listaNumeros = new int[n];
        
        // Creo un loop con un contador que declaro como un int i.
        
        for (i = 0; i < n; i++) {
            // Pido que se introduzcan los números en orden, según vaya el loop.
            System.out.print("Introduce el #" + (i + 1) + " : ");
            
            // Almaceno el número correspondiente.
            introducido = entrada.nextInt();
            
            // Calculo si ese número tiene ceros y lo voy sumando al int cero que cree al principio.
            // Primero creo una variable numeroString para pasar el número a un string.
            String numeroString = String.valueOf(introducido);
            // Después, declaro longitudString calculando la longitud de numeroString.
            int longitudString = numeroString.length();
            // Después, hago un loop con una variable nueva (x) para ver si hay ceros e ir sumándolos al contador ceros.
            for (int x = 0; x < longitudString; x++) {
                // Declaro la variable digito para ir analizando cada número y ver si son ceros.
                String digito = numeroString.substring(0,1);
                // Compruebo si es o no cero.
                if (digito.equals("0")) {
                    ceros++;
                }
                // Elimino el primer dígito y sigo.
                numeroString = numeroString.substring(1);
            }
            
            // Almaceno el valor del número introducido en el array de números.
            listaNumeros[i] = introducido;
            
        }
        
        // Los ordeno con sort.
        Arrays.sort(listaNumeros);
        
        //Declaro una variable para el número más alto.
        int masAlto = listaNumeros[i-1];
        
        // Imprimo una lista ordenada los números enteros introducidos.
        System.out.println("\n----------------------------------------------------");
        System.out.println("\nLos números, ordenados, son: " + Arrays.toString(listaNumeros));
        System.out.println("\n----------------------------------------------------");
       
        // Imprimo el número más alto
        System.out.println("\nEl valor MÁXIMO es: " + masAlto);
        
        // Calculo la media de los números (primero los sumo, y luego hayo la media).
        double suma = IntStream.of(listaNumeros).sum();
        double media = suma / n;
        
        // Imprimo el número de ceros gracias al cálculo que hice anteriormente.
        System.out.println("El NÚMERO TOTAL DE CEROS (a la derecha) es: " + ceros);
        
        // Imprimo la media de los números.
        System.out.println("La MEDIA de esos números es: " + media);
        
    }
}


