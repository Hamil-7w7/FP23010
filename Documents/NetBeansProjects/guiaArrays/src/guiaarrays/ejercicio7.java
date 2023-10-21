
//7.Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si
//los números están
//ordenados de forma creciente, decreciente, o si están desordenados.

package guiaarrays;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        boolean creciente=false, decreciente=false;
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Ingrese un numero");
            numeros[i]=entrada.nextInt();
        }
        for(int i=0; i<9; i++){
            if(numeros[i]<numeros[i+1]){ //creciente
                creciente=true;
            }
            if(numeros[i]>numeros[i+1]){ //decreciente
                decreciente=true;
            }
        }
        if (creciente==true && decreciente==false){
            System.out.println("Los numeros estan de forma creciente");
        }else if(creciente==false && decreciente==true){
            System.out.println("Los numeros estan de forma decreciente");
        }else if(creciente==true && decreciente==true){
            System.out.println("Los numeros estan de forma desordenada");
        }else if(creciente==false && decreciente==false){
            System.out.println("Todos los numeros son iguales");
        }
    }
}