package promblem.q290;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
	public void testWordPattern() {
		Solution s = new Solution();
		
		String pattern01 = "abba" ; 
		String s01 ="dog dog dog dog";		
		assertFalse(s.wordPattern(pattern01, s01));
		
		String pattern02 = "abba" ; 
		String s02 ="dog cat cat fish";		
		assertFalse(s.wordPattern(pattern02, s02));
		
		String pattern03 = "abba" ; 
		String s03 ="dog cat cat dog";		
		assertTrue(s.wordPattern(pattern03, s03));
		
	}

}
