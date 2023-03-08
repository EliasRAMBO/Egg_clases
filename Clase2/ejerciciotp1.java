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
public class ejerciciotp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que pida dos números enteros por teclado y calcule 
        //la suma de los dos. El programa deberá después mostrar el resultado de la suma
        int num1,num2;
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("El la suma de los numeros es :"+(num1+num2));
    }
    
}
