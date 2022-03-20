
package com.mycompany.reto9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reto9 {
    public static void main(String[] args) {
        
        /*
        TRABAJO ADICIONAL:
        No se puede hacer lo de acceso aleatorio ya que los registros deberían medir lo mismo,
        y este no es el caso ya que algunos se exceden por un número.
        
        ¿Qué utilidad considera que tiene aplicar uno u otro de los dos métodos anteriores?
        Se están observando los precios de cierre de un día para saber si este es muy bajo o alto,
        es decir, saber su comportamiento, si se hace de manera aleatoria se tendrian una idea más general,
        en cambio de la otra forma es más particular. Si saltando de 5 en 5 registros obtenemos
        que es Muy Bajo el precio de cierre y este se repite se sabrá que el comportamiento es bastante
        común sin tener que revisar cada día.
        
        */
        
        String rutaArchivoOriginal = "src\\main\\java\\com\\mycompany\\reto9\\archivos\\BTC-USD.csv";
        String rutaArchivoModificado = "src\\main\\java\\com\\mycompany\\reto9\\archivos\\NEW-BTC-USD.csv"; 
        Path rutaArchOriginal = Paths.get(rutaArchivoOriginal);
        Path rutaArchMod = Paths.get(rutaArchivoModificado);
        
        List<String> lineasArchivo; // Contiene la información del archivo BTC-USD.
        String[] datosLineaActual;  // Su finalidad es separar cada uno de los datos que hay en c/u de las lineas de BTC-USD.
        ArrayList<String> lineasArchivoModificado = new ArrayList(); // Guarda las fechas que se esta leyendo junto con el concepto.
        ArrayList<Double> preciosDeApertura = new ArrayList();
        ArrayList<Double> preciosDeCierre = new ArrayList();
        ArrayList<Double> preciosHigh = new ArrayList();
        ArrayList<Double> preciosLow = new ArrayList();
        ArrayList<String> fechas = new ArrayList();
        String conceptoClose = ""; // Aquí se guarda la respuesta sobre el precio de cierre (close).
        String lineaTextoModificado = ""; // Esta variable almacena temporalmente la fecha que se esta leyendo junto al concepto.
        
        try {
            lineasArchivo = Files.readAllLines(rutaArchOriginal);
            System.out.println(lineasArchivo);
            
            int cont = 0;
            for (String lineaActual : lineasArchivo) {
                datosLineaActual = lineaActual.split(",");
                if(cont != 0) {
                    conceptoClose = conceptoPrecioCierre(datosLineaActual[4]);
                    lineaTextoModificado = datosLineaActual[0] + "\t" + conceptoClose;
                    lineasArchivoModificado.add(lineaTextoModificado);
                    fechas.add(datosLineaActual[0]);
                    preciosDeApertura.add(Double.parseDouble(datosLineaActual[1]));
                    preciosDeCierre.add(Double.parseDouble(datosLineaActual[4]));
                    preciosHigh.add(Double.parseDouble(datosLineaActual[2]));
                    preciosLow.add(Double.parseDouble(datosLineaActual[3]));
                    escribirArchivo(rutaArchMod, lineasArchivoModificado);
                }
                cont++;
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al acceder al archivo: " + e.getMessage());
        }
        
        System.out.println("El promedio de los precios de apertura es: " + promedio(preciosDeApertura));
        System.out.println("La desviacion estandar de los precios de apertura es: " + desviacionEstandar(preciosDeApertura));
        buscarPrecioAlto(preciosHigh,fechas);
        buscarPrecioBajo(preciosLow,fechas);
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
    
    public static void escribirArchivo(Path ruta, ArrayList<String> cadena) throws IOException {
        String informeCompleto = "";
        for (String linea : cadena) {
            informeCompleto = informeCompleto + linea + "\n";
        }
        byte[] bytesCadena = informeCompleto.getBytes();
        Files.write(ruta, bytesCadena);
    }

    public static double promedio(ArrayList<Double> listaDeNumeros) {
        double subtotal = 0;
        int numeroDeDatos = listaDeNumeros.size();
        for (Double numero : listaDeNumeros) {
            subtotal += numero;
        }
        return subtotal / numeroDeDatos;
    }
    
    public static double desviacionEstandar(ArrayList<Double> listaDeNumeros) {
        double subtotal = 0;
        double promedio = promedio(listaDeNumeros);
        double total = 0;
        for (double numero : listaDeNumeros) {
            subtotal += Math.pow((numero - promedio), 2);
        }
        total = Math.pow((subtotal/(listaDeNumeros.size()-1)), 0.5);
        return total;
    }
    public static void buscarPrecioAlto(ArrayList<Double> listaHigh,ArrayList<String> fechas){
        int count= 0;
        double maxHigh = Collections.max(listaHigh);
        while( listaHigh.get(count) != maxHigh  ){
            count ++;
        }
        String fecha=fechas.get(count);
        System.out.println("el precio máximo fue: "+maxHigh+" y se dio en la fecha: "+fecha);
    }
    
    public static void buscarPrecioBajo(ArrayList<Double> listaLow,ArrayList<String> fechas){
        int count= 0;
        double min = Collections.min(listaLow);
        while( listaLow.get(count) != min  ){
            count ++;
        }
        String fecha=fechas.get(count);
        System.out.println("el precio mínimo fue de: "+min+" y se dio en la fecha: "+fecha);
    }
}
