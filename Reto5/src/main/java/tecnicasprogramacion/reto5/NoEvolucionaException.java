package tecnicasprogramacion.reto5;

public class NoEvolucionaException extends Exception {

    public NoEvolucionaException(String nombre) {
        super(nombre + " no puede evolucionar más!");
    }
 
}
