package promblem.q048;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

class Solution {
	public void rotate(int[][] matrix) {
		int n = matrix.length;

		int temp;
		
//		Step1: Take the transpose of matrix.
//		(convert the Rows into Columns)
		for (int i = 0; i < n; i++) {
			// diagonal exchange
			for (int j = 0; j < i; j++) {

				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		//Step2: Reverse each row
		//By following these steps you will get the final solution!!!
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - j - 1];
				matrix[i][n - j - 1] = temp;
			}
		}

	}

}
