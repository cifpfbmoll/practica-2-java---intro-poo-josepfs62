/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/** A TENER EN CUENTA:
 * static - metodo del objeto/ en blanco - metodo de una instancia
 * static esta pensado para metodos cuando no tenemos libro creado y en blanco
 * cuando lo queremos de un libro en concreto.
 * 
 * También hay que tener en cuenta que los constructores han de apuntar a los
 * setter para que si ponemos un condicional se aplique directamente sin tener
 * que ir a cada uno a poner el condicional en cuestion.
 * @author josep
 */
public class Main {

    public static Scanner lectorLibro=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        Biblioteca B1 = new Biblioteca();
        Scanner Lector = new Scanner(System.in);
        boolean menu = true;
        int opcionMenu;
        System.out.println("Menu de la biblioteca");
        while (menu){
            System.out.println("¿Que quieres hacer?");
            System.out.println("1- Libros");
            System.out.println("2- Personal");
            System.out.println("3- Salir");
            opcionMenu = Lector.nextInt();
            Lector.nextLine();
            switch(opcionMenu){
                case 1:
                    int opcionLibro;
                    System.out.println("Bienvenido al apartado de libro");
                    System.out.println("Selecciona una opción");
                    System.out.println("1- Añadir libro");
                    System.out.println("2- Eliminar libro");
                    System.out.println("3- Buscar libro");
                    System.out.println("4- Mostrar libros");
                    System.out.println("5- Mostrar libros disponibles");
                    System.out.println("6- Salir");
                    opcionLibro = Lector.nextInt();
                    Lector.nextLine();
                    switch(opcionLibro){
                        case 1:
                            B1.añadirABiblio();
                            break;
                        case 2:
                            B1.eliminarDeBiblio();
                            break;
                        case 3:
                            int opcionBuscar;
                            System.out.println("¿Como lo vas a buscar?");
                            System.out.println("1- Por ISBN");
                            System.out.println("2- Por título");
                            System.out.println("3- Salir");
                            opcionBuscar = Lector.nextInt();
                            Lector.nextLine();
                            switch(opcionBuscar){
                                case 1:
                                    B1.encontrarEnBiblio();
                                case 2:
                                    B1.encontrarTitulo();
                                case 3:
                                    break;
                            }
                            break;
                        case 4:
                            B1.mostrarLibros();
                            break;
                        case 5:
                            B1.mostrarLibrosDisponibles();
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 2:
                    int opcionPersonal;
                    System.out.println("Bienvenido al apartado de Personal");
                    System.out.println("Selecciona una opción");
                    System.out.println("1- Añadir una persona");
                    System.out.println("2- Eliminar una persona");
                    System.out.println("3- Ver personal");
                    System.out.println("4- Salir");
                    opcionPersonal = Lector.nextInt();
                    Lector.nextLine();
                    switch(opcionPersonal){
                        case 1:
                            B1.añadirPersonaABiblioteca();
                            break;
                        case 2:
                            B1.eliminarPersonaDeBiblioteca();
                            break;
                        case 3:
                            B1.mostrarPersonas();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    menu = false;
                    break;
                default:
                    System.out.println("No has escrito ninguna opción correcta");
                    break;
            }
        }
        
        
        /* PRUEBAS
        B1.añadirABiblio();
        
        System.out.println(B1.getListaLibros());
        System.out.println(B1.getCantidadLibros());
        
        B1.eliminarDeBiblio();
        
        B1.mostrarLibros();
        System.out.println(B1.getCantidadLibros());

        int var1 = B1.encontrarEnBiblio();
        System.out.println(B1.getListaLibros().get(var1).getTitulo());
        
        ArrayList<Integer> indices = B1.encontrarTitulo();
        for (int i=0; i < indices.size(); i++){
            System.out.println(B1.getListaLibros().get(i).getTitulo());
        }
        */
        
    
    }
}
