/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_5_6;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class tp1_5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de 
     * los numeros introducidos supere el limite inicial.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite ");
        int limit=leer.nextInt();
        int suma=0;
        do {
            System.out.println("Ingrese un numero");
            suma+=leer.nextInt();
        } while (limit>suma);
        System.out.println("La suma es "+suma);
    }
    
}
