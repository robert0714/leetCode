package promblem.q074;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import java.util.Stack;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean flag = false;
		// search in all valid rows
		for (int row = 0; row < matrix.length; row++) {
			int min = matrix[row][0];
			int max = matrix[row][matrix[0].length - 1];

			if (min <= target && target <= max) {
				flag = flag || find(matrix, target, row);
				if (flag) {
					return flag;
				}
			}
		}

		return flag;
	}

	// binary search
	public boolean find(int[][] matrix, int target, int row) {
		int left = 0;
		int right = matrix[0].length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (matrix[row][mid] == target) {
				return true;
			} else if (matrix[row][mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}
}