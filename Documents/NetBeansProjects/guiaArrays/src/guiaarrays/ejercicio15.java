

/*15. Dado un conjunto de nombres de Pokémon almacenados en un array y otro
conjunto de sus respectivas cantidades de poder almacenadas en otro array, se
solicita al usuario ingresar un nombre de Pokémon y una cantidad de poder. El
objetivo es buscar el nombre del Pokémon proporcionado por el usuario en el array
de nombres. Si se encuentra el nombre del Pokémon en el array, se actualizará la
cantidad de poder asociada a ese Pokémon con la cantidad proporcionada por el
usuario.*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        int pokemon=5;
        String[] nombresPokemon = {"pikachu", "charizard","bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("Ingrese el nombre del pokemon a buscar");
        String nombre = teclado.nextLine();
        for(int i=0; i<nombresPokemon.length; i++){
            if(nombresPokemon[i].equalsIgnoreCase(nombre)){
                pokemon=i;
            }
        }
        if(pokemon==0){
            System.out.println("Pokemon: "+nombre+"    Poder: "+poderesPokemon[0]);
        }else if(pokemon==1){
            System.out.println("Pokemon: "+nombre+"    Poder: "+poderesPokemon[1]);
        }else if(pokemon==2){
            System.out.println("Pokemon: "+nombre+"    Poder: "+poderesPokemon[2]);
        }else if(pokemon==3){
            System.out.println("Pokemon: "+nombre+"    Poder: "+poderesPokemon[3]);
        }else if(pokemon==4){
            System.out.println("Pokemon: "+nombre+"    Poder: "+poderesPokemon[4]);
        }else if(pokemon==5){
            System.out.println("-------------------------------");
            System.out.println("Pokemon no encontrado");
            System.out.println("Por favor vuelva a intentarlo");
            System.out.println("-------------------------------");
        }
        }while(pokemon!=0 && pokemon!=1 && pokemon!=2 && pokemon!=3 && pokemon!=4);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingrese la cantidad de poder nueva que desee asignarle a dicho pokemon");
        int poder = teclado.nextInt();
        if(pokemon==0){
            poderesPokemon[0]=poder;
            System.out.println("Pokemon: Pikachu     Nuevo poder: "+poderesPokemon[0]);
        }else if(pokemon==1){
            poderesPokemon[1]=poder;
            System.out.println("Pokemon: Charizard     Nuevo poder: "+poderesPokemon[1]);
        }else if(pokemon==2){
            poderesPokemon[2]=poder;
            System.out.println("Pokemon: Bulbasaur     Nuevo poder: "+poderesPokemon[2]);
        }else if(pokemon==3){
            poderesPokemon[3]=poder;
            System.out.println("Pokemon: Squirtle     Nuevo poder: "+poderesPokemon[3]);
        }else if(pokemon==4){
            poderesPokemon[4]=poder;
            System.out.println("Pokemon: Jigglypuff     Nuevo poder: "+poderesPokemon[4]);
        }  
    }
}
