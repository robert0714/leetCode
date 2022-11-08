package promblem.q118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		int  numRows = 5;
		 
		List<List<Integer>> output = s.generate(numRows );
		showData(output);
//		Arrays.
//		System.out.println(Arrays.deepToString(output));
	}

	public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>>  result =new ArrayList<List<Integer>>();         
        for(int i =0 ; i< numRows ; ++i ){
            final List<Integer> row = new ArrayList<Integer>(i);
            for(int j = 0 ; j <= i ;++j){ 
            	row.add(getPasicalTriangleValue(i,j, result));
            }
            result.add(row);
        }         
        return result; 
    }
	public int getPasicalTriangleValue(int index, int position, final List<List<Integer>> pt) {
		if (index == 0 || index == 1 | position == 0) {
			return 1;
		}
		int value = 0;		 
		for (int i = 0; i < index; ++i) {
			List<Integer> row = pt.get(i);
			if(row.size() >= position) {
				value = row.get(position - 1) + value;
			}
		}
		return value;
	}
	
	public static void showData(final List<List<Integer>> output) {
//		System.out.print("[");;
		for(List<Integer> row : output) {
			System.out.print("[");
			for(int i =0 ; i <row.size();  ++i) {
				if(i ==0) {
					System.out.print("[");
				}
				System.out.print(row.get(i));
				System.out.print(",");
				if(i == (row.size()-1)) {
					System.out.print("]");
				}
			}			
			System.out.print("],");
		}
//		System.out.print("]");
	}

	
}
