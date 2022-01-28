
package tecnicasprogramacion.reto5;

public class Blastoise extends Pokemon{
    //atributos
    private String name="Blastoise";
    private byte nivel=1;
    private int vida=100; 
    //constructor

    public Blastoise() {
    }
    
    public Blastoise(String name,byte nivel,int vida) {
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
      String grito="Blastoise!";
      return grito;
    }
    //gets and sets

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
