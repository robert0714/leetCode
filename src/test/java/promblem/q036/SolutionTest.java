package promblem.q036;

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
	public void testIsValidSudoku() {
		Solution s = new Solution();
		final char[][] board0 = 
			{{'5','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		
		
		final char[][] board1 = 
			{{'8','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		
		final char[][] board2 = 
			{{'.','.','4','.','.','.','6','3','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'5','.','.','.','.','.','.','9','.'}
			,{'.','.','.','5','6','.','.','.','.'}
			,{'4','.','3','.','.','.','.','.','1'}
			,{'.','.','.','7','.','.','.','.','.'}
			,{'.','.','.','5','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}};
		
		
		boolean result = s.isValidSudoku(board0);

		System.out.println("result: " + result);
	}

}
