
/*24. Dado el siguiente array crear otro array donde guardara el array original sin los
números duplicados*/

package guiaarrays;
public class ejercicio24 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        int[] arraySinDuplicados = new int[arrayOriginal.length];
        int j,top=0;
        boolean repetido;
        for(int i=0; i<arrayOriginal.length; i++){
            repetido=false;
            j=0;
            while(!repetido && j<top){
                if(arrayOriginal[i] == arraySinDuplicados[j]){
                    repetido=true;
                }
                j++;
            }
            if(!repetido){
                arraySinDuplicados[top]=arrayOriginal[i];
                top++;
            }
        }
        System.out.println("Array original:");
        for(int i=0; i<arrayOriginal.length; i++){
            System.out.print(arrayOriginal[i]+" ");
        }
        System.out.println("");
        System.out.println("Arra sin duplicados:");
        for(int i=0; i<top; i++){
            System.out.print(arraySinDuplicados[i]+" ");
        }
    } 
}
