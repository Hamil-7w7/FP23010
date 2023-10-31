
/*Desarrollarás un programa para gestionar las calificaciones de un grupo de estudiantes
a lo largo de varios períodos académicos. El programa permitirá a los usuarios ingresar
y consultar calificaciones por período y por estudiante.*/

package guiaarrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ejercicio28 {   
    public static void main(String[] args) {
        int periodos,estudiantes,elegirPeriodo,opcion,elegirEstudiante,option;
        double calificasionEstudiante,calificasionPeriodo;
        Scanner teclado = new Scanner(System.in);
        boolean repetir=false;
        do{
            estudiantes=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de estudiantes (1-10)"));
        }while(estudiantes<1 || estudiantes>10);
        do{
            periodos=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de periodos (3-5)"));
        }while(periodos<3 || periodos>5);
        repetir=true;
        double[][] calificasiones = new double[estudiantes][periodos];
        do{
        do{
            System.out.println("Menu principal.");
            System.out.println("1-Ingresar calificaciones por periodo.");
            System.out.println("2-Ingresar calificaciones por estudiante.");
            System.out.println("3-Ver calificaciones.");
            System.out.println("4-Salir.");
            opcion=teclado.nextInt();
        }while(opcion<1 || opcion>4);
        if(opcion==1){           
            do{
                System.out.println("Ingrese el numero de perido entre (1 y "+periodos+")");
                elegirPeriodo=teclado.nextInt();
            }while(elegirPeriodo<1 || elegirPeriodo>periodos);
            for(int i=0; i<estudiantes; i++){
                do{
                    System.out.println("Ingrese la calificasion del estudiante "+(i+1)+" en el periodo "+elegirPeriodo);
                    calificasionEstudiante=teclado.nextDouble();
                }while(calificasionEstudiante<0.0 || calificasionEstudiante>10.0);
                calificasiones[i][elegirPeriodo-1]=calificasionEstudiante;
            }
        }else if(opcion==2){
            repetir=true;
            do{
                System.out.println("Ingrese el numero de estudiante entre (1 y "+estudiantes+")");
                elegirEstudiante=teclado.nextInt();
            }while(elegirEstudiante<1 || elegirEstudiante>estudiantes);
            for(int j=0; j<periodos; j++){
                do{
                    System.out.println("Ingrese la calificasion del estudiante "+elegirEstudiante+" en el perido "+(j+1));
                    calificasionPeriodo=teclado.nextDouble();
                }while(calificasionPeriodo<0.0 || calificasionPeriodo>10.0);
                calificasiones[elegirEstudiante-1][j]=calificasionPeriodo;
            }
        }else if(opcion==3){
            repetir=true;
            System.out.println(ANSI_BLUE + ("                      Periodos")+ANSI_RESET);
            System.out.println(ANSI_RED + ("               1    2    3    4    5  ")+ANSI_RESET);
            for(int i=0; i<estudiantes; i++){
                System.out.print(ANSI_BLUE+("Estudiante ")+ANSI_RESET);
                System.out.print(ANSI_RED+(i+1+"  ")+ANSI_RESET);               
                for(int j=0; j<periodos; j++){                    
                    System.out.print(calificasiones[i][j]+"  ");   
                }
                System.out.println("");
            }
        }else if(opcion==4){
            System.out.println("Que tenga un lindo dia guapo ;)");
            repetir=false;
        }
        }while(repetir==true); 
    }
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}