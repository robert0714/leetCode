package promblem.q187;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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
	public void testFindRepeatedDnaSequences() {
		Solution s = new Solution();
		
		final List<String> list01 = s.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		assertEquals(2, list01.size());
		assertEquals("AAAAACCCCC", list01.get(0));
		assertEquals("CCCCCAAAAA", list01.get(1));
		
		final List<String> list02 = s.findRepeatedDnaSequences("AAAAAAAAAAAAA");
		assertEquals(1, list02.size());
		assertEquals("AAAAAAAAAA", list02.get(0)); 
	}

}
