/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Biblioteca {
    public static Scanner lectorLibro = new Scanner(System.in);
    private String Name;
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    private int cantidadLibros = 0;
    private ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    public Biblioteca() {
    }

    public Biblioteca(String Name, ArrayList<Libro> listaLibros, 
    int cantidadLibros, ArrayList<Persona> listaPersona) {
        this.Name = Name;
        this.listaLibros = listaLibros;
        this.cantidadLibros = cantidadLibros;
        this.listaPersona = listaPersona;
    }
    
    public Biblioteca(Biblioteca B1) {
        this.Name = B1.Name;
        this.listaLibros = B1.listaLibros;
        this.cantidadLibros = B1.cantidadLibros;
        this.listaPersona = B1.listaPersona;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "Name=" + Name + ", listaLibros=" + listaLibros 
        + ", cantidadLibros=" + cantidadLibros + ", listaPersona=" 
        + listaPersona + '}';
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        char charName = Name.charAt(0);
        boolean mayus = Character.isUpperCase(charName);
        while (!mayus){
            System.out.println("La primera debe ser mayuscula, "
            + "vuelve a escribirlo");
            Name = lectorLibro.nextLine();
            charName = Name.charAt(0);
            mayus = Character.isUpperCase(charName);
        }
        this.Name = Name;
    }
    
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
    
    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    public void añadirABiblio(){
        System.out.println("¿Cuantos titulos diferentes quieres añadir?");
        int diferentesTitulos = lectorLibro.nextInt();
        lectorLibro.nextLine();
        for (int i = 0; i < diferentesTitulos; i++) {
            Libro L1 = Libro.añadirLibro();
            this.listaLibros.add(L1);
            this.cantidadLibros++;
        }
    }
    
    public void eliminarDeBiblio(){
        System.out.println("Dime el ISBN que deseas eliminar:");
        String borrar = lectorLibro.nextLine();
        boolean found = false;
        for (int i = 0; (i < this.listaLibros.size()) && (!found); i++){
            if ((this.listaLibros.get(i).getISBN().equals(borrar)) && 
            this.listaLibros.get(i).isReservado() == false){
                this.listaLibros.remove(i);
                this.cantidadLibros --;
                found = true;
            }
        }
        if (!found){
            System.out.println("No se ha encontrado el ISBN o está reservado");
        }
    }
    
    public int encontrarEnBiblio(){
        System.out.println("Dime el ISBN que deseas buscar:");
        String encontrar = lectorLibro.nextLine();
        boolean found = false;
        int j = -1;
        for (int i = 0; (i < this.listaLibros.size()) && (!found); i++){
            if (this.listaLibros.get(i).getISBN().equals(encontrar)){
                found = true;
                j = i;
            }
        }
        return j;
    }
    
    public ArrayList encontrarTitulo(){
        ArrayList<Integer> indices = new ArrayList<Integer>();
        System.out.println("Dime el título que deseas buscar:");
        String titulo = lectorLibro.nextLine();
        for (int i = 0;(i < this.listaLibros.size()); i++){
            if (this.listaLibros.get(i).getTitulo().contains(titulo)){
                indices.add(i);
            }
        }
        return indices;
    }
    
    public void mostrarLibros(){
        System.out.println("Los libros que tiene tu libreria son:");
        for (Libro Libro : this.listaLibros){
            System.out.println(Libro.getTitulo());
        }            
    }
    
    public void mostrarLibrosDisponibles(){
        for (Libro libro : this.listaLibros){
            if (libro.isReservado()){
                System.out.println(libro.getTitulo());
            }
        }
    }
    
    public void añadirPersonaABiblioteca(){
        System.out.println("¿Cuantas personas diferentes quieres añadir?");
        int diferentesTitulos = lectorLibro.nextInt();
        lectorLibro.nextLine();
        for (int i = 0; i < diferentesTitulos; i++) {
            Persona P1 = Persona.añadirPersona();
            this.listaPersona.add(P1);
        }
    }
    
    public void eliminarPersonaDeBiblioteca(){
        System.out.println("Dime el NIF de la persona que quieres eliminar:");
        String Eliminar = lectorLibro.nextLine();
        boolean found = false;        
        for (int i = 0; (i < this.listaPersona.size()) && (!found); i++){
            if (this.listaPersona.get(i).getNIF().equals(Eliminar)){
                this.listaPersona.remove(i);
                found = true;
            }
        }
        if (!found){
            System.out.println("No se ha encontrado la persona con el NIF" + Eliminar);
        }
    }
    
    public void mostrarPersonas(){
        listaPersona.forEach(_item -> {
            System.out.println(this.listaPersona.toString());
        });
    }
}
