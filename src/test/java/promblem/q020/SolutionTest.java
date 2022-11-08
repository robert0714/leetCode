package promblem.q020;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testIsValid() {
		Solution s = new Solution();
		String  data = "({})" ;
		boolean result = s.isValid(data) ; 
		System.out.println(result);
		assertTrue(result);
	}

}
