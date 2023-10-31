
/*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se
obtiene la
misma tabla al cambiar las filas por columnas.*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio19 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores de la matriz (fila por fila): ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        boolean esSimetrica = true;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }
        System.out.println("-----------------------");
        if (esSimetrica) {
            for(int i=0; i<filas; i++){
                for( int j=0;j<columnas; j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("La matriz es simetrica");
        } else {
            for(int i=0; i<filas; i++){
                for( int j=0;j<columnas; j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }    
            System.out.println("La matriz no es simetrica");
        }
    }
}
