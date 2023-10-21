

/*14. Dado el siguiente array ordenar en orden ascendente y descendente utilizando dos
métodos de ordenamiento puede usar el que desee.*/

package guiaarrays;
public class ejercicio14 {
    public static void main(String[] args) {
        int aux;
        int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98,45};
        System.out.println("Array normal:");
        for(int i: numerosDesordenados){
            System.out.print(i+",");
        }
        for(int i=0; i<(numerosDesordenados.length-1); i++){
            for(int j=0; j<(numerosDesordenados.length-1); j++){
                if(numerosDesordenados[j]>numerosDesordenados[j+1]){
                    aux=numerosDesordenados[j];
                    numerosDesordenados[j]=numerosDesordenados[j+1];
                    numerosDesordenados[j+1]=aux;
                }
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("\nArray de forma ascendente:");
        for (int i=0; i<numerosDesordenados.length; i++){
            System.out.print(numerosDesordenados[i]+",");
        }
        System.out.println("\n------------------------------");
        System.out.println("\nArray de forma decreciente:");
        for (int i=numerosDesordenados.length-1; i>=0; i--){
            System.out.print(numerosDesordenados[i]+",");
        }
    }
    
}
