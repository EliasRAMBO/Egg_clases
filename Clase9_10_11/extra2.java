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
public class extra2 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores 
     * de N enteros son iguales (la comparación deberá
     * detenerse en cuanto se detecte alguna diferencia entre los elementos)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        boolean band=true;
        System.out.println("Ingrese tamaño de los vectores : ");
        n=leer.nextInt();
        int[] v1=new int[n],v2=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor "+(i+1)+" del vector 1 :");
            v1[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor "+(i+1)+" del vector 2 :");
            v2[i]=leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (v1[i]!=v2[i]) {
                System.out.println("No son iguales ");
                band=false;
                break;
            }
        }
        if (band) {
            System.out.println("Son iguales");
        }
    }
    
}
