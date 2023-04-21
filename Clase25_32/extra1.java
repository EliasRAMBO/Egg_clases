/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32;

import Clase25_32.entidades.juegoMeses;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class extra1 {

    /**
     * Crea una clase en Java donde declares una variable 
     * de tipo array de Strings que contenga los doce meses del año,
     * en minúsculas. A continuación, declara una variable mesSecreto 
     * de tipo String, y hazla igual a un elemento 
     * del array (por ejemplo, mesSecreto = mes[9].
     * El programa debe pedir al usuario que adivine el mes secreto.
     * Si el usuario acierta mostrar un mensaje, y si no lo hace, 
     * pedir que vuelva a intentar adivinar el mes secreto.
     * 
     * Un ejemplo de ejecución del programa podría ser este:
        Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
        No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
        ¡Ha acertado!

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        juegoMeses jueg=new juegoMeses();
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Bienvenido al juego de los meses");
        System.out.println("Adivine el mes secreto :");
        palabra=leer.next();
        while (!palabra.equalsIgnoreCase(jueg.getMesSecreto())) {
            System.out.println("Fallaste.\nIntente otra vez :");
            palabra=leer.next();
        }
        System.out.println("Acertaste");
    }
    
}
