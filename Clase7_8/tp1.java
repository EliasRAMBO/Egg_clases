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
public class tp1 {

    /**
     * @param args the command line arguments
     * 
    Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    * restar, multiplicar y dividir. La aplicación debe tener 
    * una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1=0,num2=0,elegir=0;
        double resultado=0;
        System.out.println("Ingrese numero :");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero :");
        num2=leer.nextInt();
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        elegir=leer.nextInt();
        switch (elegir) {
            case 1:
                resultado=sumar(num1,num2);
                break;
            case 2:
                resultado=restar(num1,num2);
                break;
            case 3:
                resultado=multiplicar(num1,num2);
                break;
            case 4:
                resultado=dividir(num1,num2);
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
        if (elegir>0 && elegir<5) {
            System.out.println("El resultado es "+resultado);
        }
    }

    public static int sumar(int num1, int num2) {
        int suma=num1+num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta=num1-num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int mult=num1*num2;
        return mult;
    }

    public static double dividir(int num1, int num2) {
        double div=(num1/num2);
        return div;
    }
    
}
