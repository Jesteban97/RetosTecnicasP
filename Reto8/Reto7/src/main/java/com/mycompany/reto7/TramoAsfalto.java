package com.mycompany.reto7;

public class TramoAsfalto extends TramoGenerico {

    /*------------------------------------ATRIBUTOS------------------------------------*/
    
    private double xInicial;
    private double yInicial;
    private double xFinal;
    private double yFinal;
    private String proveedorAsfalto;
    private double velocidadMax;
    private boolean prohibidoAdelantar;

    /*------------------------------------CONSTRUCTORES------------------------------------*/

    public TramoAsfalto(double xInicial, double yInicial, double xFinal, double yFinal,
            String proveedorAsfalto, double velocidadMax, boolean prohibidoAdelantar) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.proveedorAsfalto = proveedorAsfalto;
        this.velocidadMax = velocidadMax;
        this.prohibidoAdelantar = prohibidoAdelantar;
    }

    /*------------------------------------MÉTODOS------------------------------------*/
    
    @Override
    public double calcularLongitud(){
        double cateto1 = this.xFinal - this.xInicial;
        double cateto2 = this.yFinal - this.yInicial;
        double longitudFinal = Math.sqrt((Math.pow(cateto1, 2)) + Math.pow(cateto2, 2));
        
        return longitudFinal;
    }
    
    @Override
    public double calcularArea(){
        double ancho = 8;
        double alto = calcularLongitud();    
        double areaFinal = ancho * alto;
        
        return areaFinal;
    }
    
    @Override
    public double calcularVolumen(){
        double espesor = 0.25;
        double area = calcularArea();
        double volumenFinal = espesor * area;
        
        return volumenFinal;
    }

    @Override
    public double getXInicial() {
        return xInicial;
    }

    

    @Override
    public double getYInicial() {
        return yInicial;
    }

    @Override
    public double getXFinal() {
        return xFinal;
    }

    @Override
    public double getYFinal() {
        return yFinal;
    }

  
    
}
