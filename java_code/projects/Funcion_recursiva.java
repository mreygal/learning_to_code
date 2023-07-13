/* Ejemplo de función recursiva.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

public class Funcion_recursiva {
    public static void printArrayR(int[] array, int i) {
        
        // Caso base para impedir que la función recursiva siga una vez llegado
        // al final del array:. Utilizo la variable .length para obtener el
        // número de elementos del array:
        if (i == array.length) {
            
            // Hago un prinln vacío aunque podría dejarse el if vacío del todo:
            System.out.println();
        }
        
        // Si aún no se ha llegado al final del array, se imprime el elemento
        // en la posición i del array, y después se vuelve a llamar a la
        // función printArrayR con la llamada recursiva:
        else {
            
            // Se imprime el elemento que toque del array:
            System.out.println(array[i]);
            
            // Llamada recursiva:
            printArrayR(array, i + 1);
        }
    }

    public static void main(String[] args) {
        
        // Declaro el array con los elementos del ejemplo dentro:
        int[] array = {1, 2, 3, 4, 5};
        
        // Llamo a la función recursiva printArrayR, inicializando el array en
        // 0. Es decir, en su primera posición:
        printArrayR(array, 0);
    }
}

