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
public class Charizard extends Pokemon{
    
    // Atributos:
    private String name;
    private byte nivel;
    private int vida;

    // Constructores: 
    public Charizard() {
        this.name = "Charizard";
        this.nivel = 1;
        this.vida = 100;
    }

    public Charizard(String name, byte nivel, int vida) {
        this.name = name;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    // Getters:
    public String getName() {
        return name;
    }

    public byte getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Metodos:
    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException(this.name);
    }

    @Override
    public String gritar() {
        return "Charizard!";
    }
      
}
