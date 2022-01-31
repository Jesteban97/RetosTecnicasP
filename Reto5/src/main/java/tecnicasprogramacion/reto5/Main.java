
package tecnicasprogramacion.reto5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            /*
            Ya que al colocar directamente el valor en el constructor arroja un error,
            decidimos crear un array tipo byte con los niveles disponibles omitiendo el cero,
            solo fue añadido para crear un tipo de nomenclatura. Ej:
            nivel[4] = 4
            */
            byte[] nivel = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
            // Creación de cada uno de los pokemones
            Pokemon pokemon1 = new Charmander("Charmander", nivel[1], 100);
            Pokemon pokemon2 = new Charmeleon("Charmaleon", nivel[2], 120);
            Pokemon pokemon3 = new Charizard("Charizard", nivel[3], 140);
            Pokemon pokemon4 = new Pikachu("Pikachu", nivel[4], 150);
            Pokemon pokemon5 = new Pikachu("Raichu", nivel[5], 170);
            Pokemon pokemon6 = new Pikachu("Squirtle", nivel[2], 110);
            Pokemon pokemon7 = new Pikachu("Wartortle", nivel[3], 140);
            Pokemon pokemon8 = new Pikachu("Blastoise", nivel[6], 160);
            
            // Creacion de una pokebola y guardar pokemones.
            Pokebola pokebola1 = new Pokebola("Mediana", pokemon1);
            System.out.println("La pokebola1 tiene un tamaño: " + pokebola1.getTamanio());
            System.out.println("Grito del pokemon atrapado: " + pokebola1.getPokemonAtrapado().gritar());
            
            // De la siguiente manera podemos acceder a los atributos del pokemon,
            // pero teniedo en cuenta que tipo es, para hacer el casting.
            Charmander pokemonAtrapado1 = (Charmander) pokebola1.getPokemonAtrapado();
            System.out.println("El pokemon atrapado tiene el nivel: " + pokemonAtrapado1.getNivel());
            System.out.println("Y tiene " + pokemonAtrapado1.getVida() + " de vida");
            
            // Evolucion:
            Pokemon pokemonE = new Charmander("Poke Especial", nivel[6], 140);
            System.out.println("El pokemon evolucionado grita: " + pokemonE.evolucionar().gritar());
            
            // Gritos de los pokemones ya creados
            System.out.println("El pokemon1 grita: " + pokemon1.gritar());
            System.out.println("El pokemon1 grita: " + pokemon2.gritar());
            System.out.println("El pokemon1 grita: " + pokemon3.gritar());
            System.out.println("El pokemon1 grita: " + pokemon4.gritar());
            System.out.println("El pokemon1 grita: " + pokemon5.gritar());
            System.out.println("El pokemon1 grita: " + pokemon6.gritar());
            System.out.println("El pokemon1 grita: " + pokemon7.gritar());
            System.out.println("El pokemon1 grita: " + pokemon8.gritar());
        } catch (NoEvolucionaException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
}
