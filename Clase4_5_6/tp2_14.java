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
public class tp2_14 {

    /**
     * @param args the command line arguments
     * Se dispone de un conjunto de N familias,
     * cada una de las cuales tiene una M cantidad de hijos.
     * Escriba un programa que pida la cantidad de familias y para 
     * cada familia la cantidad de hijos para averiguar la media
     * de edad de los hijos de todas las familias
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int fam=0,hijos=0,edad=0,conth=0,cont=0;
        double prom_fam=0,promtotal=0;
        System.out.println("Ingrese cantidad de familias :");
        fam=leer.nextInt();
        for (int i = 1; i < fam+1; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+i);
            hijos=leer.nextInt();
            conth=0;
            prom_fam=0;
            for (int j = 1; j < hijos+1; j++) {
                System.out.println("Ingrese la edad del hijo nº"+j);
                edad=leer.nextInt();
                prom_fam+=edad;
                conth++;
                cont++;
            }
            
            promtotal+=prom_fam;
            System.out.println("La edad promedio de la familia es "+prom_fam/conth);
        }
        System.out.println("La edad promedio entre todas las familias es "+promtotal/cont);
    }
    
}
