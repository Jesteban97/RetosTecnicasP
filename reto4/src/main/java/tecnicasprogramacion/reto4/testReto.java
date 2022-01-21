/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasprogramacion.reto4;
import java.util.Calendar;

/**
 *
 * @author JoseW
 */
public class testReto {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(1956, "XXK89", "Automovil", "Tesla Model S", 2018, 90580);
        String descripcion = "El vehiculo es de color rojo con vidrios polarizados.";
        
        vehiculo1.antiguedadaVehiculo();
        vehiculo1.infoVehiculo();
        vehiculo1.modificarDescripcion(descripcion);
        vehiculo1.infoVehiculo();
        
        Alquiler alquiler1 = new Alquiler(102456, vehiculo1.getId_vehiculo(), "2022-08-29-06-30", "2022-09-05-14-27", "Cedula", 1004807096, "Jose Waldo", 500000, "");
        
        System.out.println("Fecha inicio: " + alquiler1.getInicio_alquiler());
        System.out.println("Fecha final: " + alquiler1.getFinal_alquiler());
    
    }
}
