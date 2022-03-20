/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto11;

/**
 *
 * @author JoseW
 */
public class PrecioBtcUsd {

    private String fecha;
    private double precioApertura;
    private double precioAltoDia;
    private double precioBajoDia;
    private double precioCierre;
    private double precioCierreAdj;
    private long volumenTransadoDia;

    public PrecioBtcUsd(String fecha, String precioApertura, String precioAltoDia, String precioBajoDia,
            String precioCierre, String precioCierreAdj, String volumenTransadoDia) {
        this.fecha = fecha;
        this.precioApertura = Double.parseDouble(precioApertura);
        this.precioAltoDia = Double.parseDouble(precioAltoDia);
        this.precioBajoDia = Double.parseDouble(precioBajoDia);
        this.precioCierre = Double.parseDouble(precioCierre);
        this.precioCierreAdj = Double.parseDouble(precioCierreAdj);
        this.volumenTransadoDia = Long.parseLong(volumenTransadoDia);
    }

    public String getFecha() {
        return fecha;
    }

    public double getPrecioApertura() {
        return precioApertura;
    }

    public double getPrecioAltoDia() {
        return precioAltoDia;
    }

    public double getPrecioBajoDia() {
        return precioBajoDia;
    }

    public double getPrecioCierre() {
        return precioCierre;
    }

    public double getPrecioCierreAdj() {
        return precioCierreAdj;
    }

    public long getVolumenTransadoDia() {
        return volumenTransadoDia;
    }

}
