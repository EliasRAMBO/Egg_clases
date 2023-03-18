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
public class extra5 {

    /**
     * @param args the command line arguments
     * Realizar un programa que llene una matriz 
     * de tamaño NxM con valores aleatorios y
     * muestre la suma de sus elementos.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=2,m=4,suma=0;
        int[][] mat=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]+" ");
                suma+=mat[i][j];
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de sus elementos es "+suma);
    }
    
}
