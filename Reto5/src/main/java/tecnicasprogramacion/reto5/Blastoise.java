
package tecnicasprogramacion.reto5;

public class Blastoise extends Pokemon{
    // Atributos:
    private String name;
    private byte nivel;
    private int vida;

    // Constructores: 
    public Blastoise() {
        this.name = "Blastoise";
        this.nivel = 1;
        this.vida = 100;
    }

    public Blastoise(String name, byte nivel, int vida) {
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
        return "Blastoise!";
    }
    
}
