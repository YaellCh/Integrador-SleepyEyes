/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa5;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Brayan Hernandez Martinez.
 */
public class Programa5 {

    public static void main(String[] args) {
        // Se agrega Scanner.
        Scanner bin = new Scanner(System.in);
        // Se agrego boolean para tener un control del siguiente bucle
        boolean continuar  = true;
        // While utilizado para crear un bucle el cual siga pidiendo numeros binarios
        while (continuar ){
            System.out.println("Ingrese el numero binario: ");
            String entrada = bin.nextLine();
            // Verificar si el usuario desea salir ingresando 'x'.
            if (entrada.equalsIgnoreCase("x")){ // Si se ingresa 'x', se establece la variable 'continuar' como falsa para salir del bucle.
                continuar = false;
                continue;
                // Se utiliza "continue" para saltar el resto del bucle y comenzar una nueva iteración
            }
            BigInteger decimal = ConvertirBinarioADecimal(entrada);
            System.out.println("El equivalente en decimal es: "+decimal);
        }
    }
          // Método para convertir un número binario a decimal.
    public static BigInteger ConvertirBinarioADecimal(String binario) {
        return new BigInteger(binario, 2);
    }
}
