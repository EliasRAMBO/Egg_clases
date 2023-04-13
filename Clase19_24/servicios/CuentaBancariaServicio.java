/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.servicios;

import Clase19_24.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * 
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 * @author elias
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public void ingresar(CuentaBancaria b){
        long a;
        System.out.println("Ingrese la cantidad de dinero a ingresar : ");
        a=leer.nextLong();
        b.setSaldoActual((b.getSaldoActual()+a));
    }
    public void retirar(CuentaBancaria b){
        long a;
        System.out.println("Ingrese la cantidad de dinero a sacar : ");
        
        a=leer.nextLong();
        if (a>b.getSaldoActual()) {
            a=b.getSaldoActual();
        }
        b.setSaldoActual((b.getSaldoActual()-a));
    }
    public void estraccionRapida(CuentaBancaria b){
        long a;
        do {
            System.out.println("Ingrese la cantidad de dinero a retirar(max 20% del saldo) : ");
            consultarSaldo(b);
            a=leer.nextLong();
        } while (a>(b.getSaldoActual()*0.2));
        b.setSaldoActual(b.getSaldoActual()-a);
    }
    public void consultarSaldo(CuentaBancaria b){
        System.out.println("Saldo actual :"+b.getSaldoActual());
    }
    public void consultarDatos(CuentaBancaria b){
        System.out.println("Dni :"+b.getDniCliente());
        System.out.println("Numero de cuenta :"+b.getNumeroCuenta());
        System.out.println("Saldo actual :"+b.getSaldoActual());
    }
}
