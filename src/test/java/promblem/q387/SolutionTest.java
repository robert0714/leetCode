package promblem.q387;

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
	public void testFirstUniqChar() {
		Solution s =new Solution();
		
		int ver0 = s.firstUniqChar("leetcode");
		assertEquals(0, ver0);
		
		int ver1 = s.firstUniqChar("loveleetcode");
		assertEquals(2, ver1);
		
		int ver2 = s.firstUniqChar("aabb");
		assertEquals(-1, ver2);
	}

}
