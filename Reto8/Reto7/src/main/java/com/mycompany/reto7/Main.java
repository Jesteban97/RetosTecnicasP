/*

Constructor clase asfaltada:
TramoAsfalto(double xInicial, double yInicial, double xFinal, double yFinal, String proveedorAsfalto, double velocidadMax, boolean prohibidoAdelantar)

Constructor clase sin asfaltar:
public TramoSinAsfaltar(double xInicial, double yInicial, double xFinal, double yFinal, String tipoMaterial, double espesor)

*/

package com.mycompany.reto7;

public class Main {

    public static void main(String[] args) {
        Carretera carretera = new Carretera();
        
        TramoGenerico tramo1 = new TramoAsfalto(1, 1, 2, 2, "Pepito", 80, true);
        TramoGenerico tramo2 = new TramoSinAsfaltar(3, 4, 5, 5, "piedra", 0.35);
        TramoGenerico tramo3 = new TramoAsfalto(5, 5, 7, 7, "Pepito", 60, true);
        TramoGenerico tramo4 = new TramoSinAsfaltar(7, 7, 8, 8, "arena", 0.35);
        // Método para añadir tramos de diferentes tipos a carretera.
        carretera.añadirTramo(tramo1);
        carretera.añadirTramo(tramo2);
        carretera.añadirTramo(tramo3);
        carretera.añadirTramo(tramo4);
        
        System.out.println("Contenido de carretera: " + carretera.getTramos().toString());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // Método para calcular la longitud total de la carretera.
        double longitudTramo1 = tramo1.calcularLongitud();
        double longitudTramo2 = tramo2.calcularLongitud();
        double longitudCarretera = carretera.calcularLongitudTotal();
        System.out.println("La longitud del tramo 1 es: " + String.format("%.2f", longitudTramo1));
        System.out.println("La longitud del tramo 2 es: " + String.format("%.2f", longitudTramo2));
        System.out.println("La longitud total de la carretera es: " + String.format("%.2f", longitudCarretera));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // Método para calcular el área total de la carretera: 
        double areaTramo1 = tramo1.calcularArea();
        double areaTramo2 = tramo2.calcularArea();
        double areaCarretera = carretera.calcularAreaTotal();
        System.out.println("El área del tramo 1 es: " + String.format("%.2f", areaTramo1));
        System.out.println("El área del tramo 2 es: " + String.format("%.2f", areaTramo2));
        System.out.println("El área total de la carretera es: " + String.format("%.2f", areaCarretera));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // Método para calcular el volumen del material total de la carretera: 
        double volumenTramo1 = tramo1.calcularVolumen();
        double volumenTramo2 = tramo2.calcularVolumen();
        double volumenCarretera = carretera.calcularVolumenMaterialTotal();
        double volumenCarreteraAsfalto = carretera.calcularVolumenAsfaltoTotal();
        System.out.println(volumenCarreteraAsfalto);
        double volumenCarreteraSinAsfalto = carretera.calcularVolumenSinAsfaltoTotal();
        boolean tramosConectados = carretera.evaluarConexionTramos();
        
        System.out.println("El volumen del tramo 1 es: " + String.format("%.2f", volumenTramo1));
        System.out.println("El volumen del tramo 2 es: " + String.format("%.2f", volumenTramo2));
        System.out.println("");
        System.out.println("El volumen total del material de la carretera es: " + String.format("%.2f", volumenCarretera));
        System.out.println("El volumen total de asfalto a utilizar en la carretera es: " + 
                String.format("%.2f", volumenCarreteraAsfalto));
        System.out.println("El volumen total de material sin asfalto a utilizar en la carretera es: " 
                + String.format("%.2f", volumenCarreteraSinAsfalto));
        
        // Método para saber si los tramos están conectados entre sí
        System.out.println("Los tramos estan conectados: " 
                + tramosConectados);
    }
    
}
