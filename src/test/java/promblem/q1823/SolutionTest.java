package promblem.q1823;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
	Solution solution =  null;

	@BeforeEach
	protected void setUp() throws Exception {
		solution = new Solution() ;
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testFindTheWinner() {
		assertEquals(3, solution.findTheWinner(5, 2));
		assertEquals(1, solution.findTheWinner(6, 5));
	}

}
