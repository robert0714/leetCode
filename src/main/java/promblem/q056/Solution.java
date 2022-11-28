package promblem.q056;

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
	public int[][] merge(int[][] intervals) {
		intervals = order(intervals);
		final List<Integer[]> tmp = new ArrayList<>(intervals.length);
		for (int number1 = 0; number1 < intervals.length; number1++) {
			int number2 = number1 + 1;
			if (number1 > 0 && intervals[number1] == intervals[number1 - 1]) {
				continue;
			}
			if (number2 == intervals.length) {
				tmp.add(new Integer[] { intervals[number1][0], intervals[number1][1] });
				continue;
			}
			boolean need2Merge = intervals[number2][0] <= intervals[number1][1];

			if (!need2Merge) {
				tmp.add(new Integer[] { intervals[number1][0], intervals[number1][1] });
				continue;
			}

			int min = Math.min(intervals[number1][0], intervals[number2][0]);
			int max = Math.max(intervals[number1][1], intervals[number2][1]);

//			tmp.add(new Integer[] { min, max });
//			number1++;
			intervals[number2][0]=min;
			intervals[number2][1]=max;
//			number1--;

		}
		final int[][] result = new int[tmp.size()][2];
		for (int i = 0; i < tmp.size(); ++i) {
			result[i] = new int[] { tmp.get(i)[0], tmp.get(i)[1] };
		}
		return result;
	}
	public int[][] order(int[][] intervals){
		final List<Integer[]> tmp = new ArrayList<>(intervals.length);
		for (int i = 0; i < intervals.length; i++) {
			tmp.add(new Integer[] {intervals[i][0] , intervals[i][1]});			
		}
				
		tmp.sort(  (x,y) ->{
			return x[0] - y[0] ;
		});
		for (int i = 0; i < intervals.length; i++) {
			intervals[i]  =new int[] {tmp.get(i)[0] ,tmp.get(i)[1]  } ; 		
		}
		return intervals ;
	} 
}