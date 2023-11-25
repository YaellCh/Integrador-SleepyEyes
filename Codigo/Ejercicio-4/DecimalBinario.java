package decimal;
import java.util.Scanner;

/** @author Yael Antonio Chávez Atanacio
 
 */
public class DecimalBinario {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
         // Se crea un objeto Scanner para leer la entrada del usuario.
    Scanner in = new Scanner(System.in); 
    // Se solicita al usuario que ingrese un número decimal entero positivo o negativo.
    System.out.println("Ingrese el número decimal entero positivo o negativo:");    
    // Se lee el número ingresado por el usuario.
    int numeroDecimal = in.nextInt();    
    // Se cierra el objeto Scanner para evitar fugas de recursos.
    in.close();   
    // Se inicializa una cadena binaria para almacenar la representación binaria del número.
    String binario = "";   
    // Se crea una copia del número original para preservar su valor.
    int numero = numeroDecimal;
    
    // Si el número es negativo, se convierte a positivo para trabajar con su representación binaria.
    if (numero < 0) {
        numero *= -1;
    } 
    // Si el número es positivo, se realiza la conversión a binario mediante el algoritmo de división por 2.
    if (numero > 0) {
        while (numero != 0) {
            int residuo = numero % 2;
            binario = residuo + binario;
            numero = numero / 2;
        }
    }
    // Se restablece el valor de 'numero' al valor original.
    numero = numeroDecimal;
    // Si el número original es igual a cero, se establece la representación binaria como "0".
    if (numero == 0) {
        binario = "0";
    } else if (numero < 0) {
        // Si el número original es negativo, se realiza la conversión y ajustes necesarios.
        
        // Se busca el índice del último '1' en la representación binaria.
        int indiceUltimoUno = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                indiceUltimoUno = i;
                break;
            }
        }
        
        // Se crea una cadena invertida y se reemplazan los '1' por '#' para su posterior inversión.
        String binarioInvertido = binario.substring(0, indiceUltimoUno);
        binarioInvertido.replaceAll("1", "#");
        binarioInvertido.replaceAll("0", "1");
        binarioInvertido.replaceAll("#", "1");
        
        // Se construye la representación binaria final para el número negativo.
        binarioInvertido = "-" + binarioInvertido + binario.substring(indiceUltimoUno);
        binario = binarioInvertido;
    } 
    // Se imprime el resultado final.
    System.out.println("\nEl número convertido a binario es: " + binario);
    }
}
