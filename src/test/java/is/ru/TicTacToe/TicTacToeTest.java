package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {


	@Test
	public void	testResetBoard() { 
		assertTrue(TicTacToe.resetBoard());
	}

	@Test
	public void testTogglePlayer() {
		assertEquals('O', TicTacToe.togglePlayer());
	}

	@Test
	public void testTogglePlayerO() {
		TicTacToe.togglePlayer();
		assertEquals('X', TicTacToe.togglePlayer());
	}

	@Test
	public void testMakeMoveOne() {
		assertTrue(TicTacToe.makeMove(1));
	}

	@Test
	public void testMakeMoveSix() {
		assertTrue(TicTacToe.makeMove(6));
	}

	@Test
	public void testMakeMoveNine() {
		assertTrue(TicTacToe.makeMove(9));
	}

	@Test
	public void testMakeMoveTen() {
		assertFalse(TicTacToe.makeMove(10));
	}

	@Test
	public void testMakeMoveZero() {
		assertFalse(TicTacToe.makeMove(0));
	}

	@Test
	public void testWinnerX() {

		TicTacToe.makeMove(1);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(2);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(4);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(5);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(7);
		assertEquals('X', TicTacToe.winner());
		TicTacToe.resetBoard();
	}

	@Test
	public void testWinnerO() {
		TicTacToe.makeMove(2);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(1);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(4);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(5);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(7);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(9);
		assertEquals('O', TicTacToe.winner());
		TicTacToe.resetBoard();
	}

	@Test
	public void testIsFull() {
		TicTacToe.resetBoard();
		TicTacToe.makeMove(1);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(2);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(3);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(5);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(4);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(7);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(8);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(6);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(9);
		assertTrue(TicTacToe.isFull());
		TicTacToe.resetBoard();
	}
	
	@Test
	public void testIsNotFull() {
		TicTacToe.resetBoard();
		TicTacToe.makeMove(1);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(2);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(3);
		TicTacToe.togglePlayer();
		TicTacToe.makeMove(5);
		assertFalse(TicTacToe.isFull());
		TicTacToe.resetBoard();
	}
}

