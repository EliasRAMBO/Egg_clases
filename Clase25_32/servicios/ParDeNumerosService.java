/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32.servicios;

import Clase25_32.entidades.ParDeNumeros;

/**
 *Crear una clase ParDeNumerosService, en el paquete Servicios, 
    * que deberá además implementar los siguientes métodos:
    * 
    Método mostrarValores que muestra cuáles son los dos números guardados.
    * 
    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    * 
    Método calcularPotencia para calcular la potencia del mayor valor de la clase
    * elevado al menor número. Previamente se deben redondear ambos valores.
    * 
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
    * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * @author elias
 */
public class ParDeNumerosService {
    /**
     * Método mostrarValores que muestra cuáles son los dos números guardados.
     * @param num 
     */
    public void mostrarValores(ParDeNumeros num){
        System.out.println("Numero 1 :"+num.getNum1());
        System.out.println("Numero 2 :"+num.getNum2());
    }
    /**
     * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
     * @param num
     * @return 
     */
    public int devolverMayor(ParDeNumeros num){
        int mayor;
        if (num.getNum1()>num.getNum2()) {
            mayor=num.getNum1();
        }else{
            mayor=num.getNum2();
        }
        
        return mayor;
    }
    /**
     *  Método calcularPotencia para calcular la potencia del mayor valor de la clase
     *  elevado al menor número. Previamente se deben redondear ambos valores.
     * @param num
     * @return 
     */
    public int calcularPotencia(ParDeNumeros num){
        int pot,may;
        may=devolverMayor(num);
        if (may==num.getNum1()) {
            pot=(int) Math.pow(num.getNum1(),num.getNum2());
        }else{
            pot=(int) Math.pow(num.getNum2(),num.getNum1());
        }
        return pot;
    }
    /**
     *  Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
     *  Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     * @param num
     * @return 
     */
    public  double calcularRaiz(ParDeNumeros num){
        double raiz,may;
        may=devolverMayor(num);
        if (may!=num.getNum1()) {
            raiz=Math.sqrt(Math.abs(num.getNum1()));
        }else{
            raiz=Math.sqrt(Math.abs(num.getNum2()));
        }
        return raiz;
    }
    
}
