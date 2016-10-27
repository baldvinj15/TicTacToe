package is.ru.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

public static final int SIZE = 3;
static char player = 'X';
public static char board[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

	public static void displayBoard(){
	    for (int i = 0; i < SIZE; i++){
	    	System.out.print("| ");
	        for (int j = 0; j < SIZE; j++){
	        	System.out.print(board[i][j] + " | ");
	        }
	        System.out.println();
	        System.out.println("-------------");
	    }
	}

	public static boolean resetBoard(){
	board[0][0] = '1';
	board[0][1] = '2';
	board[0][2] = '3';
	board[1][0] = '4';
	board[1][1] = '5';
	board[1][2] = '6';
	board[2][0] = '7';
	board[2][1] = '8';
	board[2][2] = '9';
	player = 'X';
	return true;
	
}
	public static char togglePlayer(){
	    if (player == 'X')
	        return player = 'O';
	    else
	        return player = 'X';
	}


	public static boolean makeMove(int input){
	    int count = 1;
	    for(int i = 0; i < SIZE; i++) {
	    	for(int j = 0; j < SIZE; j++) {
	    		if(input == count) {
	    			 board[i][j] = player;
	    			 return true;
	    		}
	    		count++;
	    	}
	    }
	    return false;
	}

    public static char winner(){
    if (board[0][0] == player && board[0][1] == player && board[0][2] == player)
        return player;
    if (board[0][0] == player && board[1][0] == player && board[2][0] == player)
        return player;
    if (board[0][1] == player && board[1][1] == player && board[2][1] == player)
        return player;
    if (board[0][2] == player && board[1][2] == player && board[2][2] == player)
        return player;
    if (board[1][0] == player && board[1][1] == player && board[1][2] == player)
        return player;
    if (board[2][0] == player && board[2][1] == player && board[2][2] == player)
        return player;
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        return player;
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        return player;
    else
        return '/';
    }

    public static void main(String[] args){
    
	    int input = 0;
	    
	    displayBoard();
	    while(true){
	       Scanner in = new Scanner(System.in);
	       if(in.hasNext())
	       input = in.nextInt();
	       makeMove(input);
	       displayBoard();

	       if (winner() == 'X'){
	           System.out.print("Player X has won!");
	           break;
	           }

	        if (winner() == 'O'){
	    	   System.out.print("Player O has won!");
	           break;
	       }
           
	       togglePlayer();
	    }
    
	}
}