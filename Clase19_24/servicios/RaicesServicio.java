/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.servicios;

import Clase19_24.entidades.Raices;

/**
 *Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
    Método getDiscriminante(): devuelve el valor del discriminante (double).
    * El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    * 
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
    * para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    * 
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    * para que esto ocurra, el discriminante debe ser igual que 0.
    * 
    Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones.
    * 
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́
    * true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    * 
    Método calcular(): esté método llamará tieneRaices() y a tieneRaiz(), y mostrara
* ́ por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices()
*   o obtenerRaiz(), según lo que devuelvan nuestros métodos 
*   y en caso de no existir solución, se mostrará un mensaje.
* 
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 * @author elias
 */
public class RaicesServicio {
    public double getDiscriminante(Raices a){
        double res;
        res=(Math.pow(a.getB(),2))-(4*a.getA()*a.getC());
        return res;
    }
    public boolean tieneRaices(Raices a){
        boolean res=false;
        if (getDiscriminante(a)>=0) {
            res=true;
        }
        return res;
    }
    public boolean tieneRaiz(Raices a){
        boolean res=false;
        if (getDiscriminante(a)==0) {
            res=true;
        }
        return res;
    }
    public void obtenerRaices(Raices a){
        if (tieneRaices(a)) {
            System.out.println("Raiz 1 : "+(-a.getB()+(Math.sqrt(Math.pow(a.getB(), 2)))-(4*a.getA()*a.getC()))/(2*a.getA()));
            System.out.println("Raiz 2 : "+(-a.getB()-(Math.sqrt(Math.pow(a.getB(), 2)))-(4*a.getA()*a.getC()))/(2*a.getA()));
        }
    }
    public void obtenerRaiz(Raices a){
        if (tieneRaiz(a)) {
            System.out.println("Raiz 1 : "+(-a.getB()+(Math.sqrt(Math.pow(a.getB(), 2)))-(4*a.getA()*a.getC()))/(2*a.getA()));
        }
    }
    public void calcular(Raices a){
        if (tieneRaices(a)) {
            obtenerRaices(a);
        }else{
            if (tieneRaiz(a)) {
                obtenerRaiz(a);
            }else{
                System.out.println("No tiene raiz");
            }
        }
    }
    
}
