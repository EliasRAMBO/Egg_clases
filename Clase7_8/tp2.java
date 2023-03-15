/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class tp2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas
     * e imprima los datos de las personas ingresadas por teclado e 
     * indique si son mayores o menores de edad. Después de cada persona,
     * el programa debe preguntarle al usuario 
     * si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String no="si";
        do {            
            personas();
            System.out.println("Quiere seguir mostrando personas?(No) :");
            no=leer.next();
        } while (!no.equals("No"));
    }

    public static void personas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre :");
        String nombre=leer.next();
        System.out.println("Ingrese edad :");
        int edad=leer.nextInt();
        if (edad<18) {
            System.out.println(nombre+" de "+edad+" es menor de edad");
        }else{
            System.out.println(nombre+" de "+edad+" es mayor de edad");
        }
    }
    
}
