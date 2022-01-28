/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasprogramacion.reto5;

/**
 *
 * @author USUARIO
 */
public abstract class Pokemon {
    //atributos
    
    //constructor
    public Pokemon() {
    }
    //metodos
    abstract public Pokemon Evolucionar(Pokemon x)throws NoEvolucionaException;
    abstract public String Gritar();
}
