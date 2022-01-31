
package tecnicasprogramacion.reto5;

public class Pokebola {
    //atributos
    private String tamaño;
    private Pokemon pokemon;
    private boolean vacia = false;
    //constructor

    public Pokebola(String tamaño, Pokemon pokemon, boolean vacia) {
        this.tamaño = tamaño;
        this.pokemon = pokemon;
        this.vacia = vacia;
    }
    
    //metodos
    public void Atrapar(Pokemon x){
        if (this.vacia == true ){
            this.pokemon = x;
            this.vacia = false;
        }
        else {
            System.out.println("Esta pokebola esta ocupada");
        }
    }
    
    public void Liberar(Pokemon x){
        if (this.vacia == false ){
            this.vacia = true;
            this.pokemon = null;
            System.out.println("El pokemon "+x+" ha sido liberado");
        }
        else {
            System.out.println("Esta pokebola esta vacia");
        }
    }
    //getter and setter

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon Pokemon) {
        this.pokemon = Pokemon;
    }

    public boolean isVacia() {
        return vacia;
    }

    public void setVacia(boolean vacia) {
        this.vacia = vacia;
    }
    
}
