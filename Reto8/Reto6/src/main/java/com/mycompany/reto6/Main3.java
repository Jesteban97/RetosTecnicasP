/*
    ESTE MAIN ES EL QUE TIENE LA PRUEBA DE LOS METODOS QUE SE REQUERIAN.
*/


package com.mycompany.reto6;

public class Main3 {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco("Banco J&J");
    
        Cliente cliente1 = new Cliente("Jose Waldo", "Cánadiense", 1004, 301313);
        Cliente cliente2 = new Cliente("Juan Aristizabal","Peruano",1005,310706);
        Cliente cliente3 = new Cliente("Jhon Perez","Colombiano",1006,301530);
    
        Articulo articulo1 = new Articulo("Cuaderno", 2500);
        Articulo articulo2 = new Articulo("panela sagrada",3500);
        Articulo articulo3 = new Articulo("oro celta",5000);
        Articulo articulo5 = new Articulo("One Piece", 5000000);
        Articulo articulo6 = new Articulo("Death Note", 345600);
        
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);
        
        // Esta linea comprueba la creacion de los clientes.
        banco.infoCliente(1006);
        
        banco.quitarCliente(cliente2);
        
        // Esta linea comprueba la eliminacion de un cliente.
        banco.infoCliente(1005);
        
        banco.agregarCliente(cliente2);
        
        banco.agregarArticuloCliente(articulo6, 1004);
        banco.agregarArticuloCliente(articulo1, 1004);
        banco.agregarArticuloCliente(articulo2, 1004);
        
        banco.agregarArticuloCliente(articulo3, 1005);
        banco.agregarArticuloCliente(articulo5, 1005);
        banco.agregarArticuloCliente(articulo2, 1005);

        System.out.println("Articulos que posee 1005: " + cliente2.getArticulos().toString());
        System.out.println("Articulos que posee 1004: " + cliente1.getArticulos().toString());
        
        banco.quitarArticuloCliente(articulo5, 1005);
        banco.quitarArticuloCliente(articulo6, 1005);
        System.out.println("Articulos que posee 1005: " + cliente2.getArticulos().toString());
        
        System.out.println("Valor de los articulos de cliente 1004: " + banco.valorArticulosCliente(1004));
        System.out.println("Valor de los articulos de cliente 1005: " + banco.valorArticulosCliente(1005));
        System.out.println("Valor de todos los articulos de todos los clientes: " + banco.valorArticulosDeTodosLosClientes());
        
    }   
    
}
