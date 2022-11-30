package promblem.q074;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
	public void testSearchMatrix() {
		final Solution s = new Solution();
		
//		int[][] matrix01 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };		
//		boolean result01 = s.searchMatrix(matrix01, 3);
//		assertTrue(result01 );
		
		int[][] matrix02 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };		
		boolean result02 = s.searchMatrix(matrix02, 13);
		assertFalse(result02 );
		
	}

}
