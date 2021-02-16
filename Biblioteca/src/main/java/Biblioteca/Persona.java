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
public class Persona {
    public static Scanner lectorPersona = new Scanner(System.in);
    private String name;
    private String apellidos;
    private String NIF;
    private String contraseña;

    public Persona() {
    }
    
    public Persona(String name, String apellidos, String NIF, String contraseña) {
        this.name = name;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.contraseña = contraseña;
    }
    
    public Persona(Persona P1) {
        this.name = P1.name;
        this.apellidos = P1.apellidos;
        this.NIF = P1.NIF;
        this.contraseña = P1.contraseña;
    }    

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", apellidos=" + apellidos + 
        ", NIF=" + NIF + ", contrase\u00f1a=" + contraseña + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public static Persona añadirPersona(){
        Persona P1 = new Persona();
        System.out.println("Dime el nombre:");
        P1.setName(lectorPersona.nextLine());
        System.out.println("Dime los apellidos:");
        P1.setApellidos(lectorPersona.nextLine());        
        System.out.println("Dime el NIF:");
        P1.setNIF(lectorPersona.nextLine());
        System.out.println("Dime la contraseña:");
        P1.setContraseña(lectorPersona.nextLine());
        return P1;
    }
}
