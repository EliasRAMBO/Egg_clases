/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.servicios;

import Clase19_24.entidades.Persona;
import java.util.Scanner;

/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * 
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    * 
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
    * usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
    * Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    * 
    Método calcularIMC(): calculara si la persona está en su peso ideal
    * 
    * (peso en kg/(altura^2 en mt2)). 
    * 
    * Si esta fórmula da por resultado un valor menor que 20,
    * significa que la persona está por debajo de su peso ideal y la función devuelve un -1
    * 
    * . Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
    * significa que la persona está en su peso ideal y la función devuelve un 0.
    * 
    * Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa
    * que la persona tiene sobrepeso, y la función devuelve un 1.
    * 
 * @author elias
 */
public class PersonaServicio {
    public boolean esMayorDeEdad(Persona p){
        boolean result=false;
        
        if(p.getEdad()>17){
            result=true;
        }
        
        return result;
    }
    public int calcularIMC(Persona p){
        float form;
        int rest=0;
        form=(float) (p.getPeso()/(Math.pow(p.getAltura(),2)));
        if (form<20) {
            rest=-1;
        }else{
            if (form>=20 && form<=25) {
                rest=0;
            }else{
                rest=1;
            }
        }
        return rest;
    }
    public Persona crearPersona(){
        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese Nombre :");
        nombre=leer.next();
        do {
            System.out.println("Ingrese edad :");
            edad=leer.nextInt();
        } while (edad<0);
        do {
            System.out.println("Ingrese sexo(f o m) :");
            sexo=leer.next().charAt(0);
        } while (sexo!='f' && sexo!='m');
        do {
            System.out.println("Ingrese peso :");
            peso=leer.nextFloat();
        } while (peso<0);
         do {
            System.out.println("Ingrese altura :");
            altura=leer.nextFloat();
        } while (altura<0);
         
        return new Persona(nombre, edad, sexo, peso, altura);
    }
}
