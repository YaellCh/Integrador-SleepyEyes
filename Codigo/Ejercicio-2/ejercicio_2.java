
package com.mycompany.proyecto_integrador;
import java.util.Scanner;
/**
 *
 * @author Maldonado Olguin Irving
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner coeficiente = new Scanner(System.in);
        // Se solicita al usuario ingresar el valor de A.
        System.out.println("Usuario, favor ingresar el valor de A: ");
        double a= coeficiente.nextDouble();
        // Se solicita al usuario ingresar el valor de B.
        System.out.println("Usuario, favor ingresar el valor de B: ");
        double b= coeficiente.nextDouble();
        // Se solicita al usuario ingresar el valor de C.
          System.out.println("Usuario, favor ingresar el valor de C: ");
         double c= coeficiente.nextDouble();
         // Se cierra el objeto Scanner.
         coeficiente.close();
         // Se calcula el discriminate de la ecuaciòn cuadratica.
         double discriminante = b * b - 4 * a * c;
         // Se comprueba el valor del discriminate para dar una solucion.
         if (discriminante > 0) {
             // Calcula las dos soluciones y las muestra.
             double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
             double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
             System.out.println("Las soluciones son x1 = " + x1 + "y x2 = " + x2);
             //Calcula la unica soluciòn y la muestra.
         }else if(discriminante ==0) {
             double x = -b / (2 * a);
             System.out.println("La solución única es x = " + x);
             //Muestra que la ecuacion, no cuenta con una soluciòn.
         }else 
             System.out.println("La ecuación no tiene soluciones reales.");
    }
    
}
