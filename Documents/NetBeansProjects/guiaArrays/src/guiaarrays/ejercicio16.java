

/*16. Encuentra y muestra el nombre del Pokémon con la mayor cantidad de poder*/

package guiaarrays;
public class ejercicio16 {
    public static void main(String[] args) {
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur","Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};
        System.out.println("Pokemon: "+nombresPokemon[0]+"   Poder: "+poderesPokemon[0]);
        System.out.println("Pokemon: "+nombresPokemon[1]+"   Poder: "+poderesPokemon[1]);
        System.out.println("Pokemon: "+nombresPokemon[2]+"   Poder: "+poderesPokemon[2]);
        System.out.println("Pokemon: "+nombresPokemon[3]+"   Poder: "+poderesPokemon[3]);
        System.out.println("---------------------------------");
        System.out.println("El pokemon con mayor poder es: ");
         System.out.println("Pokemon: "+nombresPokemon[1]+"   Poder: "+poderesPokemon[1]);
    }
    
}
