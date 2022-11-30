package promblem.q054;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

/***
 * https://leetcode.com/problems/spiral-matrix/description/
 * 
 * **/
public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		final List<Integer> result = new ArrayList<>();

		// Normal Case
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length - 1;
		int num = 1; // change

		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				result.add(matrix[rowStart][i]);
				num++; // change
			}
			rowStart++;

			for (int i = rowStart; i <= rowEnd; i++) {
				result.add(matrix[i][colEnd]);
				num++; // change
			}
			colEnd--;
			
			for (int i = colEnd; i >= colStart; i --) {
                if (rowStart <= rowEnd) {
                	result.add(matrix[rowEnd][i]);
    				num++; // change
                } 
            }
            rowEnd --;
            
            for (int i = rowEnd; i >= rowStart; i --) {
                if (colStart <= colEnd) {
                	result.add(matrix[i][colStart]);
    				num++; // change
                } 
            }
            colStart ++;
		}

		return result;
	}
}
