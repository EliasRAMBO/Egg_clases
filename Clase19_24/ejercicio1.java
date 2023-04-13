/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24;

import Clase19_24.entidades.CuentaBancaria;
import Clase19_24.servicios.CuentaBancariaServicio;

/**
 *
 * @author elias
 */
public class ejercicio1 {

    /**
     * Realizar una clase llamada CuentaBancaria en 
 * el paquete Entidades con los siguientes atributos:
 * numeroCuenta(entero), dniCliente(entero largo),
 * saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    Método para crear cuenta pidiéndole los datos al usuario.
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    * Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria banc=new CuentaBancaria(01,12345678,1500); 
        CuentaBancariaServicio serv=new CuentaBancariaServicio();
        serv.consultarDatos(banc);
        serv.consultarSaldo(banc);
        serv.ingresar(banc);
        serv.consultarSaldo(banc);
        serv.retirar(banc);
        serv.consultarSaldo(banc);
        serv.estraccionRapida(banc);
        serv.consultarSaldo(banc);
    }
    
}
