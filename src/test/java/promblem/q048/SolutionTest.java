package promblem.q048;

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
	public void testRotate() {
		Solution s = new Solution();

		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print(matrix);
		s.rotate(matrix);
		System.out.println( "--------------------------------------------"  );
		print(matrix);
	}

	private void print(int[][] matrix) {
		 int n = matrix.length;
		for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                 
            	System.out.print( matrix[i][j]  );
            	System.out.print( " |  "  );
                 
            }
        	System.out.println( );
        }
		
	}
}
