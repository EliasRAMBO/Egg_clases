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
public class tp1_2 {

    /**
     * @param args the command line arguments
     * Crear un programa que pida una frase y si esa frase es 
     * igual a “eureka” el programa pondrá un mensaje de Correcto, 
     * sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra :");
        String palabra=leer.next();
        if (palabra.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
