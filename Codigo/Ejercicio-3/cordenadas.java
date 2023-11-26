/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.compendio_fundamentos;
import java.util.Scanner;
/**
 *
 * @author cruzmartinezalejandro
 */
public class cordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner dato = new Scanner(System.in);

        // solicitamos al usuario las cordenadas el punto C (x1,y1)
        System.out.print("Ingrese las coordenada del punto C  x1: ");
        int x1 = dato.nextInt();
        System.out.print("Ingrese las coordenada del punto C y1: ");
        int y1 = dato.nextInt();
        // solicitamos el radio de la circunferencia
        System.out.println("Ingrese el radio de la circunferencia: ");
        int radio = dato.nextInt();
        // solicitamos al usuario las coordenadas del punto T (x2,y2)
        System.out.print("Ingrese las coordenada del punto T X2: ");
        int x2 = dato.nextInt();
        System.out.print("Ingrese las coordenada del punto T Y2: ");
        int y2 = dato.nextInt();

        // Cálculo de la distancia entre el punto C y el punto T
        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
         //imprimimos la distancia
         System.out.println("la distancia es de "+distancia);
        
        //si el radio es negativo lo pasamos a positivo
        

        // Si la distancia es menor o igual al radio, el punto T está dentro de la circunferencia  
        if(radio<0){
            
        
        int radio2=radio*-1;
        if (distancia <= radio2) {
            System.out.println("El punto T está dentro de la circunferencia");
        } else {
            System.out.println("El punto T no está dentro de la circunferencia");
        }
        }
        
       if(radio>0){
           
       
            if (distancia <= radio) {
            System.out.println("El punto T está dentro de la circunferencia");
        } else {
            System.out.println("El punto T no está dentro de la circunferencia");
        }
    }
    
    
    }
    
}
