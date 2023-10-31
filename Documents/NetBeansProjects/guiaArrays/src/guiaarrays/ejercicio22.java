
/*Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
los de los bordes que
deben ser 1. Mostrarla.*/

package guiaarrays;
public class ejercicio22 {
    public static void main(String[] args) {
        int filas=6;
        int columnas=8;
        int[][] matriz = new int[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                if(i==0){
                    matriz[i][j]=1;
                }else if(j==0){
                    matriz[i][j]=1;
                }else if(i==5){
                    matriz[i][j]=1;
                }else if(j==5){
                    matriz[i][j]=1;
                }
            }
        }
        System.out.println("El array queda: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    } 
}
