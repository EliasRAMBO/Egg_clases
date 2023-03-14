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
public class tp2_10 {

    /**
     * @param args the command line arguments
     * 
     * Realice un programa para que el usuario adivine el resultado de una 
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta.
     * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente.
     * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1=0,num2=0,n=0;
        num1=(int) (Math.random()*10);
        num2=(int) (Math.random()*10);
        System.out.println("Intente hacertar el numero random entre 0-100");
        do {
            System.out.println("Ingrese numero :");
            n=leer.nextInt();
            if(n==(num1*num2)){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        } while (n!=(num1*num2));
        
    }
    
}
