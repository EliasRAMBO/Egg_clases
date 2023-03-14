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
 * 
 */
public class tp2_5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
    Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
    Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
    Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
    Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el
    * costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tipo de socio (A, B o C): ");
        char tipoSocio = leer.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = leer.nextDouble();
        double descuento = 0;
        double costoFinal = costoTratamiento;
        switch(tipoSocio) {            
            case 'A':                
                descuento = 0.5;
            break;            
            case 'B':                
                descuento = 0.35;                
                break;            
            case 'C':                
                descuento = 0;                
                break;            
            default:                
                System.out.println("Tipo de socio inválido.");
                return;
        }
        costoFinal = costoTratamiento - (costoTratamiento * descuento);
        System.out.println("El importe a pagar para el socio tipo " + tipoSocio + " es de $" + costoFinal);    
    }
    
}
