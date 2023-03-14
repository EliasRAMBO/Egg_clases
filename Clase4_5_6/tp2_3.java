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
public class tp2_3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra 
     * y se detecte si se trata de una vocal. Caso contrario
     * mostrar un mensaje. Nota: investigar la función equals() de la clase String.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = scanner.nextLine().toLowerCase(); // convertir a minúsculas para comparar con las vocales
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
    }
}
