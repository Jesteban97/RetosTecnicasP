
package com.mycompany.reto6;

import java.util.ArrayList;
import java.util.Hashtable;

public class Banco {
    
    // Atributos:
    private String nombre;
    private Hashtable<Integer, Cliente> clientes;
    
    // Constructor:
    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new Hashtable<Integer, Cliente>();
    }

    public String getNombre() {
        return nombre;
    }

    public Hashtable<Integer, Cliente> getClientes() {
        return clientes;
    }
    
    // Metodos:
    
    /*
    La razón por la que no se permite un cliente de tipo null es porqué eso interferiria
    con el metodo privado existeCliente.
    */
    public void agregarCliente(Cliente cliente){
        if (cliente != null) {
            boolean existeCliente = existeCliente(cliente.getNumeroCedula());
            if(!existeCliente){
                this.clientes.put(cliente.getNumeroCedula(), cliente);
                System.out.println("Cliente agregado con exito."); 
            } else {
                System.out.println("El cliente ya existe.");
            }
        } else {
            System.out.println("Error, null no es un dato valido.");
        }
    }
    
    public void quitarCliente(Cliente cliente) {
        if(cliente != null) {
            boolean existeCliente = existeCliente(cliente.getNumeroCedula());
            if(existeCliente) {
                this.clientes.remove(cliente.getNumeroCedula());
                System.out.println("Cliente eliminado.");
            } else {
                System.out.println("El cliente no existe.");
            }
        } else {
            System.out.println("Error, null no es un dato valido.");
        }
        
    }
    
    public void infoCliente(int cedulaCliente) {
        boolean existeCliente = existeCliente(cedulaCliente);
        if(existeCliente) {
            this.clientes.get(cedulaCliente).informeCliente();
        } else {
            System.out.println("Error! Información no disponible, el cliente no existe.");
        }
    }
    
    public void agregarArticuloCliente(Articulo articulo, int cedulaCliente){
        boolean existeCliente = existeCliente(cedulaCliente);
        if(existeCliente){
            Cliente cliente = this.clientes.get(cedulaCliente);
            cliente.añadirArticulo(articulo);
        }
    }
    
    public void quitarArticuloCliente(Articulo articulo, int cedulaCliente){
        boolean existeCliente = existeCliente(cedulaCliente);
        if(existeCliente){
            Cliente cliente = this.clientes.get(cedulaCliente);
            cliente.eliminarArticulo(articulo);
        }
    }
    
    public double valorArticulosCliente(int cedulaCliente){
        boolean existeCliente = existeCliente(cedulaCliente);
        if(existeCliente){
            Cliente cliente = this.clientes.get(cedulaCliente);
            ArrayList<Articulo> articulosCliente = cliente.getArticulos();
            double totalValorArticulos = 0;
            for (Articulo articulo : articulosCliente) {
                totalValorArticulos += articulo.getValorEstimado();
            }
            return totalValorArticulos;
        }
        return 0;
    }
    
    public double valorArticulosDeTodosLosClientes(){
        double total = 0;
        for (Cliente cliente : this.clientes.values()) {
            total += valorArticulosCliente(cliente.getNumeroCedula());
        }
        return total;
    }
    
    private boolean existeCliente(int cedulaCliente){
        if(this.clientes.containsKey(cedulaCliente)){
            return true;
        }
        return false;
        
    }
    
}
