/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase9_10_11;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class tp6 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una m 3 x 3 
     * formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas. 
     * Crear un programa que permita introducir un cuadrado por teclado 
     * y determine si este cuadrado es mágico o no. 
     * El programa deberá comprobar que los números 
     * introducidos son correctos, es decir, están entre el 1 y el 9.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] m=new int[3][3];
        int num=0,suma=0,sumaEsperada;
        boolean band=false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor en ("+(i+1)+","+(j+1)+")(Entre 1 y 9) :");
                do {
                    m[i][j]=leer.nextInt();
                } while (m[i][j]>9||m[i][j]<1); 
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 suma += m[i][j];
                }      
            }
        sumaEsperada=suma;
           // Comprobamos si las columnas tienen la suma esperada
           for (int j = 0; j < 3; j++) {
               suma = 0;
               for (int i = 0; i < 3; i++) {
                   suma += m[i][j];
               }
               
               if (suma != sumaEsperada) {
                   System.out.println("El cuadrado no es mágico.");
                   return;
               }
           }
           // Comprobamos si la diagonal principal tiene la suma esperada
           suma = 0;
           for (int i = 0; i < 3; i++) {
               suma += m[i][i];
           }
           if (suma != sumaEsperada) {
               System.out.println("El cuadrado no es mágico.");
               return;
           }
           // Comprobamos si la diagonal secundaria tiene la suma esperada
           suma = 0;
           for (int i = 0; i < 3; i++) {
               suma += m[i][2-i];
          }
           if (suma != sumaEsperada) {
               System.out.println("El cuadrado no es mágico.");
               return;
           }else{
              System.out.println("El cubo es magico"); 
           }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
            
        
    }
    
}
