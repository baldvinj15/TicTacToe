package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testTogglePlayer() {
		assertEquals('O', TicTacToe.togglePlayer());
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

}

