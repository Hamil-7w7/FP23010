
//10. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
//Éstos los guardaremos en un array de tamaño 10. Leer un número N, e insertarlo en
//el lugar adecuado para que el array continúe ordenado.

package guiaarrays;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int array[] = new int[10];
        boolean creciente=true;
        int numero,indice=0,j=0;
        System.out.println("Llene el array de forma ordenada asendentemente");
        do{
            for (int i=0; i<5; i++){
                System.out.print((i+1)+"-Ingrese un numero: ");
                array[i]=entrada.nextInt();
            }
            for (int i=0; i<4; i++){
                if(array[i]<array[i+1]){
                    creciente=true;
                }
                if(array[i]>array[i+1]){
                    creciente=false;
                    break;
                }
            }
            if (creciente==false){
                System.out.println("El arreglo no esta ordenado, vuelva a digitar");
            }
        }while(creciente==false);
        System.out.print("Digite un numero a insertar: ");
        numero=entrada.nextInt();
        while(array[j]<numero && j<5){
            indice++;
            j++;
        }
        for(int i=4; i>=indice; i--){
            array[i+1]=array[i];
        }
        array[indice]=numero;
        System.out.println("El array queda: ");
        for(int i=0; i<6; i++){
            System.out.print(array[i]+" - ");
        }
    }
}