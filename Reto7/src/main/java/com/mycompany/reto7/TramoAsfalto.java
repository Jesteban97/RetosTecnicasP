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
    
    public TramoAsfalto(double xInicial, double yInicial, double xFinal, double yFinal) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.velocidadMax = 80;
        this.prohibidoAdelantar = true;
    }
    

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

    /*------------------------------------GETTERS Y SETTERS------------------------------------*/

    public double getxInicial() {
        return xInicial;
    }

    public double getyInicial() {
        return yInicial;
    }

    public double getxFinal() {
        return xFinal;
    }

    public double getyFinal() {
        return yFinal;
    }

    public String getProveedorAsfalto() {
        return proveedorAsfalto;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public boolean isProhibidoAdelantar() {
        return prohibidoAdelantar;
    }

    public void setProveedorAsfalto(String proveedorAsfalto) {
        this.proveedorAsfalto = proveedorAsfalto;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void setProhibidoAdelantar(boolean prohibidoAdelantar) {
        this.prohibidoAdelantar = prohibidoAdelantar;
    }

    /*------------------------------------MÉTODOS------------------------------------*/
    
    @Override
    public double longitud(){
        double cateto1 = this.xFinal - this.xInicial;
        double cateto2 = this.yFinal - this.yInicial;
        double longitudFinal = Math.sqrt((Math.pow(cateto1, 2)) + Math.pow(cateto2, 2));
        
        return longitudFinal;
    }
    
    @Override
    public double area(){
        double ancho = 8;
        double alto = longitud();    
        double areaFinal = ancho * alto;
        
        return areaFinal;
    }
    
    @Override
    public double volumen(){
        double espesor = 0.25;
        double area = area();
        double volumenFinal = espesor * area;
        
        return volumenFinal;
    }
    
}
