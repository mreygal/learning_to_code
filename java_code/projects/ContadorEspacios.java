/* Contador de espacios.
 * 
 * Programa que cuenta el número de espacios de las frases introducidas
 * dentro del código.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

public class ContadorEspacios {
    public static void main(String[] args) {
        
        String[] frasesArray = new String[2];
        int[] espaciosArray = new int[2];
        
        frasesArray[0] = "Quiza seria bueno convencerle.";
        frasesArray[1] = "Podriamos conseguir muy buenos resultados, sin duda alguna.";
        
        int contadorEspacios1 = 0;
        int contadorEspacios2 = 0;

        for (int i = 0; i < frasesArray[0].length(); i++) {
            if (frasesArray[0].charAt(i) == ' ') {
                contadorEspacios1++;
            }
            espaciosArray[0] = contadorEspacios1;
        }
        
        for (int i = 0; i < frasesArray[1].length(); i++) {
            if (frasesArray[1].charAt(i) == ' ') {
                contadorEspacios2++;
            }
            espaciosArray[1] = contadorEspacios2;
        }
        
        for (int i = 0; i < espaciosArray.length; i++) {
            System.out.print(espaciosArray[i]);
            
            if (i < espaciosArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
