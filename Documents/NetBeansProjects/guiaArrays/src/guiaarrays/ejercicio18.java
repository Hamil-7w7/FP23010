

/*18. Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la
diagonal principal sean 1 y el resto 0.*/

package guiaarrays;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[7][7];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(i==j){
                    matriz[i][j]=1;
                    
                }else{
                    matriz[i][j]=0;
                }  
            }
        }
        System.out.println("El array queda:");
        System.out.println();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
