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
public class tp1_6 {

    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por teclado
     * y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
     * y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
     * si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
     * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir
     * del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
     * caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int opcion;
        String salir="n";
        do {
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion :");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma es "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La muliplicacion es "+(num1*num2));
                    break;
                case 4:
                    if (num2>0) {
                        System.out.println("La division es "+(num1/num2));
                    }else{
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir (s/n)");
                    salir=leer.next();
                    break;
            }
        } while (salir.equalsIgnoreCase("n"));
    }
}
