
package tecnicasprogramacion.reto5;

public class Pokebola {
    // Atributos: 
    private String tamanio;
    private Pokemon pokemonAtrapado;
    private boolean vacia;
    
    // Constructor:
    public Pokebola(String tamanio, Pokemon pokemonAtrapado) {
        this.tamanio = tamanio;
        this.pokemonAtrapado = pokemonAtrapado;
        this.vacia = false;
    }

    public Pokebola() {
        this.pokemonAtrapado = null;
        this.tamanio = "pequeña";
        this.vacia = true;
    }
    
    // Getters:
    public String getTamanio() {
        return tamanio;
    }

    public Pokemon getPokemonAtrapado() {
        return pokemonAtrapado;
    }

    public boolean isVacia() {
        return vacia;
    }
    
    // Metodos
    public void atrapar(Pokemon poke){
        this.pokemonAtrapado = poke;
        System.out.println("El pokemon ha sido atrapado!");

    }
    
    public void liberar() {
        this.pokemonAtrapado = null;
        System.out.println("El pokemon ha sido liberado!");
    }
}
