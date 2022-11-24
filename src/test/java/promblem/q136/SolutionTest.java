package promblem.q136;

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
	public void testSingleNumber() {
		Solution s = new Solution();
		int[] nums1 = { 2, 2, 1 };
		int result1 = s.singleNumber(nums1);
		assertEquals(1, result1);

		

	}

}
