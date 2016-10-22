package is.ru.TicTacToe

public class TicTacToe {
	
	public static int ROWS = 3;
	public static int COLS = 3;
	private int[][] grid = new grid[ROWS][COLS];
	public boolean winner = false;
	public static int player1 = 0;
	public static int player2 = 1;

	public static void printGrid() {
		for (int i = 0;i < 3;i++ ) {
			for (int j = 0;j < 3;j++ ) {
				System.out.printGrid[i][j];
			}
			System.out.println();
		}
	}

	public void resetGrid(){
		for (int i = 0;i < 3; i++) {
			for (int j = 0;j < 3; j++) {
				grid[i][j];
			}
		}
	}

	private int grid [][];


	
	

}