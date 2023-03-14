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
 * Realice un programa que calcule y visualice el valor máximo, 
 * el valor mínimo y el promedio de n números (n>0). 
 * El valor de n se solicitará al principio del programa y 
 * los números serán introducidos por el usuario. Realice dos 
 * versiones del programa, una usando el bucle “while” y otra 
 * con el bucle “do - while”.

 */
public class tp2_7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo,
     * el valor mínimo y el promedio de n números (n>0).
     * El valor de n se solicitará al principio del programa 
     * y los números serán introducidos por el usuario. 
     * Realice dos versiones del programa,
     * una usando el bucle “while” y otra con el bucle “do - while”.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int max=0,min=0,num=0,n=0,i=0;
        double prom=0;
        System.out.println("Ingrese cantidad de numeros : ");
        n=leer.nextInt();
        
        System.out.println("Ingrese numero");
        num=leer.nextInt();
        max=num;
        min=num;
        prom+=num;
        i++; 
        do {
            if (i==n) {
                break;
            }
           System.out.println("Ingrese numero");
           num=leer.nextInt();
           if(num>max){
            max=num;
           }else if (num<min) {
               min=num; 
            }
           prom+=num;
           i++; 
        } while (i<n);
        /*
        while(i<n){
           System.out.println("Ingrese numero");
           num=leer.nextInt();
           if(num>max){
            max=num;
           }else if (num<min) {
               min=num; 
            }
           prom+=num;
           i++; 
        }
        */
        System.out.println("El minimo de los numeros es "+min+" , el maximo es "+max+" y el promedio es "+(prom/n));
    }
    
}
