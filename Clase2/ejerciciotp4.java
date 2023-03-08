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
public class ejerciciotp4 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente 
     * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

     */
    public static void main(String[] args) {
        // TODO code application logic here
        float cent;
        float far;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados :");
        cent=leer.nextFloat();
        far=32+(9*(cent/5));
        System.out.println("Fahrenheit : "+far);
        
    }
    
}
