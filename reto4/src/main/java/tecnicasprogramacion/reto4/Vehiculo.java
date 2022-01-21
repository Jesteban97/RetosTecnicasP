package tecnicasprogramacion.reto4;

import java.util.Calendar;

public class Vehiculo {
    
    // estamos en la rama experimental
    
    //atributos
    private int id;
    private String placa;
    private int antiguedad;
    private String ant;
    private String modelo;
    private int anoModelo;
    private double precioHora;
    private String tipo;
    private String estadoVehiculo;
    private boolean vehEnReparacion;

    //constructores
    public Vehiculo(int id, String placa, int antiguedad, String ant, String modelo, int anoModelo, 
            double precioHora, String tipo, String estadoVehiculo, boolean vehEnReparacion) {
        this.id = id;
        this.placa = placa;
        this.antiguedad = antiguedad;
        this.ant = ant;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.precioHora = precioHora;
        this.tipo = tipo;
        this.estadoVehiculo = estadoVehiculo;
        this.vehEnReparacion = vehEnReparacion;
    }

    public Vehiculo(int id, int antiguedad, String modelo, int anoModelo, double precioHora, 
            String tipo, String estadoVehiculo, boolean vehEnReparacion) {
        this.id = id;
        this.antiguedad = antiguedad;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.precioHora = precioHora;
        this.tipo = tipo;
        this.estadoVehiculo = estadoVehiculo;
        this.vehEnReparacion = vehEnReparacion;
    }

    //metodos
    public void calAntiguedad(int anoModelo) {
        Calendar fechaA = Calendar.getInstance();
        fechaA.get(Calendar.YEAR);
        setAntiguedad(fechaA.get(Calendar.YEAR) - anoModelo);
        if (getAntiguedad() > 0 && getAntiguedad() <= 1) {
            setAnt("Nuevo");
            System.out.println("El vehiculo es: " + getAnt());
        } else if (getAntiguedad() > 1 && getAntiguedad() <= 4) {
            setAnt("Medianamente usado");
            System.out.println("El vehiculo es: " + getAnt());
        } else if (getAntiguedad() >= 5) {
            setAnt("Usado");
            System.out.println("El vehiculo es: " + getAnt());
        }

    }

    //metodos getter and setter
    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public String getAnt() {
        return ant;
    }

    public void setAnt(String ant) {
        this.ant = ant;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public boolean isVehEnReparacion() {
        return vehEnReparacion;
    }

    public void setVehEnReparacion(boolean vehEnReparacion) {
        this.vehEnReparacion = vehEnReparacion;
    }

}