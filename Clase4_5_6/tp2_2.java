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
public class tp2_2 {

    /**
     * @param args the command line arguments
     * 
     * Declarar cuatro variables de tipo entero A, B, C y D 
     * y asignarle un valor diferente a cada una. 
     * A continuación, realizar las instrucciones necesarias
     * para que: B tome el valor de C, C tome el valor de A,
     * A tome el valor de D y D tome el valor de B. Mostrar
     * los valores iniciales y los valores finales de cada variable.
     * Utilizar sólo una variable auxiliar.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = sc.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int B = sc.nextInt();

        System.out.print("Ingrese el valor de C: ");
        int C = sc.nextInt();

        System.out.print("Ingrese el valor de D: ");
        int D = sc.nextInt();

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + D);
        System.out.println("B: " + B);
        System.out.println("C: " + A);
        System.out.println("D: " + C);

        System.out.println("Valores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
   }  
}
