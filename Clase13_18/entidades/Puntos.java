/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18.entidades;

import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas
     * de dos puntos, sus atributos serán, x1, y1, x2, y2,
     * siendo cada x e y un punto. Generar un objeto puntos
     * usando un método crearPuntos() que le pide al usuario
     * los dos números y los ingresa en los atributos del objeto.
     * Después, a través de otro método calcular y
     * devolver la distancia que existe entre los dos puntos 
     * que existen en la clase Puntos.
 * @author elias
 */
public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese x del primer punto");
        x1=leer.nextInt();
        System.out.println("Ingrese y del primer punto");
        y1=leer.nextInt();
        System.out.println("Ingrese x del segundo punto");
        x2=leer.nextInt();
        System.out.println("Ingrese y del segundo punto");
        y2=leer.nextInt();
    }
    public float calcularDistancia(){
        float dist;
        dist= (float) (Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
        return dist;
    }
}
