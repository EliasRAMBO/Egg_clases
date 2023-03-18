/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase9_10_11;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class guia1 {

    /**
     * @param args the command line arguments
     * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
     * de compañeros de equipo y define su tipo de dato de tal manera 
     * que te permita alojar sus nombres más adelante.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] equipo=new String[5];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de compañero :");
            equipo[i]=leer.next();
        }
        System.out.println("Los integrantes de tu equipo son :");
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo[i]);
        }
    }
    
}
