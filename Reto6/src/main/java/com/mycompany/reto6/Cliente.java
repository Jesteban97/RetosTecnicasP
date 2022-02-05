
package com.mycompany.reto6;

import java.util.ArrayList;

public class Cliente {
    
    // Atributos:
    private String nombre;
    private String nacionalidad;
    private int numeroCedula;
    private int numeroTelefonico;
    ArrayList<Articulo> articulos;
    
    // Constructor:
    public Cliente(String nombre, String nacionalidad, int numeroCedula, int numeroTelefonico) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.numeroCedula = numeroCedula;
        this.numeroTelefonico = numeroTelefonico;
    }
    
    // Getters:
    public String getNombre() {
        return nombre;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }
    
    // Metodos:
    public void informeCliente(){
        System.out.println("**************INFORMACION DEL CLIENTE**************");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("N° CEDULA: " + this.numeroCedula);
        System.out.println("NACIONALIDAD: " + this.nacionalidad);
        System.out.println("NUMERO TELEFONICO: " + this.numeroTelefonico);
        System.out.println("****************************************************\n");
    }
    
}
