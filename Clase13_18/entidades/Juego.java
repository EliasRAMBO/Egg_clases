/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18.entidades;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Juego {

    private int numeroIncognito;
    private int intentos;

    public Juego() {
    }

    public Juego(int numeroIncognito, int intentos) {
        this.numeroIncognito = numeroIncognito;
        this.intentos = intentos;
    }

    public int getNumeroIncognito() {
        return numeroIncognito;
    }

    public void setNumeroIncognito(int numeroIncognito) {
        this.numeroIncognito = numeroIncognito;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Juego{" + "numeroIncognito=" + numeroIncognito + ", intentos=" + intentos + '}';
    }

    public void iniciarJuego() {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el numero INCOGNITO:");
        numeroIncognito = Leer.nextInt();

        int ingreso = -1;

        do {
            if (intentos > 0) {
                if (numeroIncognito < ingreso) {
                    System.out.println("Tu numero es mayor");
                } else {
                    System.out.println("Tu numero es menor");
                }
            }
            System.out.println("Jugador 2 Intento: " + (intentos + 1));
            ingreso = Leer.nextInt();

            intentos++;

        } while (intentos < 3 && ingreso != numeroIncognito);

        if (numeroIncognito == ingreso) {
            System.out.println("Correcto el numero era " + numeroIncognito + "en " + intentos);
        } else {
            System.out.println("Fallaste!");

        }

    }

}
