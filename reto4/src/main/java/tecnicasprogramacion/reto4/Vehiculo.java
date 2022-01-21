package tecnicasprogramacion.reto4;

import java.util.Calendar;

public class Vehiculo {

    // Atributos:
    private int         id_vehiculo;
    private String      placa_vehiculo;
    private String      descrip_vehiculo;
    private String      tipo_vehiculo;
    private String      modelo_vehiculo;
    private int         anio_vehiculo;
    private double      precio_hora;
    
    // Constructores:
    public Vehiculo(int id_vehiculo, String placa_vehiculo, String descrip_vehiculo, 
            String tipo_vehiculo, String modelo_vehiculo, int anio_vehiculo, double precio_hora) {
        this.id_vehiculo = id_vehiculo;
        this.placa_vehiculo = placa_vehiculo;
        this.descrip_vehiculo = descrip_vehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
        this.anio_vehiculo = anio_vehiculo;
        this.precio_hora = precio_hora;
    }
    
    public Vehiculo(int id_vehiculo, String placa_vehiculo, String tipo_vehiculo, 
            String modelo_vehiculo, int anio_vehiculo, double precio_hora) {
        this.id_vehiculo = id_vehiculo;
        this.placa_vehiculo = placa_vehiculo;
        this.descrip_vehiculo = "";
        this.tipo_vehiculo = tipo_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
        this.anio_vehiculo = anio_vehiculo;
        this.precio_hora = precio_hora;
    }
    
    //Getter:

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public String getPlaca_vehiculo() {
        return placa_vehiculo;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public String getModelo_vehiculo() {
        return modelo_vehiculo;
    }

    public int getAnio_vehiculo() {
        return anio_vehiculo;
    }

    public double getPrecio_hora() {
        return precio_hora;
    }
    
    
    // Métodos: 
    public void antiguedadaVehiculo(){
        int anio_actual = 2022;
        int antiguedad = anio_actual - this.anio_vehiculo;
        
        if(antiguedad >= 0 && antiguedad <= 1) {
            System.out.println("El vehiculo: " + this.modelo_vehiculo + " y con placa: " 
                    + this.placa_vehiculo + ", es nuevo");
        }
        
        if(antiguedad >= 2 && antiguedad <= 4) {
            System.out.println("El vehiculo: " + this.modelo_vehiculo + " y con placa: " 
                    + this.placa_vehiculo + ", es medianamente usado");
        }
        
        if(antiguedad >= 5) {
            System.out.println("El vehiculo: " + this.modelo_vehiculo + " y con placa: " 
                    + this.placa_vehiculo + ", es usado");
        }
    }
    
    public void infoVehiculo() {
        System.out.println("********* INFORMACION DEL VEHICULO *********");
        System.out.println("Tipo de vehiculo: " + this.tipo_vehiculo);
        System.out.println("Modelo: " + this.modelo_vehiculo);
        System.out.println("Placa: " + this.placa_vehiculo);
        System.out.println("Año: " + this.anio_vehiculo);
        System.out.println("Descripción: " + this.descrip_vehiculo);
        System.out.println("Precio de alquilaje: " + this.precio_hora + " por hora");
        System.out.println("********************************************");
    }
    
    public void modificarDescripcion(String descripcion) {
        this.descrip_vehiculo = descripcion;
    }
}
