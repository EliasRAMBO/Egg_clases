package Clase13_18.entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
 * atributos pasados por parámetro y un constructor vacío. 
 * 
 * Crear un método para cargar un libro pidiendo los datos
 * al usuario y luego informar mediante otro método el número 
 * de ISBN, el título, el autor del libro y el número de páginas.

 * @author elias
 */
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numero_de_paginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int numero_de_paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numero_de_paginas = numero_de_paginas;
    }
    public void cargar_libro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN :");
        ISBN=leer.nextInt();
        System.out.println("Ingrese el Titulo :");
        Titulo=leer.next();
        System.out.println("Ingrese el Autor :");
        Autor=leer.next();
        System.out.println("Ingrese el Num de paginas :");
        numero_de_paginas=leer.nextInt();
    }

   
    public void mostrar_libro(){
        System.out.println("ISBN=" + this.ISBN + ", Titulo=" + this.Titulo + ", Autor=" + this.Autor + ", numero_de_paginas=" + this.numero_de_paginas );
    }    
   
}
