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
public class ejercicioclase1 {

    /**
     * @param args the command line arguments
     * Implementar un programa que le pida dos números enteros al usuario y
     * determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un numero ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero ");
        num2=leer.nextInt();
        if(num1>25||num2>25){
            System.out.println("ambos o alguno de ellos es mayor a 25");
        }else{
            System.out.println("Ninguno es mayor a 25");
        }
    }
}
