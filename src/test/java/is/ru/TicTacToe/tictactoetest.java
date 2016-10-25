package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testTogglePlayer() {
		assertEquals('O', TicTacToe.togglePlayer());
	}

	@Test
	public void testMakeMove() {
		assertTrue(TicTacToe.makeMove(1));
	}


}

