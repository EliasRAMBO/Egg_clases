/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2_3;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class ejerciciotp2 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Escriba su nombre");
        nombre= leer.next();
        System.out.println("Su nombre es "+nombre);
    }
    
}
