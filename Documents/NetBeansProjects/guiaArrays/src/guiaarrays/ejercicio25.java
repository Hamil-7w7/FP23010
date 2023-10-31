
/*Realice un programa que verifique si una contraseña cumple con los siguientes
requisitos:

Tiene al menos 8 caracteres de longitud.
Contiene al menos 1 letra mayúscula.
Contiene al menos 1 letra minúscula.
Contiene al menos 1 dígito.
Contiene al menos 1 símbolo.*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasena;
        boolean repetir=false;
        int mayus=0,minus=0,digito=0,simbolo=0;
        do{
        do{
            System.out.println("Ingresa una contraseña que cumpla con los siguientes requisitos:");
            System.out.println("1. Debe tener al menos 8 caracteres de longitud");
            System.out.println("2. Debe contener al menos 1 letra mayuscula");
            System.out.println("3. Debe contener al menos 1 letra minuscula");
            System.out.println("4. Debe contener al menos 1 digito");
            System.out.println("5. Debe contener al menos 1 simbolo");
            contrasena=teclado.nextLine();
        }while(contrasena.length()<8);
        char[] password = contrasena.toCharArray();
        for(int i=0; i<password.length; i++){
            if(password[i]>=65 && password[i]<=90){
                mayus=password[i];   
            }else if(password[i]>=97 && password[i]<=122){
                minus=password[i];
            }else if(password[i]>=48  &&  password[i]<=57){
                digito=password[i];
            }else if(password[i]>=33 && password[i]<=64 || password[i]>=91 && password[i]<=96 || password[i]>=123 && password[i]<=126){
                simbolo=password[i];
            }
        }
        if(mayus!=0 && minus!=0 && digito!=0 && simbolo!=0){
            System.out.println("Contraseña valida");
            repetir=false;
        }else{
            System.out.println("Contraseña no valida");
            System.out.println("Por favor vuelva a intentarlo");
            System.out.println("--------------------------------");
            repetir=true;
        }
        }while(repetir==true);
    }
}