
//2. Leer 5 números por teclado y a continuación realizar la media de los números
//positivos, la media
//de los negativos y contar el número de ceros.

package guiaarrays;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        int array[] = new int[5];
        int i=0;
        double numerosNegativos=0.0,numerosPositivos=0.0;
        int contadorNegativos=0,contadorPositivos=0,contadorCeros=0;
        double mediaPositivos=0.0,mediaNegativos=0.0;
        for (i=0; i<5; i++){
            System.out.println("Ingrese un numero");
            Scanner numero = new Scanner(System.in);
            array[i]=numero.nextInt();
            if (array[i]==0){
                contadorCeros=contadorCeros+1;
            }else if (array[i]<0){
                numerosNegativos=numerosNegativos+array[i];
                contadorNegativos=contadorNegativos+1;
            }else if (array[i]>0){
                numerosPositivos=numerosPositivos+array[i];
                contadorPositivos=contadorPositivos+1;
            }
        }
        mediaPositivos=numerosPositivos/contadorPositivos;
        mediaNegativos=numerosNegativos/contadorNegativos;
        System.out.println("------------------------------------------");
        System.out.println("La media de los numeros positivos es: "+mediaPositivos);
        System.out.println("La media de los numeros negativos es: "+mediaNegativos);
        System.out.println("La cantidad de ceros ingresados fue de: "+contadorCeros);
    }
    
}
