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
public class tp2_6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas 
     * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cantpersonas=0,cantdeb=0;
        double per=0,personas=0,perdeb=0;
        System.out.println("Ingrese cantidad de personas : ");
        cantpersonas=leer.nextInt();
        for (int i = 0; i < cantpersonas; i++) {
            System.out.println("Ingrese la estatura ");
            per=leer.nextDouble();
            if(per<1.6){
               perdeb+=per;
               cantdeb++;
            }
            personas+=per;
        }
        System.out.println("La cantidad de el promedio de estaturas menores a 1.60 : "+(perdeb/cantdeb)+" y el promedio general :"+(personas/cantpersonas));
    }
    
}
