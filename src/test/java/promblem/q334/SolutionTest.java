package promblem.q334;

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
	public void testIncreasingTriplet() {
		Solution s = new Solution();

//		int[] nums01 = { 1, 2, 3, 4, 5 };
//		boolean result01 = s.increasingTriplet(nums01);
//		assertTrue(result01);
//
//		int[] nums02 = { 5, 4, 3, 2, 1 };
//		boolean result02 = s.increasingTriplet(nums02);
//		assertFalse(result02);
//
//		int[] nums03 = { 2, 1, 5, 0, 4, 6 };
//		boolean result03 = s.increasingTriplet(nums03);
//		assertTrue(result03);
//
//		int[] nums04 = { 20, 100, 10, 12, 5, 13 };
//		boolean result04 = s.increasingTriplet(nums04);
//		assertTrue(result04);
//
//		int[] nums05 = { 6, 7, 1, 2 };
//		boolean result05 = s.increasingTriplet(nums05);
//		assertFalse(result05);

		int[] nums06 = { 1, 5, 0, 4, 1, 3 };
		boolean result06 = s.increasingTriplet(nums06);
		assertTrue(result06);
		
		int[] nums07 = {1,6,2,5,1};
		boolean result07 = s.increasingTriplet(nums07);
		assertTrue(result07);
	}

}
