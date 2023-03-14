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
public class tp1_1 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Inrgese numero :");
        int num=leer.nextInt();
        if (num%2!=0) {
            System.out.println("Es impar");
        }else{
            System.out.println("Es par");
        }
    }
    
}
