/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18.entidades;

/**
 **Crear una clase llamada Operacion que tenga com
 * o atributos privados numero1 y numero2.
 * A continuación, se deben crear los siguientes métodos:
 * 
Método constructor con todos los atributos pasados por parámetro.-
Método constructor sin los atributos pasados por parámetro.-
Métodos get y set.-
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.-
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
* fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el 
* error. Si no, se hace la multiplicación y se devuelve el resultado al main
* 
Método dividir(): primero valida que no se haga una división por cero, si fuera a
* pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
* error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 * @author elias
 */
public class Operacion {
    private float numero1;
    private float numero2;

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(float n1,float n2){
        numero1=n1;
        numero2=n2;
    }
    public float sumar(){
        return (numero1+numero2);
    }
    public  float restar(){
        return (numero1-numero2);
    }
    public float multiplicar(){
        if (numero1==0||numero2==0) {
            System.out.println("Error multiplicar por cero");
            return 0;
        }
        return (numero1*numero2);
    }
    public float dividir(){     
        if (numero1==0||numero2==0) {
            System.out.println("Error dividir por cero");
            return 0;
        }
        float div=(float)(numero1/numero2);
        return div;
    }
    
}
