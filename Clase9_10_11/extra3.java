/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase9_10_11;

/**
 *
 * @author elias
 */
public class extra3 {

    /**
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios,
     * pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a=new int[3];
        a=llenar(a);
        mostrar(a);
    }
     public static int[] llenar(int[] a) {
        int[] vec=new int[a.length];
        for (int i = 0; i < vec.length; i++) {
            vec[i]=(int)(Math.random()*10);
        }
        return vec;
    }
    public static void mostrar (int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
