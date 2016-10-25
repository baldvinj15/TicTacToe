package is.ru.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

public static final int SIZE = 3;
static char player = 'X';
public static char board[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

	public static void displayboard(){
	    for (int i = 0; i < SIZE; i++){
	    	System.out.print("| ");
	        for (int j = 0; j < SIZE; j++){
	        	System.out.print(board[i][j] + " | ");
	        }
	        System.out.println();
	        System.out.println("-------------");
	    }
	}
	public static char togglePlayer(){
	    if (player == 'X')
	        return player = 'O';
	    else
	        return player = 'X';
	}


	public static boolean makeMove(int input){
		System.out.print(player + " position: ");
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
}