
//5. Crea un programa que encuentre el valor máximo y mínimo en un array de números
//enteros. se debe llenar el array con números ingresados por el usuario.

package guiaarrays;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        int rango=0,i=0,mayor=0,menor=0;
        do{
            System.out.println("Ingrese el tamaño del array");
            System.out.println("El numero ingresado debe ser mayor o igual a 3");
            Scanner datoUsuario = new Scanner(System.in);
            rango=datoUsuario.nextInt();
        }while (rango<3);
        int numeros[] = new int[rango];
        for (i=0; i<rango; i++){
            System.out.println("Ingrese la posicion numero: "+(i+1));
            Scanner posicion = new Scanner(System.in);
            numeros[i]=posicion.nextInt();
            if (mayor<numeros[i]){
                mayor=numeros[i];
            }
            if(i==0){
                menor=numeros[i];
            }else if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println("------------------------------------");
        System.out.println("El numero mayor ingresado fue: "+mayor);
        System.out.println("El numero menor ingresado fue: "+menor);
    }   
}
