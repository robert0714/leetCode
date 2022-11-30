package promblem.q435;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
/****
 * https://leetcode.com/problems/non-overlapping-intervals/?envType=study-plan&id=data-structure-ii
 * https://www.youtube.com/watch?v=Gs7nngH1AEY&t=3s
 * *****/
public class Solution {
	public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> {
			if (a[0] != b[0]) {
				return a[0] - b[0];
			} else {
				return a[1] - b[1];
			}
		});
		int[] ref = intervals[0];
		int count = 0 ; 
		for (int i = 1; i < intervals.length; ++i) {
			int[] another = intervals[i];
			
			if (ref[1] > another[0]) {
				//If reference is in the 2nd sample's interval
				ref[1] = Math.min(ref[1], another[1]);
				count++;
			} else {
				//If reference is not in the 2nd sample's interval. we replace reference.
				ref = another;
			}
		}	
		return count ; 
		
		
//		final List<Target> targetList = analysis(intervals);
//		final Set<Double> record =new HashSet<>();
//		final List<Target> removedList =new ArrayList<>(); 
//		for(int i = 0 ; i< targetList.size() ; ++i) {
//			Target unit = targetList.get(i);
//			if(unit.overlapPosition.size()>1) {
//				removedList.add(unit);
//				targetList.remove(unit);
//				--i;
//			}else if(unit.overlapPosition.size() >= 1 && !record.add(unit.interval.get(0)) ){
//				removedList.add(unit);
//				targetList.remove(unit);
//				--i;
//			}
//		}
//		
//		
//		return removedList.size() ;
	}
	public List<Target> analysis(int[][] intervals){
		final List<Target> targetList = new ArrayList<>();
		for (int i = 0; i < intervals.length; ++i) {
			int[] interval = intervals[i];
			List<Double> subList = new ArrayList<>();
			for (double j = (interval[0] + 0.5); j < interval[1]; ++j) {
				subList.add(j);
			} 
			targetList.add(new Target(i, interval ,subList  ));
			 
		} 
		targetList.sort((x,y)->{
			if(isOverlap(x, y)) {
				x.overlapPosition.add(y.postion);
				y.overlapPosition.add(x.postion);
			}
			return y.interval.size() - x.interval.size();
		});
		return targetList;
	}
	static boolean isOverlap(Target t1, Target t2) {
		if (t1.interval.size() > t2.interval.size()) {
			for(int i = 0 ; i < t2.interval.size() ; i++){
				if(t1.interval.contains(t2.interval.get(i))) {
					return true;
				}
			}
		} else {
			for(int i = 0 ; i < t1.interval.size() ; i++){
				if(t2.interval.contains(t1.interval.get(i))) {
					return true;
				}
			}
		}
		return false;
	}
	static class Target{
		int postion;
		int[] originalData;
		List<Double> interval;
		List<Integer> overlapPosition =new ArrayList<>();
		public Target(int postion, int[] originalData, List<Double> interval ) {
			super();
			this.postion = postion;
			this.originalData = originalData;
			this.interval = interval; 
		}
		
	}
}
