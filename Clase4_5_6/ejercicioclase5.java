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
public class ejercicioclase5 {

    /**
     * @param args the command line arguments
     * Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
* imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        for(int i=0;i<4;i++){
            do{
                System.out.println("Ingrese numero "+(i+1));
                num=leer.nextInt();
            }while(num<1||num>20);
            System.out.print(num);
            for(int j=0;j<num;j++){
                System.out.print("*"); 
            }
            System.out.println("");
            
        }
    }
    
}
