/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18;

import Clase13_18.entidades.Cancion;

/**
 *
 * @author elias
 */
public class extra1 {

    /**
     * Desarrollar una clase Cancion con los siguientes atributos: 
     * título y autor. Se deberá́ definir además dos constructores: 
     * uno vacío que inicializa el título y el autor a cadenas vacías
     * y otro que reciba como parámetros el título y el autor de la canción.
     * Se deberán además definir los métodos getters y setters correspondientes.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //solo pide hacer clase 
        Cancion b =new Cancion("Amarte azul","Jose se paz");
        System.out.println(b.getAutor());
        System.out.println(b.getTitulo());
    }
    
}
