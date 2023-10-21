
//8. Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante
//el teclado 8 números.
//Después se debe pedir un número y una posición, insertarlo en la posición indicada,
//desplazando los que estén
//detrás.

package guiaarrays;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<8; i++){
            System.out.println("Ingrese un numero en la posicion "+(i));
            array[i]=entrada.nextInt();
        }
        for(int b=0; b<10; b++){
            System.out.println("En la posicion "+(b)+" numero: "+array[b]);
        }
        System.out.println("Ingrese el numero a insertar");
        int numero = entrada.nextInt();
        int posicion;
        do{
        System.out.println("¿En que posicion?(0-9)");
        posicion = entrada.nextInt();
        }while(posicion<0 || posicion>9);
        for (int i=array.length-1;  i>posicion; i--){
            array[i]=array[i-1];
        }
        array[posicion]=numero;
        for(int p=0; p<10; p++){
            System.out.println("En la posicion "+(p)+" numero: "+array[p]);
        }
    }
}
