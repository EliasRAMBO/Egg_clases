/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32.entidades;

/**
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego),
     * la cual deberá contener como atributos, 
     * un vector con la palabra a buscar, la cantidad de letras encontradas
     * y la cantidad jugadas máximas que puede realizar el usuario.
 * @author elias
 */
public class Ahorcado {
    private char[] palabra;
    private int cantLetrasEncontradas=0;
    private int cantJugadasMax;

    public Ahorcado() {
    }

    public char[] getPalabra() {
        return palabra;
    }
    public char getLetra(int i) {
        return palabra[i];
    }
    public void setPalabraLongitud(int palabra) {
        this.palabra = new char[palabra];
    }
    public void setPalabra(char pala,int pos) {
        this.palabra[pos] = pala;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }  
}
