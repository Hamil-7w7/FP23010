
//3. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
//último, el segundo, el
//penúltimo, el tercero, etc.

package guiaarrays;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int i=0;
        for(i=0; i<10; i++){
            System.out.println("Ingrese un numero");
            Scanner numeros = new Scanner(System.in);
            array[i]=numeros.nextInt();
        }
        System.out.println("--------");
        System.out.print(array[0]+"-");
        System.out.println(array[9]);
        System.out.print(array[1]+"-");
        System.out.println(array[8]);
        System.out.print(array[2]+"-");
        System.out.println(array[7]);
        System.out.print(array[3]+"-");
        System.out.println(array[6]);
        System.out.print(array[4]+"-");
        System.out.println(array[5]);
    }
    
}
