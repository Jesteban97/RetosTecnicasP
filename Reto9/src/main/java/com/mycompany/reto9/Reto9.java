
package com.mycompany.reto9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reto9 {
    public static void main(String[] args) {
        
        String rutaArchivoOriginal = "src\\main\\java\\com\\mycompany\\reto9\\archivos\\BTC-USD.csv";
        String rutaArchivoModificado = "src\\main\\java\\com\\mycompany\\reto9\\archivos\\NEW-BTC-USD.csv"; 
        Path miRuta = Paths.get(rutaArchivoOriginal);
        
        List<String> lineasArchivo; // Contiene la información del archivo BTC-USD.
        String[] datosLineaActual;  // Su finalidad es separar cada uno de los datos que hay en c/u de las lineas de BTC-USD.
        ArrayList<String> lineasArchivoModificado = new ArrayList(); // Guarda las fechas que se esta leyendo junto con el concepto.
        String conceptoClose = ""; // Aquí se guarda la respuesta sobre el precio de cierre (close).
        String lineaTextoModificado = ""; // Esta variable almacena temporalmente la fecha que se esta leyendo junto al concepto.
        
        try {
            lineasArchivo = Files.readAllLines(miRuta);
            
            int cont = 0;
            for (String lineaActual : lineasArchivo) {
                datosLineaActual = lineaActual.split(",");
                if(cont != 0) {
                    conceptoClose = conceptoPrecioCierre(datosLineaActual[4]);
                    lineaTextoModificado = datosLineaActual[0] + "\t" + conceptoClose;
                    lineasArchivoModificado.add(lineaTextoModificado);
                    guardarPorLineas(rutaArchivoModificado, lineasArchivoModificado);
                }
                cont++;
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder al archivo: " + e.getMessage());
        }
    }
    
    public static String conceptoPrecioCierre(String valor) {
        double valorClose = Double.parseDouble(valor);
        if(valorClose < 30000) {
            return "MUY BAJO";
        }
        if(valorClose >= 30000 && valorClose < 40000 ) {
            return "BAJO";
        }
        if(valorClose >= 40000 && valorClose < 50000 ) {
            return "MEDIO";
        }
        if(valorClose >= 50000 && valorClose < 60000 ) {
            return "ALTO";
        }
        return "MUY ALTO";
    }
    
    public static void guardarPorLineas(String ruta, ArrayList<String> lineas){
        try (PrintWriter escritor = new PrintWriter(new FileWriter(ruta))) {
            for (String linea : lineas) {
                escritor.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
