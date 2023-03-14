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
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
 * Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
 * Nota: recordar que las variables de tipo entero truncan los números o resultados.

 */
public class tp2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero,i=0;
        String num;
        System.out.println("Ingrese Numero :");
        numero=leer.nextInt();
        System.out.print("Su composicion es : ");
        while(i!=numero){
        i++;
        System.out.print(i);
        }
        System.out.println("");
    }
    
}
