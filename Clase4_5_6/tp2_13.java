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
public class tp2_13 {

    /**
     * @param args the command line arguments
     * Crear un programa que dibuje una escalera de números, 
     * donde cada línea de números comience en uno y termine
     * en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
     * Ejemplo: si se ingresa el número 3
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero de escalones :");
        num=leer.nextInt();
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < 1+i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
