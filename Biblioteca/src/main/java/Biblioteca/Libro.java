/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Scanner;
/**
 *
 * @author josep
 */
public class Libro {
    public static Scanner lectorLibro=new Scanner(System.in);
    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private boolean reservado;
    private int numeroCopias;
    private int copiasDisponibles;

    public Libro() {
        
    }

    public Libro(String ISBN, String titulo, String autor, String editorial, 
    int numeroCopias, int copiasDisponibles) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroCopias = numeroCopias;
        this.copiasDisponibles = copiasDisponibles;
    }
    
    public Libro(Libro l1) {
        this.ISBN = l1.ISBN;
        this.titulo = l1.titulo;
        this.autor = l1.autor;
        this.editorial = l1.editorial;
        this.numeroCopias = l1.numeroCopias;
        this.copiasDisponibles = l1.copiasDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" 
        + autor + ", editorial=" + editorial + ", numeroCopias=" + numeroCopias 
        + ", copiasDisponibles=" + copiasDisponibles + '}';
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        while (numeroCopias < 1){
            System.out.println("No has puesto un número correcto, prueba otro");
            numeroCopias = lectorLibro.nextInt();
            lectorLibro.nextLine();
        }
        this.numeroCopias = numeroCopias;
        
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }
    
    public static Libro añadirLibro(){
        Libro Libro1 = new Libro();
        System.out.println("Dime el ISBM");
        Libro1.setISBN(lectorLibro.nextLine());
        System.out.println("Dime el título");
        Libro1.setTitulo(lectorLibro.nextLine());
        System.out.println("Dime el/la autor/a");
        Libro1.setAutor(lectorLibro.nextLine());
        System.out.println("Dime la editorial");
        Libro1.setEditorial(lectorLibro.nextLine());
        Libro1.setReservado(false);
        System.out.println("Dime el nº de copias con el mismo título");
        int Copias = lectorLibro.nextInt();
        lectorLibro.nextLine();
        while (Copias < 1){
            System.out.println("No puedes añadir menos de 1 libro, vuelve "
                    + "a introducir el nº de copias");
            Copias = lectorLibro.nextInt();
            lectorLibro.nextLine();
        }
        Libro1.setNumeroCopias(Copias);
        Libro1.setCopiasDisponibles(Copias);
        return Libro1;
    }
    
}
