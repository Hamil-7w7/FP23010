
/*Invertir orden de un array*/

package guiaarrays;
public class ejercicio21 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("Array normal: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        for(int i=0; i<array.length/2; i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println("\nArray invertido:");
        for(int b:array){
            System.out.print(b+" ");
        }
    } 
}
