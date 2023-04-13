/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.servicios;

import Clase19_24.entidades.Fraccion;

/**
 *Crear la clase servicio que contenga métodos para 
    * sumar, restar, multiplicar y dividir fracciones. 
 * @author elias
 */
public class ServicioFraccion {
    public void sumar(Fraccion fraccion){
        if (fraccion.getDenominador1()!=fraccion.getDenominador2()) {
            int denominadorcomun=0;
            denominadorcomun=fraccion.getDenominador1()*fraccion.getDenominador2();
            System.out.println("El resultado de la suma es :"+((fraccion.getNumerador1()*fraccion.getDenominador2())+(fraccion.getNumerador2()*fraccion.getDenominador1()))+"/"+denominadorcomun);
        }else{
            System.out.println("El resultado de la suma es :"+(fraccion.getNumerador1()+fraccion.getNumerador2())+"/"+fraccion.getDenominador1());
        }
    }
    public void resta(Fraccion fraccion){
        if (fraccion.getDenominador1()!=fraccion.getDenominador2()) {
            int denominadorcomun=0;
            denominadorcomun=fraccion.getDenominador1()*fraccion.getDenominador2();
            System.out.println("El resultado de la resta es :"+((fraccion.getNumerador1()*fraccion.getDenominador2())-(fraccion.getNumerador2()*fraccion.getDenominador1()))+"/"+denominadorcomun);
        }else{
            System.out.println("El resultado de la resta es :"+(fraccion.getNumerador1()-fraccion.getNumerador2())+"/"+fraccion.getDenominador1());
        }
    }
    public void multiplicacion(Fraccion fraccion){
        System.out.println("La multiplicacion es :"+fraccion.getNumerador1()*fraccion.getNumerador2()+"/"+fraccion.getDenominador1()*fraccion.getDenominador2());
    }
    public void divicion(Fraccion fraccion){
        System.out.println("La multiplicacion es :"+fraccion.getNumerador1()*fraccion.getDenominador2()+"/"+fraccion.getDenominador1()*fraccion.getNumerador2());
    }
}
