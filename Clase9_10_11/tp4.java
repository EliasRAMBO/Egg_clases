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
public class tp4 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j]=(int)(Math.random()*10);
            }
        }
        System.out.println("Matriz :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
         System.out.println("Matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[j][i]+"  ");
            }
            System.out.println("");
        }
    }
    
}
