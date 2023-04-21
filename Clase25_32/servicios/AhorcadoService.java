/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32.servicios;

import Clase25_32.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.interfaces.PBEKey;

/**
 *Metodo crearJuego(): le pide la palabra al usuario y cantidad 
* de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra,
* como la longitud del vector.
* Después ingresa la palabra en el vector, letra por letra,
* quedando cada letra de la palabra en un índice del vector.
* Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
* 
Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
* Nota: buscar como se usa el vector.length.
* 
Método buscar(letra):  este método recibe una letra dada por el usuario
* y busca si la letra ingresada es parte de la palabra o no.
* También informará si la letra estaba o no.
* 
Método encontradas(letra):  que reciba una letra ingresada por 
* el usuario y muestre cuantas letras han sido encontradas y
* cuántas le faltan. Este método además deberá devolver true si
* la letra estaba y false si la letra no estaba, ya que, 
* cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
* 
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
* 
Método juego(): el método juego se encargará de llamar todos los métodos
* previamente mencionados e informará cuando el usuario descubra toda la 
* palabra o se quede sin intentos. Este método se llamará en el main.
 * @author elias
 */
public class AhorcadoService {
    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad 
    * de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra,
    * como la longitud del vector.
    * Después ingresa la palabra en el vector, letra por letra,
    * quedando cada letra de la palabra en un índice del vector.
    * Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
     * @param ao 
     */
    public void crearJuego(Ahorcado ao){
        Scanner leer = new Scanner(System.in);
        String  palabra;
        int jugadas;
        char letra;
        System.out.println("Ingrese palabra :");
        palabra=leer.next();
        ao.setPalabraLongitud(palabra.length());
        for (int i = 0; i < palabra.length(); i++) {
            letra=palabra.charAt(i);
            ao.setPalabra(letra,i);
        }
        System.out.println("Ingrese cantidad de jugadas maximas :");
        jugadas=leer.nextInt();
        ao.setCantJugadasMax(jugadas);
    }
    /**
     * Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
     * Nota: buscar como se usa el vector.length
     * @return 
     */
    public int longitud(Ahorcado ao){
        int longitud;
        
        longitud=ao.getPalabra().length;
        return longitud;
    }
    /**
     * Método buscar(letra):  este método recibe una letra dada por el usuario
     * y busca si la letra ingresada es parte de la palabra o no.
     * También informará si la letra estaba o no.
     */
    public boolean buscarLetra(Ahorcado ao,char letra){
        boolean ret=false;
        for (int i = 0; i < ao.getPalabra().length; i++) {
            if (Character.toLowerCase(ao.getLetra(i))==Character.toLowerCase(letra) ) {
                System.out.println("La letra a sido encontrada en la posicion "+i);
                ret=true;
                
            }
        }
        return ret;
    }
    /**
     * Método encontradas(letra):  que reciba una letra ingresada por 
    * el usuario y muestre cuantas letras han sido encontradas y
    * cuántas le faltan. Este método además deberá devolver true si
    * la letra estaba y false si la letra no estaba, ya que, 
    * cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     * @param letra 
     */
    public boolean encontradas(Ahorcado ao,char letra){
        boolean ret;
        
        ret=buscarLetra(ao,letra);
        if (ret) {
            ao.setCantLetrasEncontradas(ao.getCantLetrasEncontradas()+1);
            System.out.println("La cantidad de letras encontradas es :"+ao.getCantLetrasEncontradas());
            System.out.println("La cantidad de letras faltantes es :"+(ao.getPalabra().length-ao.getCantLetrasEncontradas()));
        }else{
            ao.setCantJugadasMax(ao.getCantJugadasMax()-1);
        }
        return ret;
    }
    /**
     * Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     */
    public void intentos(Ahorcado ao){
        System.out.println("La cantidad de intentos restantes es :"+ao.getCantJugadasMax());
    }
    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos
     * previamente mencionados e informará cuando el usuario descubra toda la 
     * palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void juego(){
        Scanner leer = new Scanner(System.in);
        Ahorcado ao=new Ahorcado();
        char letra;
        this.crearJuego(ao);
        do {
            this.intentos(ao);
            System.out.println("Ingrese una letra :");
            letra=leer.next().charAt(0);
            this.encontradas(ao,letra);
            if (ao.getCantLetrasEncontradas()==ao.getPalabra().length) {
                break;
            }
        } while (ao.getCantJugadasMax()!=0);
        if (ao.getCantJugadasMax()==0) {
            System.out.println("Perdiste");
        }else{
            System.out.println("Ganaste");
        }
    }
}
