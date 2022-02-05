
package com.mycompany.reto6;

import java.util.HashMap;
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
            System.out.println("Error, null no es un dato valido");
        }
    }
    
    public void quitarCliente(Cliente cliente) {
        if(cliente != null) {
            boolean existeCliente = existeCliente(cliente.getNumeroCedula());
            if(existeCliente) {
                this.clientes.remove(cliente.getNumeroCedula());
                System.out.println("Cliente eliminado");
            } else {
                System.out.println("El cliente no existe.");
            }
        } else {
            System.out.println("Error, null no es un dato valido");
        }
        
    }
    
    public void infoCliente(String cedulaCliente) {
        
    }
    
    private boolean existeCliente(int cedulaCliente){
        if(this.clientes.containsKey(cedulaCliente)){
            return true;
        } else {
            System.out.println("El cliente no existe!");
            return false;
        }
        
    }
    
}
