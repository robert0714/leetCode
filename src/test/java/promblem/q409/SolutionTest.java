package promblem.q409;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	public void testLongestPalindrome() {
		Solution s =new Solution();
		
		int result01 = s.longestPalindrome("abccccdd");
		assertEquals(7, result01);
		
		int result02 = s.longestPalindrome("ccc");
		assertEquals(3, result02);
	}

}
