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
public class tp3 {

    /**
     * @param args the command line arguments
     * Recorrer un vector de N enteros contabilizando cuántos números son
     * de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese tamaño de vector : ");
        n=leer.nextInt();
        
        int[] vect=new int[n],numero=new int[5];
        for (int i = 0; i < n; i++) {
            vect[i]=(int)(Math.random()*10000);
            System.out.print(vect[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            switch (cantdig(vect[i])) {
                case 1:
                    numero[0]++;
                    break;
                case 2:
                    numero[1]++;
                    break;
                case 3:
                    numero[2]++;
                    break;
                case 4:
                    numero[3]++;
                    break;
                case 5:
                    numero[4]++;
                    break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("La cantidad numero de "+(i+1)+" digitos es :"+numero[i]);
        }
    }
    public static int cantdig(int n) {
        int dig=1;
        
        while(n>9){
            n=n/10;
            dig++;
        }
        return dig;
    }
}
