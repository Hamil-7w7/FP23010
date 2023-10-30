
/*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];
        System.out.println("Llene la matriz 1");
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1.length; j++){  
                matriz1[i][j]=entrada.nextInt();
            }
        }
        System.out.println("Matriz 1 llena: ");
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1.length; j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Llene la matriz 2");
        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2.length; j++){  
                matriz2[i][j]=entrada.nextInt();
            }
        }
        System.out.println("Matriz 2 llena: ");
        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2.length; j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1.length; j++){
                for(int a=0; a<matriz2.length; a++){
                    for(int b=0; b<matriz2.length; b++){
                        for( int c=0; c<matriz3.length; c++){
                            for( int d=0; d<matriz3.length; d++){
                                matriz3[c][d]=matriz1[i][j]+matriz2[a][b];
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Matrices sumadas: ");
        for(int i=0; i<matriz3.length; i++){
            for(int j=0; j<matriz3.length; j++){
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println("");
        }
    } 
}
