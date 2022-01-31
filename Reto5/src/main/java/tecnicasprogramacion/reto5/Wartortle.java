
package tecnicasprogramacion.reto5;


public class Wartortle extends Pokemon {
    
    // Atributos:
    private String name;
    private byte nivel;
    private int vida;
    
    //Constructores
    public Wartortle() {
        this.name = "Wartortle";
        this.nivel =  1;
        this.vida = 100;
    }
    
    public Wartortle(String name, byte nivel, int vida) {
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
        return new Blastoise(this.name, this.nivel, this.vida);
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }
      
}
