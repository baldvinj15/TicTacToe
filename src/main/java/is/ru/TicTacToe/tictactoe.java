package is.ru.TicTacToe;

public class tictactoe {
	
	public static final int ROWS = 3;
	public static final int COLS = 3;
	private static int[][] grid = new int[ROWS][COLS];
	public boolean winner = false;
	public static int player1 = 0;
	public static int player2 = 1;


	public static void printGrid() {
		for(int i = 0; i < ROWS; i++){
			System.out.print("| ");
			for(int j = 0; j < COLS; j++){				
				System.out.print(grid[i][j] + " | ");
				
			}
			System.out.println();
			System.out.println("-------------");
		}

	}

	
}