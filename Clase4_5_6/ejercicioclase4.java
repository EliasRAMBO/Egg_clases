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
 * Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a 
* cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
* El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
* pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class ejercicioclase4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,suma,i;
        suma=0;
        i=0;
        do{
            System.out.println("Ingrese numero");
            num=leer.nextInt();
            if(num==0){
                System.out.println("Se capturo el numero cero");
                break;
            }else if(num>0){
                suma+=num;
            }

            i++;
        }while(i<20);
        System.out.println("La suma es :"+suma);
    }
}
