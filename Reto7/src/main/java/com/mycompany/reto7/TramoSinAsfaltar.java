
package com.mycompany.reto7;

public class TramoSinAsfaltar extends TramoGenerico{
    
    /*------------------------------------ATRIBUTOS------------------------------------*/
    private double xInicial;
    private double yInicial;
    private double xFinal;
    private double yFinal;
    private String tipoMaterial;
    private double espesor;
    
    /*------------------------------------CONSTRUCTOR------------------------------------*/

    public TramoSinAsfaltar(double xInicial, double yInicial, double xFinal, double yFinal, 
            String tipoMaterial, double espesor) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.tipoMaterial = tipoMaterial;
        this.espesor = espesor;
    }
    
    /*------------------------------------MÉTODOS------------------------------------*/
    
    @Override
    public double longitud() {
        double cateto1 = this.xFinal - this.xInicial;
        double cateto2 = this.yFinal - this.yInicial;
        double longitudFinal = Math.sqrt((Math.pow(cateto1, 2)) + Math.pow(cateto2, 2));
        
        return longitudFinal;
    }

    @Override
    public double area() {
        double ancho = 6;
        double alto = longitud();    
        double areaFinal = ancho * alto;
        
        return areaFinal;
    }

    @Override
    public double volumen() {
        double area = area();
        double volumenFinal = this.espesor * area;
        
        return volumenFinal;
    }
    
    
    
}
