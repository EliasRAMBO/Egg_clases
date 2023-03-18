/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase9_10_11;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class extra4 {

    /**
     * @param args the command line arguments
     * Los profesores del curso de programación de Egg necesitan
     * llevar un registro de las notas adquiridas por sus 10 alumnos
     * para luego obtener una cantidad de aprobados y desaprobados.
     * Durante el período de cursado cada alumno obtiene 4 notas, 
     * 2 por trabajos prácticos evaluativos y 2 por parciales.
     * Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
        * Al final del programa los profesores necesitan obtener por pantalla la cantidad d
        * e aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con
        * promedio mayor o igual al 7 de sus notas del curso.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float[] alumnos=new float[2];
        float tp_1,tp_2,inte_1,inte_2;
        for (int i = 0; i <alumnos.length; i++) {
            System.out.println("Ingrese nota de primer TP del alumno"+(i+1)+" : ");
            tp_1=leer.nextFloat();
            System.out.println("Ingrese nota de segundo TP del alumno"+(i+1)+" : ");
            tp_2=leer.nextFloat();
            System.out.println("Ingrese nota del primer Integrador del alumno"+(i+1)+" : ");
            inte_1=leer.nextFloat();
            System.out.println("Ingrese nota del segundo Integrador del alumno"+(i+1)+" : ");
            inte_2=leer.nextFloat();
            alumnos[i]=(float) ((tp_1*0.1)+(tp_2*0.15)+(inte_1*0.25)+(inte_2*0.5));
        }
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i]>=7) {
                System.out.println("El alumno "+(i+1)+" Aprobo");
            }
        }
    }
    
}
