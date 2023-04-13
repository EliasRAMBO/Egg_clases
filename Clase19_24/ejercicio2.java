/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24;

import Clase19_24.entidades.Persona;
import Clase19_24.servicios.PersonaServicio;

/**
 *
 * @author elias
 */
public class ejercicio2 {

    /**Programa Nespresso. Desarrolle una clase 
     * 
     * Cafetera en el paquete Entidades con los atributos
     * capacidadMáxima (la cantidad máxima
     * de café que puede contener la cafetera) y cantidadActual (la 
     * cantidad actual de café que hay en la cafetera). 
     * Agregar constructor vacío y con parámetros así como setters y getters.
     * 
     * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
    * el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
    * Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    * El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

    Realizar una clase llamada Persona en el paquete de entidades que tengan
    * los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro),
    * peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
    * Agregar constructores, getters y setters.
    *
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
    * usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
    * Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    Método calcularIMC(): calculara si la persona está en su peso ideal
    * 
    * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    * significa que la persona está por debajo de su peso ideal y la función devuelve un -1
    * . Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
    * significa que la persona está en su peso ideal y la función devuelve un 0.
    * Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa
    * que la persona tiene sobrepeso, y la función devuelve un 1.
    * 
    * 
    * 
    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
    * 
    * llamaremos todos los métodos para cada objeto, deberá comprobar si la
    * persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
    * peso ideal e indicar para cada objeto si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
    * en distintas variables(arrays), para después calcular un porcentaje
    * de esas 4 personas cuantas están por debajo de su peso, cuantas en
    * su peso ideal y cuantos, por encima, y también calcularemos un 
    * porcentaje de cuantos son mayores de edad y cuantos menores. 
    * Para esto, podemos crear unos métodos adicionales.


     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1,p2,p3,p4;
        double poredadmay=0,porpesodeb=0,porpesoideal=0,porpesosobre=0;
        PersonaServicio ps=new PersonaServicio();
        p1=ps.crearPersona();
        p2=ps.crearPersona();
        p3=ps.crearPersona();
        p4=ps.crearPersona();
        
        if (ps.esMayorDeEdad(p1)) {
            poredadmay+=1;
        }
        if (ps.esMayorDeEdad(p2)) {
            poredadmay+=1;
        }
        if (ps.esMayorDeEdad(p3)) {
            poredadmay+=1;
        }
        if (ps.esMayorDeEdad(p4)) {
            poredadmay+=1;
        }
        poredadmay=(poredadmay/4)*100;
        System.out.println("El porcentaje de personas mayores es de : "+poredadmay+" %");
        System.out.println("El porcentaje de personas mayores es de : "+(100-poredadmay)+" %");               
        switch (ps.calcularIMC(p1)){
        case -1:
            porpesodeb+=1;
            break;
        case 0:
            porpesoideal+=1;
            break;
        case 1:
            porpesosobre+=1;
            break; 
        }
        switch (ps.calcularIMC(p2)){
        case -1:
            porpesodeb+=1;
            break;
        case 0:
            porpesoideal+=1;
            break;
        case 1:
            porpesosobre+=1;
            break; 
        }
        switch (ps.calcularIMC(p3)){
        case -1:
            porpesodeb+=1;
            break;
        case 0:
            porpesoideal+=1;
            break;
        case 1:
            porpesosobre+=1;
            break; 
        }
        switch (ps.calcularIMC(p4)){
        case -1:
            porpesodeb+=1;
            break;
        case 0:
            porpesoideal+=1;
            break;
        case 1:
            porpesosobre+=1;
            break; 
        }
        porpesoideal=(porpesoideal/4)*100;
        porpesodeb=(porpesodeb/4)*100;
        porpesosobre=(porpesosobre/4)*100;
        System.out.println("El porcentaje de personas con peso por debajo es "+porpesodeb+" %");
        System.out.println("El porcentaje de personas con peso ideal es "+porpesoideal+" %");
        System.out.println("El porcentaje de personas con sobrepeso es "+porpesosobre+" %");
    }
    
}
