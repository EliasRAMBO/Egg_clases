/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18.entidades;

import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado
     * el radio de tipo real. A continuación, se deben crear los siguientes métodos:
     * 
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 * @author elias
 */
public class Circunferencia {
    private float radio;

    public Circunferencia() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio=leer.nextFloat();
    }
    public void area(){
        float area=(float)(Math.pow((Math.PI*this.radio),2));
        System.out.println(area);
    }
    public void perimetro(){
        float perimetro=(float)(2*(Math.PI)*radio);
        System.out.println(perimetro);
    }
}
