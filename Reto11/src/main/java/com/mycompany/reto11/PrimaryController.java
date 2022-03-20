package com.mycompany.reto11;

import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController implements Initializable {

    @FXML
    private TableView<PrecioBtcUsd> tablaPrecios;
    
    @FXML
    private TableColumn colFecha;
    
    @FXML
    private TableColumn colPrecApert;
    
    @FXML
    private TableColumn colPrecAlto;
    
    @FXML
    private TableColumn colPrecBajo;
    
    @FXML
    private TableColumn colPrecCierre;
    
    @FXML
    private TableColumn colPrecCierreAdj;
    
    @FXML
    private TableColumn colVolTransado;
    
    private ObservableList<PrecioBtcUsd> listaPreciosBtcUsd;
    
    @FXML
    private Button btPromPrecCierre;
    
    @FXML
    private Label txtRespuesta;
    
    private final LecturaYAlmacen almacen = new LecturaYAlmacen();
    private final List<PrecioBtcUsd> listaPrecios = almacen.getListaPrecios();
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
       
        listaPreciosBtcUsd = FXCollections.observableArrayList();    
        
        this.colFecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        this.colPrecApert.setCellValueFactory(new PropertyValueFactory("precioApertura"));
        this.colPrecAlto.setCellValueFactory(new PropertyValueFactory("precioAltoDia"));
        this.colPrecBajo.setCellValueFactory(new PropertyValueFactory("precioBajoDia"));
        this.colPrecCierre.setCellValueFactory(new PropertyValueFactory("precioCierre"));
        this.colPrecCierreAdj.setCellValueFactory(new PropertyValueFactory("precioCierreAdj"));
        this.colVolTransado.setCellValueFactory(new PropertyValueFactory("volumenTransadoDia"));
        
        
        for (PrecioBtcUsd btcusd : this.listaPrecios) {
            this.listaPreciosBtcUsd.add(btcusd);
            this.tablaPrecios.setItems(listaPreciosBtcUsd);
        }
       
    }
    
    @FXML
    private void promPrecCierre(ActionEvent event){
        
        double total = promedio();

        this.txtRespuesta.setText("El promedio de los precios de cierre es: \n" + total);

    }
    
    @FXML
    private void desviacionEstandarCierre(ActionEvent event) {
        
        int tamañoElementos = listaPrecios.size();
        double promedio = promedio();
        
        double subtotal = 0;
        double diferencia = 0;
        
        for (PrecioBtcUsd elem : this.listaPreciosBtcUsd) {
            diferencia = elem.getPrecioCierre() - promedio;
            subtotal += Math.pow(diferencia, 2);
        }
        
        double resultado = subtotal / (tamañoElementos - 1);
        
        double total = Math.pow(resultado, 0.5);
        this.txtRespuesta.setText("La desviacion estandar es: " + total);

    }
    @FXML
    private void calcularMayorPrecio(ActionEvent event) {
        
        double precioMayor;
        precioMayor = this.listaPrecios.stream().map(x -> x.getPrecioCierre()).max(Comparator.naturalOrder()).get();
        
        String fechaPrecioMayor;
        
        int count = 0;
        for (PrecioBtcUsd elem : this.listaPreciosBtcUsd) {
            if(elem.getPrecioCierre() == precioMayor){
                break;
            }
            count++;
        }
        
        fechaPrecioMayor = this.listaPrecios.get(count).getFecha();
        
        this.txtRespuesta.setText("Precio Mayor: " + precioMayor + "\n Fecha: " + fechaPrecioMayor);
        
    }
    @FXML
    private void calcularMenorPrecio(ActionEvent event) {
        
        double precioMenor;
        precioMenor = this.listaPrecios.stream().map(x -> x.getPrecioCierre()).min(Comparator.naturalOrder()).get();
        
        String fechaPrecioMenor;
        
        int count = 0;
        for (PrecioBtcUsd elem : this.listaPreciosBtcUsd) {
            if(elem.getPrecioCierre() == precioMenor){
                break;
            }
            count++;
        }
        
        fechaPrecioMenor = this.listaPrecios.get(count).getFecha();
        
        this.txtRespuesta.setText("Precio Menor: " + precioMenor + "\n Fecha: " + fechaPrecioMenor);
        
    }
    
    private double promedio(){
        int tamañoElementos = listaPrecios.size();
        double subtotal = 0;
        
        for (PrecioBtcUsd elem : listaPrecios) {
            subtotal += elem.getPrecioCierre();
        }
        
        double total = subtotal / tamañoElementos;
        
        return  total;
    }
    
}
