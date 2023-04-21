/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase25_32.entidades;

/**
 *Crea una clase en Java donde declares una variable 
     * de tipo array de Strings que contenga los doce meses del año,
     * en minúsculas. A continuación, declara una variable mesSecreto 
     * de tipo String, y hazla igual a un elemento 
     * del array (por ejemplo, mesSecreto = mes[9].
 * @author elias
 */
public class juegoMeses {
    private String[] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public juegoMeses() {
        this.mesSecreto=meses[(int) (Math.random() * 11)];
    }
}
