/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.entidades;

/**
 *Cafetera en el paquete Entidades con los atributos
     * capacidadMáxima (la cantidad máxima
     * de café que puede contener la cafetera) y cantidadActual (la 
     * cantidad actual de café que hay en la cafetera). 
     * Agregar constructor vacío y con parámetros así como setters y getters.
 * @author elias
 */
public class Cafetera {
    private int capacidadMaxima,cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}
