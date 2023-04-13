/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32.servicios;

import Clase25_32.entidades.Cadena;
import java.util.Arrays;
import java.util.Scanner;

/**
 *Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
     * 
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    Método invertirFrase(), deberá invertir la frase
    * ingresada y mostrarla por pantalla. 
    * 
    * Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    * 
    Método vecesRepetido(String letra), 
    * recibirá un carácter ingresado por el usuario y 
    * contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    * 
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    * 
    Método compararLongitud(String frase), deberá
    * comparar la longitud de la frase que compone la
    * clase con otra nueva frase ingresada por el usuario.
    Método unirFrases(String frase), deberá unir la frase contenida 
    * en la clase Cadena con una nueva frase ingresada por el usuario
    * y mostrar la frase resultante.
    Método reemplazar(String letra), deberá reemplazar todas las 
    * letras “a” que se encuentren en la frase, por algún otro 
    * carácter seleccionado por el usuario y mostrar la frase resultante.
    Método contiene(String letra), deberá
    * comprobar si la frase contiene una letra que ingresa
    * el usuario y devuelve verdadero si la contiene y falso si no.
 * @author elias
 */
public class CadenaServicio {
    public void mostrarVocales(Cadena cad){
        int a=0,e=0,i=0,o=0,u=0;
        
        for (int j = 0; j < cad.getLongitud(); j++) {
            switch ( cad.getFrase().toLowerCase().charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }

        }
        System.out.println("Cantidad de a encontradas : "+a);
        System.out.println("Cantidad de e encontradas : "+e);
        System.out.println("Cantidad de i encontradas : "+i);
        System.out.println("Cantidad de o encontradas : "+o);
        System.out.println("Cantidad de u encontradas : "+u);
    }
    public void invertirFrase(Cadena cad){
        for (int j = cad.getLongitud(); j >0 ; j--) {
            System.out.print(cad.getFrase().substring(j-1,j)); 
        }
        System.out.println("");
    }
    public void vecesRepetido(Cadena cad,String letra){
        int contador=0;
        
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("Se encontraron "+contador+" veces la letra ingresada");    
    }
    public void compararLongitud(Cadena cad,String frase){
        if (cad.getLongitud()==frase.length()) {
            System.out.println("Tienen la misma longitud");
        }else{
            System.out.println("No tienen la misma longitud");
        }
    }
    public void unirFrases(Cadena cad,String frase){
        System.out.println(cad.getFrase().concat(frase));
    }
    public void reemplazar(Cadena cad,String letra){
        String[] palabra=new String[cad.getLongitud()];
        for (int i = 0; i < cad.getLongitud(); i++) {
            palabra[i]=cad.getFrase().substring(i,i+1);
        }
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (palabra[i].equalsIgnoreCase("a")) {
                palabra[i]=letra;
            }
        }
        System.out.print(Arrays.toString(palabra));    
    }
    public boolean contiene(Cadena cad,String letra){
        boolean result=false;
        
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                result=true;
            }
        }
        
        return result;
    }
    
}
