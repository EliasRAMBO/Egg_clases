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
public class tp2 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un vector de tamaño N
     * con valores aleatorios y le pida al usuario un número a
     * buscar en el vector. El programa mostrará dónde se encuentra 
     * el numero y si se encuentra repetido

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,num,rep=-1,pos=0;        
        System.out.println("Ingrese el tamaño del vector :");
        n=leer.nextInt();
        int[] vect=new int[n];
        for (int i = 0; i < n; i++) {
            vect[i]=(int)(Math.random()*10);
            System.out.print(vect[i]);
        }
        System.out.println("Ingrese el valor a buscar :");
        num=leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (vect[i]==num) {
                System.out.println("Encontrado en "+i);
                rep++;
                System.out.println("Repetidos : "+rep);
            }
        }
        if (rep==-1) {
            System.out.println("No se encontraron resultados");
        }
    }   
}
