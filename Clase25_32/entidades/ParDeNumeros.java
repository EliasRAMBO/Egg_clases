/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32.entidades;

/**
 * Realizar una clase llamada ParDeNumeros que tenga como
    * atributos dos números reales con los cuales se realizarán diferentes 
    * operaciones matemáticas. La clase debe tener un constructor vacío,
    * getters y setters.  En el constructor vacío se usará el Math.random para 
    * generar los dos números.
 * @author elias
 */
public class ParDeNumeros {
    private int num1,num2;

    public ParDeNumeros() {
        this.num1=(int) (Math.random() * 10);
        this.num2=(int) (Math.random() * 10);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
