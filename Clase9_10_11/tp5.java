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
public class tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
    //    int[][] matrizTrans = new int[4][4];
        boolean bandera = true;
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            if (!bandera) {
                break;
            }
            for (int j = 0; j < 4; j++) {
                System.out.print((matriz[j][i] * -1) + "  ");
                if(matriz [i][j] != (matriz[j][i] * -1)){
                    bandera = false;
                }
            }
            System.out.println("");
        }
        
        if(bandera){
            System.out.println("La matriz es antisimetrica");
        } else {
             System.out.println("La matriz no es antisimetrica");
        }
        
    }
    
}
