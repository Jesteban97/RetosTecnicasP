
package tecnicasprogramacion.reto5;

public class Main {

    public static void main(String[] args) {
        //ejemplo exception
        final byte nCharizard=6;
        Charizard perrito = new Charizard("perrito",nCharizard,1000);
        try {
        perrito.Evolucionar(perrito);
        }catch(Exception e){
          e.printStackTrace(System.out);
        
        }
        System.out.println(perrito.Gritar());
        
        //ejemplo evolucion
        final byte nCharmander = 2;
        Charmander fueguito = new Charmander("fueguito",nCharmander,150);
        System.out.println(fueguito);
        System.out.println(fueguito.getClass());
        System.out.println(fueguito.Gritar());
        
        Pokemon x=fueguito.Evolucionar(fueguito);  
        
        System.out.println(x.getClass());
         try {
        Pokemon y=x.Evolucionar(x);
        System.out.println(y.getClass());
        }catch(Exception e){
          e.printStackTrace(System.out);
        }
        
    }
    
}
