/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase19_24.entidades;

/**
 *Crear una clase NIF que se usará para mantener DNIs 
     * con su correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo)
     * y la letra (String o char) que le corresponde. 
 * @author elias
 */
public class NIF {
    private long DNI;
    private String letra;

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public NIF() {
    }

}
