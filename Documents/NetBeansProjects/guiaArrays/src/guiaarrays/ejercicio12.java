
/*12. Pedir al usuario el nombre de un pokemon, buscarlo en el siguiente array si se
encuentra mostrar el indice en el que se encontro sino mostrar un mensaje
adecuado notificandolo*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pokemonABuscar;
        int contador=0;
        String nombresPokemonB[] = {
            "Venusaur","Blastoise","Dragonite","Gyarados","Alakazam","Arcanine",
            "Lapras","Golem","Gyarados","Rhydon"
        };
        System.out.println("Ingrese el nombre del pokemon a buscar");
        pokemonABuscar=teclado.nextLine();
        for(int i=0; i<10; i++){
            if (nombresPokemonB[i].equalsIgnoreCase(pokemonABuscar)){
                System.out.println("El pokemon "+pokemonABuscar+" fue encontrado en la posicion: "+i);
                break;
            }else{
                contador++;    
            } 
        }
        if (contador==10){
            System.out.println("El pokemon no fue encontrado");
        }
    }  
}
