/* Desencriptador.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

import java.util.Scanner;


public class Desencriptador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char conjunto1[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        final char conjunto2[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char codificado[];
        String texto;
        System.out.print("Introduzca un texto a DEScodificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        
        codificado = new char[texto.length()];
        
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
        }
        
        texto = new String(codificado);
        
        System.out.println(texto);
    }
    
    static char codifica(char conjunto1[], char conjunto2[], char c) {
        final String conj1 = String.valueOf(conjunto1);
        char codificado;
        int pos = conj1.indexOf(c);
        
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }
}