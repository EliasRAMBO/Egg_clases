/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24;

import Clase19_24.entidades.Fraccion;
import Clase19_24.servicios.ServicioFraccion;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class extraextra1 {

    /**
     * Crear una clase llamada fracción que contenga 4 atributos
     * (denominador y numerador de cada fracción). 
     * 
    * Crear la clase servicio que contenga métodos para 
    * sumar, restar, multiplicar y dividir fracciones. 
    * 
    * Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int menu;
        Fraccion fr=new Fraccion(1,3,1,2);
        ServicioFraccion sf=new ServicioFraccion();
        do {
            System.out.println("Menu");
            System.out.println("1)Suma");
            System.out.println("2)Resta");
            System.out.println("3)Multiplicar");
            System.out.println("4)Dividir");
            System.out.println("5)Salir");
            System.out.println("");
            menu=leer.nextInt();
            switch (menu) {
                case 1:
                    sf.sumar(fr);
                    break;
                case 2:
                    sf.resta(fr);
                    break;
                case 3:
                    sf.multiplicacion(fr);
                    break;
                case 4:
                    sf.divicion(fr);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Elija un numero valido");;
            }
        } while (menu!=5);             
    }
    
}
