
package com.mycompany.reto6;

import java.util.Hashtable;

public class Main {
    
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Cuaderno", 2500);
        Cliente cliente1 = new Cliente("Jose Waldo", "Cánadiense", 1004, 301313);
        Banco banco = new Banco("Banco J&J");
        
        String descripcionArticulo1 = "Cuaderno anillado de pasta dura";
        articulo1.setDescripcion(descripcionArticulo1);
        
        articulo1.informacionArticulo();
        cliente1.informeCliente();
        
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente1);
        banco.quitarCliente(cliente1);
    }
   
}
