package promblem.q056;

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
	public void testMerge() {
		Solution s = new Solution();

		int[][] intervals = new int[][] { new int[] { 1, 3 }, new int[] { 2, 6 }, new int[] { 8, 10 },
				new int[] { 15, 18 } };
		int[][] result01 = s.merge(intervals);
		System.out.println(result01);

//		int[][] intervals2 = new int[][] { new int[] { 1, 4 }, new int[] { 4, 5 } };
//		int[][] result02 = s.merge(intervals2);
//		System.out.println(result02);
		
		int[][] intervals3 = new int[][] { new int[] { 1, 4 }, new int[] { 0, 0 } };
		int[][] result03 = s.merge(intervals3);
		System.out.println(result03);
	}

}
