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
public class ejerclase2 {

    /**
     * @param args the command line arguments
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
     * validando que el primer número múltiplo del segundo e imprima
     * si el primer número es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un numero :");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero :");
        num2=leer.nextInt();
        EsMultiplo(num1,num2);
        
        
    }
    public static void EsMultiplo(int uno,int dos){
        if ((uno%dos)==0) {
            System.out.println("El numero "+uno+" es multiplo de "+dos);
        }else{
            System.out.println("El numero "+uno+" no es multiplo de "+dos);
        }
    }
    
}
