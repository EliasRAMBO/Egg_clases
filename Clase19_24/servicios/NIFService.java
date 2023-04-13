/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.servicios;

import Clase19_24.entidades.NIF;
import java.util.Scanner;

/**
 ** En NIFService se dispondrá de los siguientes métodos:
    Métodos getters y setters para el número de DNI y la letra.
    Método crearNif(): le pide al usuario el DNI y 
    * con ese DNI calcula la letra que le corresponderá.
    * Una vez calculado, le asigna la letra que le corresponde según
    Método mostrar(): que nos permita mostrar el NIF 
    * (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
    * 
La letra correspondiente al dígito verificador se calculará a traves 
* de un método que funciona de la siguiente manera: Para calcular la
* letra se toma el resto de dividir el número de DNI por 23 (el resultado
* debe ser un número entre 0 y 22). El método debe buscar en un array 
* (vector) de caracteres la posición que corresponda al resto de 
* la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:

POSICIÓN LETRA
0T 1R 2W 3A 4G 5M 6Y 7F 8P 9D 10X 11B 12N 13J 14Z 15S 16Q 17V 18H 19L 20C 21K 22E
 * @author elias
 */
public class NIFService {
    
    public void crearNif(NIF ni){
        Scanner leer = new Scanner(System.in); 
        long dni;
        int posletra;
        String[] letra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println("Ingrese DNI :"); 
        dni=leer.nextLong();
        ni.setDNI(dni);
        posletra=(int) (dni%23);
        ni.setLetra(letra[posletra]);
    }
    public void mostrar(NIF ni){
        System.out.println("NIF : "+ni.getDNI()+"-"+ni.getLetra());
    }
}
