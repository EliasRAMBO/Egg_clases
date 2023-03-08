/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class ejerciciotp5 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado 
     * y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero :");
        num =leer.nextInt();
        System.out.println("El doble del numero es "+(num*2));
        System.out.println("El triple del numero es "+(num*3));
        System.out.println("la raiz cuadrada del numero es "+(Math.sqrt(num)));
    }
}
