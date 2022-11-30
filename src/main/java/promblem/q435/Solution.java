package promblem.q435;

import java.util.ArrayList;
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
 * *****/
public class Solution {
	public int eraseOverlapIntervals(int[][] intervals) {
		int result = 0;
		Map<Double,Integer> valuePositionMap =new HashMap<>();
		
		Set<Double> record =new HashSet<>();
		Set<Integer> position =new HashSet<>();
//		List<List<Double>> list = new ArrayList<>();
		final List<Target> targetList = new ArrayList<>();
		for (int i = 0; i < intervals.length; ++i) {
			int[] interval = intervals[i];
			List<Double> subList = new ArrayList<>();
			for (double j = (interval[0] + 0.5); j < interval[1]; ++j) {
				valuePositionMap.put(j, i);
				if(!record.add(j)) {
					result++;
					position.add(i);
				}
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
		int amount =0 ;
		for(Target unit :targetList ) {
			if(unit.overlapPosition.size()>1) {
				amount++;
			}
		}
//		return position.size();
		return amount ;
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
