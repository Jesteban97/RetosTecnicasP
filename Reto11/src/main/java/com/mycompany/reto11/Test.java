/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseW
 */
public class Test {
    public static void main(String[] args) {
        LecturaYAlmacen lya = new LecturaYAlmacen();
        //List<PrecioBtcUsd> listaPrecios = lya.getListaPrecios();
        
        //System.out.println(listaPrecios);
        
        List<PrecioBtcUsd> listaPrecios;
        listaPrecios = lya.getListaPrecios();
        
        //lya.lecturaArchivo();
        
        for (PrecioBtcUsd listaPrecio : listaPrecios) {
            System.out.println(listaPrecio.getFecha());
        }
        
        System.out.println("Termine!");
    }
}
