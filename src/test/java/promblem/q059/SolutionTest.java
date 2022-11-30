package promblem.q059;

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
	public void testGenerateMatrix() {
		Solution s = new Solution();
		
		int[][] matrix1 = s.generateMatrix(3);
		print(matrix1);
		
		
		
		int[][] matrix2 = s.generateMatrix(2);
		print(matrix2);
		
		int[][] matrix4 = s.generateMatrix(4);
		print(matrix4);
	}

	private void print(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j]);
				System.out.print(" |  ");

			}
			System.out.println();
		}
		System.out.println("----------------------------");
	}
}
