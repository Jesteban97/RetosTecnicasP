
package tecnicasprogramacion.reto5;

//atributos
public class Charmeleon extends Pokemon {
    private String name="Charmeleon";
    private byte nivel=1;
    private int vida=100; 
 //constructor

    public Charmeleon() {
    }
    
    
    public Charmeleon(String name,byte nivel,int vida) {
        this.name = name;
        this.nivel=nivel;
        this.vida=vida;
    }

//metodos
    
    @Override
    public Pokemon Evolucionar(Pokemon x){
      x =new Charizard(getName(),getNivel(),getVida());
        return x;
    }
    @Override
    public String Gritar(){
      String grito="Charmeleon!";
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
