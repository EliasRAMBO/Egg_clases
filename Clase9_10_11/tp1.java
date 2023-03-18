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
public class tp1 {

    public static void main(String[] args) {
       
        int [] vector = new int [100];
        
        for(int i=0;i<100;i++){
            vector[i] = (100-i);
        }
        
        for(int i=0;i<100;i++){
            System.out.println("N° " + vector[i]);
        }
        
    }
    
}
