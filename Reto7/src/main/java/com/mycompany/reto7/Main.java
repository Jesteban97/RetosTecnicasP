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
        
        carretera.añadirTramo(tramo1);
        carretera.añadirTramo(tramo2);
        
        System.out.println("Carretera: " + tramo1.getClass().getSimpleName());;
        System.out.println("Carretera: " + tramo2.getClass().getSimpleName());;
       
    }
    
}
