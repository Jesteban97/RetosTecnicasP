
package com.mycompany.reto6;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Banco banco = new Banco("Banco J&J");
        Cliente cliente1 = new Cliente("Jose Waldo", "Cánadiense", 1004, 301313);
        Cliente cliente2 = new Cliente("Juan Aristizabal","Peruano",1005,310706);
        Cliente cliente3 = new Cliente("Jhon Perez","Colombiano",1006,301530);
        Articulo articulo1 = new Articulo("Cuaderno", 2500);
        Articulo articulo2 = new Articulo("panela sagrada",3500);
        Articulo articulo3 = new Articulo("oro celta",5000);
        String descripcionArticulo1 = "Cuaderno anillado de pasta dura";
        String descripcionArticulo2 = "Panela de los quimbayas";
        String descripcionArticulo3 = "Oro de los celtas";
        articulo1.setDescripcion(descripcionArticulo1);
        articulo2.setDescripcion(descripcionArticulo2);
        articulo3.setDescripcion(descripcionArticulo3);
        
        Scanner lector = new Scanner(System.in);
        while(true){
            imprimirMenu();
            System.out.println("Digite una de las opciones: ");
            String eleccionUsuarioMenú = lector.nextLine();

            if ("1".equals(eleccionUsuarioMenú)) {
              banco.agregarCliente(cliente1);
              banco.agregarCliente(cliente2);
              banco.agregarCliente(cliente3);
            } else if ("2".equals(eleccionUsuarioMenú)) {
                
               banco.quitarCliente(cliente1);
            } else if ("3".equals(eleccionUsuarioMenú)) {
              articulo1.informacionArticulo();
              articulo2.informacionArticulo();
              articulo3.informacionArticulo();
              cliente1.informeCliente();
              cliente2.informeCliente(); 
              cliente3.informeCliente();
            } else if ("4".equals(eleccionUsuarioMenú)) {
               while(true){
                   MenuArticulo();
            System.out.println("Digite una de las opciones: ");
            String eleccionArticulo = lector.nextLine();
               if ("1".equals(eleccionUsuarioMenú)) {
               cliente1.añadirArticulo(articulo1);
               cliente2.añadirArticulo(articulo1);
               cliente2.añadirArticulo(articulo2);
            } else if ("2".equals(eleccionArticulo)) {
               cliente2.eliminarArticulo(articulo2);
            
            } else if ("0".equals(eleccionArticulo)){
               break;
            } else {
               System.out.println("Elección Incorrecta!!!");
            }
               };
            } else if ("5".equals(eleccionUsuarioMenú)) {
                System.out.println("Ingrese un numero de cedula de un cliente valido");
                int cedula = lector.nextInt();
               System.out.println(banco.valorArticulosCliente(cedula));
            } else if ("6".equals(eleccionUsuarioMenú)){
               System.out.println(banco.valorArticulosDeTodosLosClientes());
            } else if ("0".equals(eleccionUsuarioMenú)){
               break;
            } else {
               System.out.println("Elección Incorrecta!!!");
            }
        }
    }
        ///
         public static void imprimirMenu() {
        System.out.println("******************************************************************");
        System.out.println("MENU:");
        System.out.println("1. Añadir un nuevo cliente \n"
                + "2. Quitar un cliente. \n"
                + "3. Mostrar los datos de un cliente. \n"
                + "4. Menu articulo.\n"
                + "5. Mostrar el valor total de un cliente. \n"
                + "6. Mostrar el valor total del banco. \n"
                + "0. Salir del menú");
        System.out.println("******************************************************************");
    }
    
   
    
    
    public static void MenuArticulo(){
        System.out.println("******************************************************************");
        System.out.println("MENU:");
        System.out.println("1. Agregar Articulo a un cliente.\n"
                + "2. Quitar un Articulo a un cliente.\n"
                + "0. Salir del menú");
        System.out.println("******************************************************************");
    }
    public static void mClientes(){
        
    }
    public static void mArticulos(){
        
    } 
}
///
        
//        Articulo articulo1 = new Articulo("Cuaderno", 2500);
//        Articulo articulo2 = new Articulo("panela sagrada",3500);
//        Cliente cliente1 = new Cliente("Jose Waldo", "Cánadiense", 1004, 301313);
//        Cliente cliente2 = new Cliente("Juan Aristizabal","Peruano",1005,310706);
//        Banco banco = new Banco("Banco J&J");
//        
//        String descripcionArticulo1 = "Cuaderno anillado de pasta dura";
//        String descripcionArticulo2 = "Panela de los quimbayas";
//        articulo1.setDescripcion(descripcionArticulo1);
//        articulo2.setDescripcion(descripcionArticulo2);
//        
//        articulo1.informacionArticulo();
//        articulo2.informacionArticulo();
//        cliente1.informeCliente();
//        cliente2.informeCliente();
//        
//        System.out.println("---------------------------------------");
//        banco.agregarCliente(cliente1);
//        banco.agregarCliente(cliente2);
//        banco.infoCliente(cliente1.getNumeroCedula());
//        banco.infoCliente(cliente2.getNumeroCedula());
//        cliente1.añadirArticulo(articulo1);
//        cliente2.añadirArticulo(articulo1);
//        cliente2.añadirArticulo(articulo2);
//        
//        System.out.println(banco.valorArticulosCliente(1005));
//        System.out.println(banco.valorArticulosDeTodosLosClientes());
//        banco.quitarArticuloCliente(articulo1, 1005);
//        System.out.println(banco.valorArticulosCliente(1005));
//        System.out.println(banco.valorArticulosDeTodosLosClientes());
//        banco.agregarCliente(cliente1);
//        banco.quitarCliente(cliente1);
//        banco.infoCliente(cliente1.getNumeroCedula());
//    
//    }
//   
//}
