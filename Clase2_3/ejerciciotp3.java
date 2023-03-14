package Clase2_3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class ejerciciotp3 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase=leer.next();
        frase=frase.toUpperCase();
        System.out.println("Frase en mayusc "+frase);
        frase=frase.toLowerCase();
        System.out.println("Frase en minusc "+frase);
    }
    
}
