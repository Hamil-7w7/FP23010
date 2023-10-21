
//4. Leer 5 nombres de pokemon y mostralos en orden inverso al introducido.

package guiaarrays;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        String pokemones[] = new String[5];
        int i=0;
        for (i=0; i<5; i++){
            System.out.println("Ingrese el nombre de un pokemon");
            Scanner nombre = new Scanner (System.in);
            pokemones[i]=nombre.nextLine();
        }
        System.out.println("--------------");
        for (i=4; i>=0; i--){
            System.out.println(pokemones[i]);
        }
    }
}
