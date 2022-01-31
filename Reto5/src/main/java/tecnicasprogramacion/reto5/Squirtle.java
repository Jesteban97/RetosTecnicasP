
package tecnicasprogramacion.reto5;


public class Squirtle extends Pokemon {
    
    // Atributos:
    private String name;
    private byte nivel;
    private int vida;
    
    //Constructores
    public Squirtle() {
        this.name = "Squirtle";
        this.nivel =  1;
        this.vida = 100;
    }
    
    public Squirtle(String name, byte nivel, int vida) {
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
    
    //Metodos:
    @Override
    public Pokemon evolucionar() {
        return new Wartortle(this.name, this.nivel, this.vida);
    }

    @Override
    public String gritar() {
        return "Squirtle!";
    }
   
}
