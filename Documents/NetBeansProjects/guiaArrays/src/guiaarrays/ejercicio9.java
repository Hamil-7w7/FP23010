//9. Crear un programa que lea por teclado un array de 10 números enteros y los
//desplace una posición hacia
//abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así
//sucesivamente. El último pasa a
//ser el primero.

package guiaarrays;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
      int array[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Ingrese un numero en la posicion "+(i));
            array[i]=entrada.nextInt();
        }
        int ultimo=array[9];
        for(int i=8; i>=0; i--){
            array[i+1]=array[i];
        }
        System.out.println("Nuevo array");
        array[0]=ultimo;
        for( int i=0; i<10; i++){
            System.out.println("En la posicion "+i+" numero: "+array[i]);
        }
    }
}
