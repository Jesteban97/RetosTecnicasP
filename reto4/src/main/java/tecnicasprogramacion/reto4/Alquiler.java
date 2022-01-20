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
    //atributos
    private int id;
    private int idVehiculo;
    private int vigenciaAlquiler;
    private Calendar fechaIniAlquiler;
    private Calendar fechaFinAlquiler;
    private String tipoDoc;
    private String numDoc;
    private String nombre;
    private String descripcion;
    private double valorPago;
    //constructor
    public Alquiler(int id, int idVehiculo, int vigenciaAlquiler, Calendar fechaIniAlquiler, Calendar fechaFinAlquiler, String tipoDoc, String numDoc, String nombre, String descripcion, double valorPago) {
        this.id = id;
        this.idVehiculo = idVehiculo;
        this.vigenciaAlquiler = vigenciaAlquiler;
        this.fechaIniAlquiler = fechaIniAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorPago = valorPago;
    }
    //metodos
    
    //metodos getter and setter

    public int getId() {
        return id;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public int getVigenciaAlquiler() {
        return vigenciaAlquiler;
    }

    public void setVigenciaAlquiler(int vigenciaAlquiler) {
        this.vigenciaAlquiler = vigenciaAlquiler;
    }

    public Calendar getFechaIniAlquiler() {
        return fechaIniAlquiler;
    }

    public void setFechaIniAlquiler(Calendar fechaIniAlquiler) {
        this.fechaIniAlquiler = fechaIniAlquiler;
    }

    public Calendar getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    public void setFechaFinAlquiler(Calendar fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }


    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    
    
}
