package promblem.q119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.DelayQueue;

class Solution {
	public List<Integer> getRow(int rowIndex) {

		return getRowV1(rowIndex);
	}

	public List<Integer> getRowV1(int rowIndex) {

		final List<Integer> result = new ArrayList<>(rowIndex + 1);

		for (int i = 0; i < rowIndex + 1; ++i) {
			result.add(getValueFromPosition(rowIndex, i));
		}

		return result;
	}

	public int getValueFromPosition(int row, int colume) {
		if (row < 0 || colume < 0 || colume > row) {
			return 0;
		}
		if (row == colume || colume == 0 || row == 0) {
			return 1;
		}
		if (row > 1 && colume == 1 || ((row - colume) == 1)) {
			int formmer = row;
			return formmer;
		}

		 
		int former = getValueFromPosition(row - 1, colume - 1);
		int latter = getValueFromPosition(row - 1, colume);
		return former + latter;
	}

}
