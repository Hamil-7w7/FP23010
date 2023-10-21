
/*13. Pedir un numero entero (index) validar que este en el rango del array proporcionado
y mostrar el nombre del pokemon que se encuentra en ese indice.*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String[] nombresPokemonB = {
        "Venusaur","Blastoise","Dragonite","Gyarados","Alakazam","Arcanine",
        "Lapras","Golem","Gyarados","Rhydon"};
        do{
            System.out.println("Ingrese una posicion entre 0 y 9");
            numero=teclado.nextInt();
        }while(numero<0 || numero>9);
        System.out.println("El pokemon que esta en esa posicion es "+nombresPokemonB[numero]);
    }
    
}
