/* Contador de letras "a".
 * 
 * Programa que muestra la frase con más letras "a" totales escritas hasta el
 * momento.
 *
 * Hecho por mreygal para ASIR.
 */

package examples;

import java.util.Scanner; // Importo el scanner

public class ContadorDeAs {
    
    Scanner entrada = new Scanner(System.in); // Creo el scanner

    String fraseActual; // Para almacenar la frase actual como string
    String laFraseConMasAs; // Para almacenar la frase con más 'a' como string
    char comillas = '"'; // Variable para poner comillas dobles en vez de simples
    int masAsAnteriormente = 0; // Para almacenar el número de 'a' más alto en una sola frase, hasta el momento
    int numeroDeAs = 0; // Necesito inicializar la variable aquí para que pueda ser accedida desde public void compararAs()
    
    
    public static void main(String[] args) {

        ContadorDeAs programa = new ContadorDeAs(); // Creo la clase programa del tipo FrasesConMasAs
        
        programa.inicio(); // Llamo al método inicio
    }
    
    /* MÉTODO INICIO
     * En este método se pide al usuario que introduzca la frase y se sigue
     * pidiendo otra siempre y cuando ésta no sea "fin". Si no es "fin", se
     * llama a los métodos procesarFrase, compararAs y mostrarResultadoActual.
     * Si la frase es "fin", entonces se muestra la frase con más 'a' y el
     * número de 'a' de esa frase, y se cierra el scanner, finalizando todo:
     */
    public void inicio() {
        entrada = new Scanner(System.in);
        do { // Bucle do while para seguir preguntando mientras no sea "fin"
            System.out.println("Escribe una frase (acaba el programa si escribes 'fin'): ");
            fraseActual = entrada.nextLine();
            if (!fraseActual.equals("fin")) {
                procesarFrase();
                compararAs();
                mostrarResultadoActual();
            }
        } while (!fraseActual.equals("fin"));
        
        System.out.println("La frase con más 'a' es: " + comillas + laFraseConMasAs + comillas);
        System.out.println("Tiene " + masAsAnteriormente + " 'a'.");
        entrada.close();
    }

    
    /* MÉTODO PROCESAR FRASE
     * En este método se cuenta el número de 'a' con un bucle que recorre el
     * string de fraseActual y cuenta las 'a', 'á', 'A' y 'Á' que hay en el
     * string, con lo que se tiene el total de 'a' (y sus variantes):
     */
    public void procesarFrase() {
        numeroDeAs = 0;
        for (int i = 0; i < fraseActual.length(); i++) {
            if (fraseActual.charAt(i) == 'a' || fraseActual.charAt(i) == 'A' || fraseActual.charAt(i) == 'á' || fraseActual.charAt(i) == 'Á') {
                numeroDeAs++;
            }
        }
    }

    /* MÉTODO COMPARAR AS
     * En este método se hace un condicional. Partiendo de la base que la variable
     * masAsAnteriormente se inicializó al principio en 0, se mira si el número
     * de 'a' del método anterior es mayor que ese 0. Si lo es, ese 0 se iguala
     * al número de 'a' de la frase anteriormente introducida y laFraseConMasAs
     * toma el valor de string de la frase introducida en ese momento. De esta
     * forma, se puede siempre tener la frase con más 'a' actualizada en todo
     * momento. La variable numeroDeAs tuvo que ser inicializada al principio
     * para que este método pudiera reconocerla, al haber sido inicializada
     * y reconocible en todos los métodos:
     */
    public void compararAs() {
        if (numeroDeAs > masAsAnteriormente) {
            masAsAnteriormente = numeroDeAs;
            laFraseConMasAs = fraseActual;
        }   
    }
   
    /* MÉTODO MOSTRAR RESULTADO FINAL
     * En este método sencillamente se muestra la frase con más 'a' y se dice el
     * número de 'a' que tiene:
     */
    public void mostrarResultadoActual() {
        System.out.println("La frase con más 'a' es: " + comillas + laFraseConMasAs + comillas);
        System.out.println("Tiene " + masAsAnteriormente + " 'a'.");
    }
}
