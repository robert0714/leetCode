package promblem.q119;

import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List;
import java.util.Map; 
/***
 *  Pascal's Triangle II
 * 
 * **/
class Solution {
	public List<Integer> getRow(int rowIndex) {

		return getRowV2(rowIndex);
	}
	
	private Map<String, Integer> cache = new HashMap<>();

	String compositeKey(int row, int colume) {
		return row + "," + colume;
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
		final String key = compositeKey(row, colume);
		Integer result = cache.get(key);
		if (result == null) {
			int former = getValueFromPosition(row - 1, colume - 1);
			int latter = getValueFromPosition(row - 1, colume);
			result = former + latter;
			this.cache.put(key, result);
		}

		return result;
	}

	public List<Integer> getRowV2(int rowIndex) {
		List<Integer> row = new ArrayList<>();
		double ncr = 1.0;
		for (int i = 0; i <= rowIndex; i++) {
			row.add((int) ncr);
			ncr = (ncr * (rowIndex - i)) / (i + 1);
		}
		return row;
		// List<List<Integer>> l = generate(rowIndex+1);
		// return l.get(rowIndex);
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> b = new ArrayList<>();
		List<Integer> a = new ArrayList<>();
		a.add(1);
		b.add(a);
		if (numRows == 1) {
			return b;
		}
		List<Integer> c = new ArrayList<>();
		c.add(1);
		c.add(1);
		b.add(c);
		if (numRows == 2) {
			return b;
		}
		for (int i = 3; i <= numRows; i++) {
			List<Integer> d = new ArrayList<>();
			d.add(1);
			List<Integer> e = b.get(i - 2);
			for (int j = 0; j < e.size() - 1; j++)
				d.add(e.get(j) + e.get(j + 1));
			d.add(1);
			b.add(d);
		}
		return b;
	}
}
