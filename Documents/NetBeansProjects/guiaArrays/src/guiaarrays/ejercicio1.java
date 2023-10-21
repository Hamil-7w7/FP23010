
//1. Leer 5 números y mostrarlos en el mismo orden introducido.

package guiaarrays;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        int i=0;
        int array[] = new int[5];
        for (i=0; i<5; i++){
            System.out.println("Ingrese un numero");
            Scanner numero = new Scanner(System.in);
            array[i]=numero.nextInt();
        }
        System.out.println("-------");
        for (i=0; i<5; i++){
            System.out.println(array[i]);
        }
    }
    
}
