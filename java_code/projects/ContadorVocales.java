/* Contador de vocales.
 * 
 * Programa que cuenta el número de vocales del string introducido en el código.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

public class ContadorVocales {
    
    // Función principal
    public static void main(String[] args) {
        String texto = "Podriamos conseguir muy buenos resultados, sin duda alguna.";
        
        // Paso el texto a minúsculas para simplificar el código
        texto = texto.toLowerCase();

        int contadorVocales = contarVocales(texto);

        System.out.println(contadorVocales);
    }

    // Función de contar vocales
    public static int contarVocales(String textoAContar) {
        int contadorVocales = 0;

        for (int i = 0; i < textoAContar.length(); i++) {
            char letra = textoAContar.charAt(i);
            // Llamo a la función esVocal
            if (esVocal(letra)) {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }

    // Función para saber si una letra es o no es vocal
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);

        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}

