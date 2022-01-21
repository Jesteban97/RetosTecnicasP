/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasprogramacion.reto4;

import java.util.Calendar;

/**
 *
 * @author USUARIO
 */
public class Alquiler {

    // Atributos:
    private int id_alquiler;
    private int id_vehiculo;
    private Calendar inicio_alquiler = Calendar.getInstance();
    private Calendar final_alquiler = Calendar.getInstance();
    private String tipoId_cliente;
    private int id_cliente;
    private String nombre_cliente;
    private double pago;
    private String descripcion;

    // Constructor: 
    public Alquiler(int id_alquiler, int id_vehiculo, String fecha_inicio, String fecha_final,
            String tipoId_cliente, int id_cliente, String nombre_cliente, double pago, String descripcion) {

        this.id_alquiler = id_alquiler;
        this.id_vehiculo = id_vehiculo;
        calibrarFecha(fecha_inicio, this.inicio_alquiler);
        calibrarFecha(fecha_final, this.final_alquiler);
        this.final_alquiler = final_alquiler;
        this.tipoId_cliente = tipoId_cliente;
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.pago = pago;
        this.descripcion = descripcion;
    }

    public Alquiler(int id_alquiler, int id_vehiculo, String fecha_final,
            String tipoId_cliente, int id_cliente, String nombre_cliente, double pago, String descripcion) {

        this.id_alquiler = id_alquiler;
        this.id_vehiculo = id_vehiculo;
        this.inicio_alquiler = Calendar.getInstance();
        calibrarFecha(fecha_final, this.final_alquiler);
        this.final_alquiler = final_alquiler;
        this.tipoId_cliente = tipoId_cliente;
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.pago = pago;
        this.descripcion = descripcion;
    }
    
    public Alquiler(int id_alquiler, int id_vehiculo, String fecha_final,
            int id_cliente, String nombre_cliente, double pago) {

        this.id_alquiler = id_alquiler;
        this.id_vehiculo = id_vehiculo;
        this.inicio_alquiler = Calendar.getInstance();
        calibrarFecha(fecha_final, this.final_alquiler);
        this.tipoId_cliente = "Cedula de ciudadania";
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.pago = pago;
        this.descripcion = "";
    }
    // Getters:

    public int getId_alquiler() {
        return id_alquiler;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public Calendar getInicio_alquiler() {
        return inicio_alquiler;
    }

    public Calendar getFinal_alquiler() {
        return final_alquiler;
    }

    public String getTipoId_cliente() {
        return tipoId_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public double getPago() {
        return pago;
    }

    public String getDescripcion() {
        return descripcion;
    }
    

    // Métodos:
    private void calibrarFecha(String fecha, Calendar fecha_calibrar) {
        String[] fecha_lista = fecha.split("-");
        int[] fecha_lista_int = new int[5];
        for (int i = 0; i < fecha_lista.length; i++) {
            fecha_lista_int[i] = Integer.parseInt(fecha_lista[i]);
        }

        fecha_calibrar.set(fecha_lista_int[0], fecha_lista_int[1] - 1, fecha_lista_int[2], fecha_lista_int[3], fecha_lista_int[4]);
    }

}
