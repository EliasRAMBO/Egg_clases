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
public class tp1_8 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero ");
        num=leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i==0||i==num-1) {
                    System.out.print("*");
                }else if (j==0||j==num-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
    
}
