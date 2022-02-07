
package com.mycompany.reto6;

import java.util.ArrayList;

public class Cliente {
    
    // Atributos:
    private String nombre;
    private String nacionalidad;
    private int numeroCedula;
    private int numeroTelefonico;
    ArrayList<Articulo> articulos = new ArrayList<>();
    
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

    public ArrayList<Articulo> getArticulos() {
        return articulos;
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
    
    public void añadirArticulo(Articulo articulo){
        if(articulo != null){
            this.articulos.add(articulo);
            System.out.println("El articulo ha sido agregado.");        
        } else {
            System.out.println("El valor nulo no es permitido.");
        }
    }
    
    public void eliminarArticulo(Articulo articulo){
        boolean existeArticulo = this.articulos.contains(articulo);
        if(existeArticulo) {
            this.articulos.remove(articulo);
            System.out.println("Articulo eliminado.");
        } else{
            System.out.println("El articulo no puede ser borrado.");
        }
    }
    
}
