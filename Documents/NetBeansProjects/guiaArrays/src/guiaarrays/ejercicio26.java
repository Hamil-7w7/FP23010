
/*Utilizando dos estructuras de datos (array) unidimensional cree un programa que
permita gestionar la asignación de asientos en un microbús con una distribución de filas
y asientos en dos lados, izquierdo y derecho. Los asientos pueden ser vendidos y
devueltos, y el programa debe llevar un registro de las ventas totales.*/

package guiaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio26 {
    
    static boolean devolverAsiento(int[] arr, int posicion){
        if(arr[posicion-1]==1){
            arr[posicion-1]=-1;
            return true;
        }
        return false;
    }
    
    static boolean venderAsiento(int[] arr, int posicion){
        if(arr[posicion-1]==-1){
            arr[posicion-1]=1;
            return true;
        }
        return false;
    }
    
    static void mostrarLado(int[] arr, String lado){
        System.out.println("Asientos del lado: "+lado);
        for(int i=0; i<arr.length; i++){
            System.out.printf("Asiento[%d] = %d%n",i+1,arr[i]);
        }
    }
    
    static boolean disponibilidad(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==-1){
                return true;
            }
        }
        return false;
    }
    
    static boolean disponibilidad(int[] arr, int cantidad){
        int contador=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==-1){
                contador++;
            }
        }
        return contador>=cantidad;
    }
    
    static void mostrarDistribucion(int[] izquierdo, int[] derecho){
        System.out.println(ANSI_GREEN  + "   IZQUIERDO"+"\t\t"+" DERECHO"+ANSI_RESET);
        for(int i=0; i<izquierdo.length; i++){
            System.out.printf("Asiento[%d]= %d   |   Asineto[%d]= %d%n",i+1,izquierdo[i],i+1,derecho[i]);
        }
    }
    static void menu(){
        System.out.println("\nMENU");
        System.out.println("1-Ver distribucion de asientos");
        System.out.println("2-Vender asientos");
        System.out.println("3-Devolver asiento");
        System.out.println("4-Caja");
        System.out.println("5-Salir");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        int[] izquierdo;
        int [] derecho;
        int filas,numeroAsiento,lado,asientos,asientos2,opcionMenu;
        double caja=0.0;
        boolean vendido=false;
        boolean devuelto=false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ingrese la cantidad de filas (6-10)");
            filas=scanner.nextInt();                  
        }while(filas<6 || filas>10);
        izquierdo=new int[filas];
        derecho= new int[filas];
        
        Arrays.fill(izquierdo, -1);
        Arrays.fill(derecho, -1);
        do{
            menu();
            opcionMenu=scanner.nextInt();
            switch(opcionMenu){
                case 1:
                    mostrarDistribucion(izquierdo, derecho);
                    System.out.println("----------------------------");
                    break;
                case 2:
                    if(disponibilidad(izquierdo) || disponibilidad(derecho)){
                        do{
                            System.out.println("-------------------------------");
                            System.out.println("Ingrese el lado del asiento 1-Izquierdo   2-Derecho");
                            lado=scanner.nextInt();
                        }while(lado< 1 || lado>2);
                        if(lado==1){
                            do{
                                System.out.println("-------------------------------");
                            System.out.println("Cuantos asientos desea comprar 1-Un asiento   2-Dos asientos");
                            asientos=scanner.nextInt();
                            }while(asientos< 1 || asientos>2);
                            if (disponibilidad(izquierdo, asientos)){
                                if(asientos==1){
                                    mostrarLado(izquierdo,"izquierdo");
                                    do{
                                        System.out.println("Ingrese el numero del asiento que desea comprar");
                                        numeroAsiento=scanner.nextInt();
                                    }while(numeroAsiento<1 || numeroAsiento>filas);
                                    
                                    vendido=venderAsiento(izquierdo, numeroAsiento);
                                    if(vendido){
                                        System.out.println("-------------------------------");
                                        System.out.println("Asiento vendido con exito");
                                        caja+=1.00;
                                    }else{
                                        System.out.println("-------------------------------");
                                        System.out.println("El asiento ya esta ocupado");
                                    }
                                }else{
                                    int primerAsiento;
                                    int segundoAsiento;
                                    mostrarLado(izquierdo,"izquierdo");
                                    do{
                                        System.out.println("Ingrese el numero del primer asiento que desea comprar");
                                        primerAsiento=scanner.nextInt();
                                    }while(primerAsiento<1 || primerAsiento>filas);
                                    do{
                                        System.out.println("Ingrese el numero del segundo asiento que desea comprar");
                                        segundoAsiento=scanner.nextInt();
                                    }while(segundoAsiento<1 || segundoAsiento>filas);
                                    if(venderAsiento(izquierdo,primerAsiento) && venderAsiento(izquierdo, segundoAsiento)){
                                        System.out.println("-------------------------------");
                                        System.out.println("Asientos vendidos con exito");
                                        caja+= 2.00;
                                    }else{
                                        System.out.println("-------------------------------");
                                        System.out.println("Uno o ambos asientos ya estan ocupados");    
                                    }      
                                }
                            }else{
                                System.out.println("-------------------------------");
                                System.out.println("No hay esa cantidad de asientos diponibles");
                            }        
                        }else if(lado==2){
                            do{
                                System.out.println("-------------------------------");
                            System.out.println("Cuantos asientos desea comprar 1-Un asiento   2-Dos asientos");
                            asientos2=scanner.nextInt();
                            }while(asientos2< 1 || asientos2>2);
                            if(asientos2==1){
                                mostrarLado(derecho,"derecho");
                                do{
                                    System.out.println("Ingrese el numero del asiento que desea comprar");
                                    numeroAsiento=scanner.nextInt();
                                }while(numeroAsiento<1 || numeroAsiento>filas);
                                vendido=venderAsiento(derecho, numeroAsiento);
                                
                                if(vendido){
                                    System.out.println("-------------------------------");
                                        System.out.println("Asiento vendido con exito");
                                        caja+=1.0;
                                    }else{
                                    System.out.println("-------------------------------");
                                        System.out.println("El asiento ya esta ocupado");
                                    }
                            }else{
                                int primerAsiento;
                                int segundoAsiento;
                                mostrarLado(derecho,"derecho");
                                do{
                                    System.out.println("-------------------------------");
                                   System.out.println("Ingrese el numero del primer asiento que desea comprar");
                                   primerAsiento=scanner.nextInt();
                                }while(primerAsiento<1 || primerAsiento>filas);
                                do{
                                   System.out.println("Ingrese el numero del segundo asiento que desea comprar");
                                  segundoAsiento=scanner.nextInt();
                                }while(segundoAsiento<1 || segundoAsiento>filas);
                                if(venderAsiento(derecho,primerAsiento) && venderAsiento(derecho, segundoAsiento)){
                                    System.out.println("-------------------------------");
                                   System.out.println("Asientos vendidos con exito");
                                    caja+= 2.0;
                               }else{
                                    System.out.println("-------------------------------");
                                    System.out.println("Uno o ambos asientos ya estan ocupados");                                       
                                }                                                              
                            }                           
                        }                              
                    }else{
                        System.out.println("-------------------------------");
                        System.out.println("No hay asientos disponibles");
                    }
                    break;
                case 3:
                    mostrarDistribucion(izquierdo, derecho);
                    do{
                        System.out.println("-------------------------------");
                        System.out.println("Ingrese el lado donde esta el asiento que desea devolver 1-Izquierdo   2-Derecho");
                        lado=scanner.nextInt();
                    }while(lado< 1 || lado>2);
                    if(lado==1){
                        mostrarLado(izquierdo,"izquierdo");
                        do{
                            System.out.println("-------------------------------");
                            System.out.println("Ingrese el numero del asiento que desea devolver");
                            numeroAsiento=scanner.nextInt();
                        }while(numeroAsiento<1 || numeroAsiento>filas);
                        devuelto=devolverAsiento(izquierdo, numeroAsiento);
                        if(devuelto){
                            System.out.println("-------------------------------");
                            System.out.println("Asiento devuelto con exito");
                            caja-=1.0;
                        }else{
                            System.out.println("-------------------------------");
                            System.out.println("EL asiento no ha sido comprado aun");
                        }
                    }else if(lado==2){
                        
                        mostrarLado(derecho,"derecho");
                        do{
                            System.out.println("-------------------------------");
                            System.out.println("Ingrese el numero del asiento que desea devolver");
                            numeroAsiento=scanner.nextInt();
                        }while(numeroAsiento<1 || numeroAsiento>filas);
                        devuelto=devolverAsiento(derecho, numeroAsiento);
                        if(devuelto){
                            System.out.println("-------------------------------");
                            System.out.println("Asiento devuelto con exito");
                            caja-=1.0;
                        }else{
                            System.out.println("-------------------------------");
                            System.out.println("EL asiento no ha sido comprado aun");
                        }
                        
                    }
                    
                    break;
                case 4:
                    System.out.println("La caja tiene $"+caja);
                    System.out.println("-----------------------");
                    break;
                case 5:
                    System.out.println("Que tenga un lindo dia");
                    break;
                default:
                    System.out.println("-------------------------------");
                    System.out.println("Opcion no valida");                           
            }
        }while(opcionMenu!=5);
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN  = "\u001B[32m";
}
