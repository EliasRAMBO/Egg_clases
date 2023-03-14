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
 * Simular la división usando solamente restas.
 * Dados dos números enteros mayores que uno,
 * realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
 * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
 * este resultado es el residuo, y el número de restas realizadas es el cociente.
 * Por ejemplo: 50 / 13:
    
    50 – 13 = 37     una resta realizada
    37 – 13 = 24     dos restas realizadas
    24 – 13 = 11     tres restas realizadas


 */
public class tp2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1=0,num2=0;
        System.out.println("Ingrese un numero :");
        num1=leer.nextInt();
        System.out.println("Ingrese el divisor :");
        num2=leer.nextInt();
        do {
            System.out.println(num1+" - "+num2+" = "+(num1-num2));
            num1-=num2;
        } while (num1>num2);
        
    }
    
}
