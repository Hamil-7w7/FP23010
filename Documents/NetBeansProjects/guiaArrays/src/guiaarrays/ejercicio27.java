
/*Desarrollarás un programa para implementar el juego de Tic Tac Toe, también conocido
como Tres en Línea, para dos jugadores. El programa permitirá a los jugadores realizar
movimientos en un tablero y verificar si hay un ganador o si el juego termina en empate.*/

package guiaarrays;
import java.util.Scanner;
public class ejercicio27 {
    public static void main(String[] args) {          
        initBoard(board);
        System.out.println("Bienvenido al juego Tic Tac Toe");
        printBoard(board);
        while (!gameOver){
            System.out.print("Jugador "+player+"\nIngrese la fila: ");
            int row=scanner.nextInt()-1;
            System.out.print("\nIngrese la columna: ");
            int column=scanner.nextInt()-1;
            if(isValidMove(board,row,column)){
                board[row][column]=player;
                winnerPlayer=winner(board);
                if(winnerPlayer!=' '){
                    gameOver=true;
                } else if (isBoardFull(board)){
                    gameOver=true;
                }
                printBoard(board);
                player=player=='X' ? 'O' : 'X';
            }else{
                System.out.println(ANSI_RED+"Movimiento no valido"+ANSI_RESET);
                continue;
            }
        }
        if(winnerPlayer!=' '){
            System.out.println("El ganador es el jugador "+winnerPlayer);
        }else{
            System.out.println("Empate");
        }
    }
    static char winner(char[][] board){
        for(int row = 0; row<board.length; row++){
            if (board[row][0]!=' ' && board[row][0]==board[row][1] && board[row][1]==board[row][2]){
                return board[row][0];
            }
        }
        for(int column = 0; column<board.length; column++){
            if (board[0][column]!= ' ' && board[0][column]==board[1][column] && board[1][column]==board[2][column]){
                return board[0][column];
            }
        }   
        if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]){
            return board[0][0];
        }
        if(board[2][0]!=' ' && board[2][0]==board[1][1] && board[1][1]==board[0][2]){
            return board[2][0];
        }
        return ' ';
    }     
    static boolean isValidMove(char[][] board, int row, int column){
        if (row>=0 && row<=2 && column>=0 && column<=2){
            return board[row][column]==' ';
        }
        return false;
    }       
    static boolean isBoardFull(char[][] board){
        for (int row=0; row<board.length; row++){
            for (int column = 0; column < board.length; column++){
                if (board[row][column]==' '){
                    return false;
                }
            }
        }
        return true;
    }   
    static void initBoard(char[][] board) {
        for(int row=0; row<board.length; row++) {
            for(int column=0; column<board.length; column++) {
                board[row][column]=' ';
            }
        }
    }   
    static void printBoard(char[][] board){
        System.out.println(" ");
        System.out.println(ANSI_RED + "    1 \t2   3"+ANSI_RESET);
        System.out.println("  -------------");
        for(int row=0; row<board.length; row++){
            System.out.print(ANSI_RED+(row+1)+ANSI_RESET);
            for(int column=0; column<board.length; column++){
                System.out.print(" | "+board[row][column]);
            }
            System.out.println(" |");
            System.out.println("  -------------");
        }
    }   
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";
    static char[][] board = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    static char player = 'X';
    static boolean gameOver = false;
    static char winnerPlayer = ' ';
}