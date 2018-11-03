package psr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToolUnitTest {

	@Test
	void test() {
		Rock r = new Rock(15);
		Scissors s = new Scissors(5);
		Paper p = new Paper(7);
		
		Assertions.assertFalse(s.fight(r));
		Assertions.assertTrue(s.fight(p));
	}

}
