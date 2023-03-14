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
 * Escriba un programa que lea números enteros. 
 * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
 * la cantidad de números pares y la cantidad de números impares.
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse.
 * Nota: recordar el uso de la sentencia break.
 */
public class tp2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int par=0,impar=0,neutro=0,n=0;
        do {
            do {
                System.out.println("Ingrese un numero :");
                n=leer.nextInt();
            } while (n<0);            
            if ((n%5)==0) {
                break;
            }
            if (n%2==0) {
                par++;
            }else if (n!=0) {
                impar++;
            }else{
                neutro++;
            }
        } while ((n%5)!=0);
        System.out.println("Numeros leidos "+(par+impar+neutro)+" numeros pares "+par+" numeros impares "+impar);
    }
    
}
