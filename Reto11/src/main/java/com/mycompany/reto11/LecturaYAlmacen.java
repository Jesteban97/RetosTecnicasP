/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseW
 */
public class LecturaYAlmacen {

    private String rutaArchivo = "src\\main\\java\\com\\mycompany\\reto11\\BTC-USD.csv";
    private Path rutaArch = Paths.get(rutaArchivo);
    private List<PrecioBtcUsd> listaPrecios = new ArrayList<>();

    private void lecturaArchivo() {
        List<String> lineasArchivo = new ArrayList<>();
        List<String[]> infoLinea = new ArrayList<>();
        try {
            lineasArchivo = Files.readAllLines(this.rutaArch);
            for (int i = 1; i < lineasArchivo.size(); i++) {
                String[] parts = lineasArchivo.get(i).split(",");
                infoLinea.add(parts);
            }
            for (String[] infoSeparada : infoLinea) {
                PrecioBtcUsd precio = new PrecioBtcUsd(infoSeparada[0], infoSeparada[1], infoSeparada[2], infoSeparada[3],
                    infoSeparada[4], infoSeparada[5], infoSeparada[6]);
                this.listaPrecios.add(precio);
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder al archivo: " + e.getMessage());
        }
    }

    public List<PrecioBtcUsd> getListaPrecios() {
        lecturaArchivo();
        return listaPrecios;
    }

}
