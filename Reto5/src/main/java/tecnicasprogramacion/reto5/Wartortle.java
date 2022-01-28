
package tecnicasprogramacion.reto5;


public class Wartortle extends Pokemon {
    //atributos
    private String name="Wartortle";
    private byte nivel=1;
    private int vida=100; 
    //constructor

    public Wartortle() {
    }
    
    
    public Wartortle(String name,byte nivel,int vida) {
        this.name = name;
        this.nivel=nivel;
        this.vida=vida;
    }
    
    @Override
    public Pokemon Evolucionar(Pokemon x){
      x =new Blastoise(getName(),getNivel(),getVida());
        return x;
    }
    @Override
    public String Gritar(){
      String grito="Wartortle!";
      return grito;
    }

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
