/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_5_6;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class tp1_7 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
     * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
     * deben llegar con un formato fijo:
     * 
     * tienen que ser de un máximo de 5 caracteres
     * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
       Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
     * especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
     * distinta de FDE, que no respete el formato se considera incorrecta.
       Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
     * correctas e incorrectas recibidas.
     * 
     * Para resolver el ejercicio deberá investigar 
     * cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int correctas=0,incorrectas=0;
        String cadena;
        do {
            System.out.println("Ingrese cadena(hasta 5 caracteres)");
            cadena=leer.next();
            cadena=cadena.toUpperCase();
            if (cadena.equals("&&&&&")) {
                
            }else{
                if (cadena.length()<=5&&(cadena.substring(0,1).equals("X")&&cadena.substring(cadena.length()-1,cadena.length()).equals("O"))) {
                    correctas++;
                }else{
                    incorrectas++;
                }
            }
            
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de correctas son "+correctas+" y la de incorrectas son "+incorrectas);
    }
    
}
