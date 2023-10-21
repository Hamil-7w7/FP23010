
/*17. Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.*/

package guiaarrays;
public class ejercicio17 {
    public static void main(String[] args) {
        int matriz[][] = {{1,2,3,},{4,5,6,},{7,8,9}};
        System.out.println("Matiz original: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------------");
        System.out.println("Matriz transpuesta:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
