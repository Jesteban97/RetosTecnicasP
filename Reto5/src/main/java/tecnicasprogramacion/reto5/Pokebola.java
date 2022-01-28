
package tecnicasprogramacion.reto5;

public class Pokebola {
    //atributos
    private String tamaño;
    private Pokemon Pokemon;
    private boolean vacia = false;
    //constructor

    public Pokebola(String tamaño, Pokemon Pokemon, boolean vacia) {
        this.tamaño = tamaño;
        this.Pokemon = Pokemon;
        this.vacia = vacia;
    }
    
    //metodos
    public void Atrapar(Pokemon x){
        
    }
    
    public void Liberar(Pokemon x){
        
    }
    //getter and setter

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Pokemon getPokemon() {
        return Pokemon;
    }

    public void setPokemon(Pokemon Pokemon) {
        this.Pokemon = Pokemon;
    }

    public boolean isVacia() {
        return vacia;
    }

    public void setVacia(boolean vacia) {
        this.vacia = vacia;
    }
    
}
