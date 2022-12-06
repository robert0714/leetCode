package promblem.q005;

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
		Solution s= new Solution();
		
//		assertEquals("bab", s.longestPalindrome("babad"));
//		assertEquals("bb", s.longestPalindrome("cbbd"));
//		assertEquals("a", s.longestPalindrome("a"));
//		assertEquals("ac", s.longestPalindrome("a"));
		assertEquals("aca", s.longestPalindrome("aacabdkacaa"));
	}

}
