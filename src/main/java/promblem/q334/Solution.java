package promblem.q334;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

class Solution {
	public boolean increasingTriplet(int[] nums) {
		if (nums.length < 3)
			return false;
		int ref = nums[0];
		int count = 0;
		List<Integer> list = new ArrayList<>();
//		Map<Integer , List<Integer> > record = new HashMap<>();
		list.add(ref);
//		record.getOrDefault(ref, list);
		for (int i = 1; i < nums.length; ++i) {
			int another = nums[i];
			if (Math.max(another, ref) > ref) {
				 count++;
//				List<Integer> sublist = record.getOrDefault(ref, new ArrayList<>());
//				sublist.add(another);
//				record.put(null, sublist);
				 list.add(another);
			} else {
				if(count >0) {
					list = new ArrayList<>();
				}				
				
			}
			ref = another;
			if (list.size() == 3) {
				return true;
			}
			;
		}
		return false;
	}
}
