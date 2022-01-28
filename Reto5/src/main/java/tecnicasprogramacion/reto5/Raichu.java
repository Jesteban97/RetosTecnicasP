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
public class Raichu extends Pokemon {
//atributos
    private String name="Raichu";
    private byte nivel=1;
    private int vida=100; 
 //constructor

    public Raichu() {
    }
    
    public Raichu(String name,byte nivel,int vida) {
        this.name = name;
        this.nivel=nivel;
        this.vida=vida;
    }
   //metodos
    @Override
    public Pokemon Evolucionar(Pokemon x)throws NoEvolucionaException{
      throw new NoEvolucionaException(getName()+" no puede evolucionar más");
    }
    @Override
    public String Gritar(){
      String grito="Raichu!";
      return grito;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
