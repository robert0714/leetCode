package promblem.q238;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
	public void testProductExceptSelf() {
		Solution s = new Solution();

		int[] nums1 = { 1, 2, 3, 4 };
		int[] result01 = s.productExceptSelf(nums1);
		int[] epected = { 24, 12, 8, 6 };
		assertArrayEquals(epected, result01);
		
		
		int[] nums2 = { -1,1,0,-3,3 };
		int[] result02 = s.productExceptSelf(nums2);
		int[] epected2 = {0,0,9,0,0};
		assertArrayEquals(epected2, result02);
		
		int[] nums3 = {  0,0 };
		int[] result03 = s.productExceptSelf(nums3);
		int[] epected3 = {0,0 };
		assertArrayEquals(epected3, result03);
	}

}
