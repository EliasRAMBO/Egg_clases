/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_5_6;

/**
 *
 * @author elias
 */
public class tp2_12 {

    /**
     * @param args the command line arguments
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X),
     * que muestre los números del 0-0-0 al 9-9-9,
     * con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
     * 0-0-0
       0-0-1
       0-0-2
       0-0-E
       0-0-4
       0-1-2
       0-1-E

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Character e='E';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    if (i==3) {
                        System.out.print(e+"-");
                    }else{
                        System.out.print(i+"-");
                    }
                    if (j==3) {
                        System.out.print(e+"-");
                    }else{
                        System.out.print(j+"-");
                    }
                    if (k==3) {
                        System.out.print(e);
                    }else{
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }
        }
    }
    
}
