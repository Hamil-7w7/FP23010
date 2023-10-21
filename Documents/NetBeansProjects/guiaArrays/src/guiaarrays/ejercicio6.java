

//6. Dado los siguientes Arrays mezclar los nombres de Pokémon de los arrays
//nombresPokemonA y nombresPokemonB en un tercer array
//nombresPokemonC de la forma el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.),

package guiaarrays;
public class ejercicio6 {
    public static void main(String[] args) {
        
        String[] nombresPokemonA = {
        "1A-Pikachu",
        "2A-Charizard",
        "3A-Bulbasaur",
        "4A-Squirtle",
        "5A-Jigglypuff",
        "6A-Eevee",
        "7A-Mewtwo",
        "8A-Snorlax",
        "9A-Gengar",
        "10A-Machamp"};
        
        String[] nombresPokemonB = {
        "1B-Venusaur",
        "2B-Blastoise",
        "3B-Dragonite",
        "4B-Gyarados",
        "5B-Alakazam",
        "6B-Arcanine",
        "7B-Lapras",
        "8B-Golem",
        "9B-Gyarados",
        "10B-Rhydon"};
        
        String[] nombresPokemonC = {
        "1A-Pikachu",
        "1B-Venusaur",
        "2A-Charizard",
        "2B-Blastoise",
        "3A-Bulbasaur",
        "3B-Dragonite",
        "4A-Squirtle",
        "4B-Gyarados",
        "5A-Jigglypuff",
        "5B-Alakazam",
        "6A-Eevee",
        "6B-Arcanine",
        "7A-Mewtwo",
        "7B-Lapras",
        "8A-Snorlax",
        "8B-Golem",
        "9A-Gengar",
        "9B-Gyarados",
        "10A-Machamp",
        "10B-Rhydon"};
        
        System.out.println("Grupo A de pokemones");
        for ( String nombresA: nombresPokemonA){
            System.out.println(nombresA);
        }
        System.out.println("-------------------");
        
        System.out.println("Grupo B de pokemones");
        for (String nombresB: nombresPokemonB){
            System.out.println(nombresB);
        }
        System.out.println("-------------------");
        
        System.out.println("Grupo C de pokemones");
        for (String nombresC: nombresPokemonC){
            System.out.println(nombresC);
        }
    }
    
}
