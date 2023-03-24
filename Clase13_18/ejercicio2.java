/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18;

import Clase13_18.entidades.Circunferencia;

/**
 *
 * @author elias
 */
public class ejercicio2 {

    /**
     * Declarar una clase llamada Circunferencia que tenga como atributo privado
     * el radio de tipo real. A continuación, se deben crear los siguientes métodos:
     * 
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia b=new Circunferencia(1);
        b.area();
        b.perimetro();
        System.out.println(b.getRadio());
    }
    
}
