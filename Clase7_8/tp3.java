/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class tp3 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que a través de una función
     * nos convierta una cantidad de euros introducida 
     * por teclado a otra moneda, estas pueden ser a dólares,
     * yenes o libras. La función tendrá como parámetros, 
     * la cantidad de euros y la moneda a convertir que será
     * una cadena, este no devolverá ningún valor y mostrará 
     * un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String moneda="";
        double cant=0;
        System.out.println("Ingrese cantidad de euros :");
        cant=leer.nextDouble();
        System.out.println("Escriba la conversion (libras/pesos/yenes) :");
        moneda=leer.next().toLowerCase();
        
        divisa(cant,moneda);
    }

    public static void divisa(double cant,String div) {
        switch (div) {
            case "libras":
                System.out.println(cant+" € son "+(cant*0.86)+" libras");
                break;
            case "pesos":
                System.out.println(cant+" € son "+(cant*1.28611)+" pesos");
                break;
            case "yenes":
                System.out.println(cant+" € son "+(cant*129.852)+" yenes");
                break;
        }
    }
    
}
