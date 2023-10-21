
/*11. Leer por teclado un array de 10 elementos numéricos enteros y una posición (entre
0 y 9). Eliminar el
elemento situado en la posición dada sin dejar huecos.
*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int array[] = new int[10];
        int posicion;
        for(int i=0; i<10; i++){
            System.out.println("Ingrese un numero en la posicion: "+i);
            array[i]=teclado.nextInt();
        }
        System.out.println("Ingrese la posicion a eliminar");
        posicion=teclado.nextInt();
        for(int i=posicion; i<9; i++){
            array[i]=array[i+1];
        }
        System.out.println("El array queda: ");
        for(int b: array){
            System.out.print(b+" - ");
        }
    }
}
