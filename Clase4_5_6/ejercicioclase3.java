package Clase4_5_6;


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
public class ejercicioclase3 {

    /**
     * @param args the command line arguments
     * Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, 
* sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese nota :");
        nota=leer.nextInt();
        while(nota<0||nota>10){
            System.out.println("Ingrese nota :");
            nota=leer.nextInt();
        }
    }
    
}
