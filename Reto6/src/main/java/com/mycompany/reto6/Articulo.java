
package com.mycompany.reto6;

public class Articulo {
    
    // Atributos:
    private String nombre;
    private String descripcion;
    private double valorEstimado;
    
    // Constructor:
    public Articulo(String nombre, double valorEstimado) {
        this.nombre = nombre;
        this.valorEstimado = valorEstimado;
    }
    
    // Getters y Setters:
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Atributos:
    public void informacionArticulo(){
        System.out.println("**************INFORMACION DEL ARTICULO**************");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("DESCRIPCIÓN: " + this.descripcion);
        System.out.println("VALOR ESTIMADO: $" + this.valorEstimado);
        System.out.println("****************************************************\n");
    }
}
