package promblem.q169;

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
		int[] nums1 = { 3, 2, 3 };
		int result1 = s.majorityElement(nums1);
		assertEquals(3, result1);

		int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
		int result2 = s.majorityElement(nums2);
		assertEquals(2, result2);
	}

}
