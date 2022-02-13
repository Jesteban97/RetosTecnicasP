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
        TramoGenerico tramo2 = new TramoSinAsfaltar(2, 3, 4, 5, "piedra", 0.35);
        
        // Método para añadir tramos de diferentes tipos a carretera.
        carretera.añadirTramo(tramo1);
        carretera.añadirTramo(tramo2);
        
        System.out.println("Contenido de carretera: " + carretera.getTramos().toString());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // Método para calcular la longitud total de la carretera.
        double longitudTramo1 = tramo1.longitud();
        double longitudTramo2 = tramo2.longitud();
        double longitudCarretera = carretera.longitudTotal();
        System.out.println("La longitud del tramo 1 es: " + String.format("%.2f", longitudTramo1));
        System.out.println("La longitud del tramo 2 es: " + String.format("%.2f", longitudTramo2));
        System.out.println("La longitud total de la carretera es: " + String.format("%.2f", longitudCarretera));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // Método para calcular el área total de la carretera: 
        double areaTramo1 = tramo1.area();
        double areaTramo2 = tramo2.area();
        double areaCarretera = carretera.areaTotal();
        System.out.println("El área del tramo 1 es: " + String.format("%.2f", areaTramo1));
        System.out.println("El área del tramo 2 es: " + String.format("%.2f", areaTramo2));
        System.out.println("El área total de la carretera es: " + String.format("%.2f", areaCarretera));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // Método para calcular el volumen del material total de la carretera: 
        double volumenTramo1 = tramo1.volumen();
        double volumenTramo2 = tramo2.volumen();
        double volumenCarretera = carretera.volumenMaterialTotal();
        double volumenCarreteraAsfalto = carretera.volumenAsfaltoTotal();
        double volumenCarreteraSinAsfalto = carretera.volumenSinAsfaltoTotal();
        
        System.out.println("El volumen del tramo 1 es: " + String.format("%.2f", volumenTramo1));
        System.out.println("El volumen del tramo 2 es: " + String.format("%.2f", volumenTramo2));
        System.out.println("");
        System.out.println("El volumen total del material de la carretera es: " + String.format("%.2f", volumenCarretera));
        System.out.println("El volumen total de asfalto a utilizar en la carretera es: " + 
                String.format("%.2f", volumenCarreteraAsfalto));
        System.out.println("El volumen total de material sin asfalto a utilizar en la carretera es: " 
                + String.format("%.2f", volumenCarreteraSinAsfalto));
    }
    
}
