package com.itsoeh.recta;
import java.util.Scanner;
/**
 * @author Yael Antonio Chávez Atanacio
 */
public class EcuacionRecta {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear variable de escaneo de datos
        Scanner puntos =new Scanner(System.in);
        
        //Solicitar puntos para ecuacion de la recta 
        System.out.println("""
                           Ingresa las cordenadas del punto 1.
                           Separadas por una coma(x,y):
                           """);
        String [] punto1 =puntos.nextLine().split(",");
        
        System.out.println("""
                           Ingresa las cordenadas del punto 2.
                           Separadas por una coma(x,y):
                           """);
        String [] punto2 =puntos.nextLine().split(",");
        
        //Cerrar el escaneo
        puntos.close();
        
       //Asignar valor de coordenadas a x,y para dos puntos 
       int x1= Integer.parseInt(punto1[0].trim());
       int y1= Integer.parseInt(punto1[1].trim());
       
       int x2= Integer.parseInt(punto2[0].trim());
       int y2= Integer.parseInt(punto2[1].trim());
       
       //Calculo para la inclinacion de la recta  
       double m = (double)(y2 - y1)/(x2 - x1);
       
       // Calcular Interseccion de la recta
        Double b = y1 - (m * x1);

        // Calcular el ángulo interno $\alpha$
        Double alpha = Math.atan(m);

        //Imprimir el resultado  de la ecuación de la recta
        System.out.println("Ecuación de la recta: \n" +
                            m + " x + " + b +" y ");
        //Imprimir el resultado de el ángulo interno 
        System.out.println("El ángulo interno entre la recta y el eje horizontal es: " 
                + String.format("%.3f", Math.toDegrees(alpha)) + " Grados");
    }
}
