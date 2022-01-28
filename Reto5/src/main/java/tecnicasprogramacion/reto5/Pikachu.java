
package tecnicasprogramacion.reto5;

public class Pikachu extends Pokemon{
//atributos
    private String name="Pikachu";
    private byte nivel=1;
    private int vida=100; 
    //constructor

    public Pikachu() {
    }
    
    public Pikachu(String name,byte nivel,int vida) {
        this.name = name;
        this.nivel=nivel;
        this.vida=vida;
    }
    //metodos
    @Override
    public Pokemon Evolucionar(Pokemon x){
      x =new Raichu(getName(),getNivel(),getVida());
        return x;
    }
    @Override
    public String Gritar(){
      String grito="Pikachu!";
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
