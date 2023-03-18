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
public class extra1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de
     * todos los elementos de un vector de tamaño N
     * , con los valores ingresados por el usuario
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sum=0,tam;
        System.out.println("Ingrese el tamaño del vector : ");
        tam=leer.nextInt();
        int[] vect=new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el "+(i+1)+"º numero :");
            vect[i]=leer.nextInt();
        }
        for (int cos : vect) {
            sum +=cos;
        }
        System.out.println("La suma total de los numeros del vector es : "+sum);
    }
    
}
