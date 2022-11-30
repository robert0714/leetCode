package promblem.q435;

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
	public void testEraseOverlapIntervals() {
		Solution s = new Solution();
		
		int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}} ;
		int result1 = s.eraseOverlapIntervals(intervals1) ;		
		assertEquals(1, result1);
		
		
		int[][] intervals2 = {{1,2},{1,2},{1,2}} ;
		int result2 = s.eraseOverlapIntervals(intervals2) ;		
		assertEquals(2, result2);
		
		int[][] intervals3 = {{1,2} ,{2,3}} ;
		int result3 = s.eraseOverlapIntervals(intervals3) ;		
		assertEquals(0, result3);
		
		int[][] intervals4 = { { 1, 100 }, { 11, 22 }, { 1, 11 }, { 2, 12 } };
		int result4 = s.eraseOverlapIntervals(intervals4);
		assertEquals(2, result4);
	}

}
