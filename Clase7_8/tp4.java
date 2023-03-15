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
public class tp4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado 
     * y con una función se lo pasamos por parámetro para que nos
     * indique si es o no un número primo, 
     * debe devolver true si es primo, sino false.
       Un número primo es aquel que solo puede dividirse entre 1 y sí mismo
       Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero :");
        int num=leer.nextInt();
        boolean primo;
        primo=prim(num);
        if(primo){
            System.out.println(num+" Es primo");
        }else{
            System.out.println(num+" no Es primo");
        }
        
    }
    public static boolean prim (int num) {
        boolean retorno=true;
        int cont=0;
        for (int i =num ; i > 0; i--) {
            if(num%i==0){
                cont++;
            }
            if (cont>2) {
                retorno=false;
                break;
            }
        }   
        return retorno;
    }
    
}
