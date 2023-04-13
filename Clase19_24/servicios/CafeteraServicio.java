/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.servicios;

import Clase19_24.entidades.Cafetera;
import java.util.Scanner;

/**
 *Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
    * el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
    * Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    * El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    * 
 * @author elias
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera caf){
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }
    public void servirTaza(Cafetera caf){
        int taza;
        System.out.println("Ingrese el tamaño de la taza :");
        taza=leer.nextInt();
        System.out.println("Sirviendo taza...");
        if (caf.getCantidadActual()<taza) {
            System.out.println("Se sirvio "+caf.getCantidadActual()+" de cafe");
            caf.setCantidadActual(0);
        }else{
            System.out.println("Se lleno la taza");
            caf.setCantidadActual(caf.getCantidadActual()-taza);
        }
    }
    public void vaciarCafetera(Cafetera caf){
       caf.setCantidadActual(0);
    }
    public void agregarCafe(Cafetera caf){
        int agr;
        System.out.println("Cantidad de cafe a agregar :");
        agr=leer.nextInt();
        if ((caf.getCantidadActual()+agr)>caf.getCapacidadMaxima()) {
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }else{
            caf.setCantidadActual(caf.getCantidadActual()+agr);
        }
    }
}
