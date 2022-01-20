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
public class Seguro {
    //atributos
    private int id;
    private Calendar iniCobertura;
    private Calendar finCobertura;
    private int idVehiculo;
    private String empresaSeguro;
    private String descripcion;
    private int duracionSeguro;
    private double valorSeguro;
    private double valorPago;
    //constructor
    public Seguro(int id, Calendar iniCobertura, Calendar finCobertura, int idVehiculo, String empresaSeguro, String descripcion, int duracionSeguro, double valorSeguro, double valorPago) {
        this.id = id;
        this.iniCobertura = iniCobertura;
        this.finCobertura = finCobertura;
        this.idVehiculo = idVehiculo;
        this.empresaSeguro = empresaSeguro;
        this.descripcion = descripcion;
        this.duracionSeguro = duracionSeguro;
        this.valorSeguro = valorSeguro;
        this.valorPago = valorPago;
    }
    //metodos
    
    //metodos getter and setter

    public int getId() {
        return id;
    }

    public Calendar getIniCobertura() {
        return iniCobertura;
    }

    public void setIniCobertura(Calendar iniCobertura) {
        this.iniCobertura = iniCobertura;
    }

    public Calendar getFinCobertura() {
        return finCobertura;
    }

    public void setFinCobertura(Calendar finCobertura) {
        this.finCobertura = finCobertura;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getEmpresaSeguro() {
        return empresaSeguro;
    }

    public void setEmpresaSeguro(String empresaSeguro) {
        this.empresaSeguro = empresaSeguro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracionSeguro() {
        return duracionSeguro;
    }

    public void setDuracionSeguro(int duracionSeguro) {
        this.duracionSeguro = duracionSeguro;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    
}
