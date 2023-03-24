/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase13_18.entidades;

/**
 *Crear una clase Rectángulo que modele rectángulos
     * por medio de un atributo privado base y un atributo
     * privado altura
     * . La clase incluirá un método para crear 
     * el rectángulo con los datos del Rectángulo dados por el
     * usuario. 
     * También incluirá un método para calcular la superficie 
     * del rectángulo y un método para calcular el perímetro del rectángulo
     * 
     * Por último, tendremos un método que dibujará el rectángulo mediante
     * asteriscos usando la base y la altura. Se deberán además definir los 
     * métodos getters, setters y constructores correspondientes.
     * 
        Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author elias
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int superficie(){
        return (base*altura);
    }
    public int perimetro(){
        return ((base*altura)*2);
    }
    public void dibujar_rect(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1||j==0||j==base-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
