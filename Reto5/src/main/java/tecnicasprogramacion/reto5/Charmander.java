
package tecnicasprogramacion.reto5;


public class Charmander extends Pokemon {
// Atributos:
    private String name;
    private byte nivel;
    private int vida;
    
    //Constructores
    public Charmander() {
        this.name = "Chramander";
        this.nivel =  1;
        this.vida = 100;
    }
    
    public Charmander(String name, byte nivel, int vida) {
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
    
    //Metodos:
    @Override
    public Pokemon evolucionar() {
        return new Charmeleon(this.name, this.nivel, this.vida);
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }
}
