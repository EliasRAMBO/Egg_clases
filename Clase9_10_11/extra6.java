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
public class extra6 {

    /**
     * @param args the command line arguments
     * Construya un programa que lea 5 palabras de mínimo 
     * 3 y hasta 5 caracteres y, a medida que el usuario las
     * va ingresando, construya una “sopa de letras para niños”
     * de tamaño de 20 x 20 caracteres. Las palabras se ubicarán
     * todas en orden horizontal en una fila que será seleccionada 
     * de manera aleatoria. Una vez concluida la ubicación de las palabras,
     * rellene los espacios no utilizados con un número aleatorio del 0 al 9.
     * Finalmente imprima por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo
    * se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[][] sopa=new String[20][20];
        String palabra;
        int[] horiz=new int[20];
        int hor,ver;
        boolean ho;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese palabra "+(i+1)+" :");
                palabra=leer.next();
            } while (palabra.length()>5||palabra.length()<3);
            do {
                ho=true;
                hor=(int)(Math.random()*20);
                ver=(int)(Math.random()*20);
                if ((hor+palabra.length())<20 && (sopa[hor][ver])==null && sopa[(hor+palabra.length())][ver]==null) {
                   ho=false; 
                }
            } while (ho);
            for (int j = 0; j < palabra.length() ; j++) {
                sopa[(hor+j)][ver]=palabra.substring(j,(j+1));
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j]==null) {
                    sopa[i][j]=String.valueOf((int)(Math.random()*9));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
