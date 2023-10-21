
/*24. Dado el siguiente array crear otro array donde guardara el array original sin los
números duplicados*/

package guiaarrays;
public class ejercicio24 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        int[] arraySinDuplicados = new int[arrayOriginal.length];
        
        for(int i=0; i<arraySinDuplicados.length-1; i++){
            for(int j=0; j<arrayOriginal.length-1; j++){
                if(arraySinDuplicados[i]==arrayOriginal[j]){
                    
                }else{
                    arraySinDuplicados[i]=arrayOriginal[j];
                }
            }
        }
        System.out.println("Nuevo array");
        for(int b: arraySinDuplicados){
            System.out.println(b);
        }
    } 
}
