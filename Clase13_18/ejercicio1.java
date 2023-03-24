/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18;

import Clase13_18.entidades.Libro;

/**
 *
 * @author elias
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a;
        Libro lib=new Libro(5,"Marciano","Jose luis",3);
        lib.cargar_libro();
        lib.mostrar_libro();
    }
    
}
