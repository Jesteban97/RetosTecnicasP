
package tecnicasprogramacion.reto5;

public class Pokebola {
<<<<<<< HEAD
    // Atributos: 
    private String tamanio;
    private Pokemon pokemonAtrapado;
    private boolean vacia;
    
    // Constructor:
    public Pokebola(String tamanio, Pokemon pokemonAtrapado) {
        this.tamanio = tamanio;
        this.pokemonAtrapado = pokemonAtrapado;
        this.vacia = false;
=======
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
>>>>>>> 1b3793353c65a28f1a1cf708f2c0dbf08ca1c989
    }

    public Pokebola() {
        this.pokemonAtrapado = null;
        this.tamanio = "pequeña";
        this.vacia = true;
    }
<<<<<<< HEAD
    
    // Getters:
    public String getTamanio() {
        return tamanio;
    }

    public Pokemon getPokemonAtrapado() {
        return pokemonAtrapado;
=======

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon Pokemon) {
        this.pokemon = Pokemon;
>>>>>>> 1b3793353c65a28f1a1cf708f2c0dbf08ca1c989
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
