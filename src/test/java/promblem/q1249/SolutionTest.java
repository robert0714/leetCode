package promblem.q1249;

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
	public void testMinRemoveToMakeValid() {
		final Solution solution = new Solution();
		
//		String s01 = "lee(t(c)o)de)" ;
//		assertEquals("lee(t(c)o)de" , solution.minRemoveToMakeValid(s01));
//		
//		String s02 = "a)b(c)d" ;
//		assertEquals("ab(c)d" , solution.minRemoveToMakeValid(s02));
//		
//		String s03 = "))((" ;
//		assertEquals("" , solution.minRemoveToMakeValid(s03));
		
		
		String s04 = "(a(b(c)d)" ;
		assertEquals("a(b(c)d)" , solution.minRemoveToMakeValid(s04)); // not  "(a(bc)d)"  , nor  "(ab(c)d)"

		String s05 = "())()(((" ;
		assertEquals("()()" , solution.minRemoveToMakeValid(s05));
	}

}
