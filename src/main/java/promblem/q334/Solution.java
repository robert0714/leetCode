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
		List<Integer> list = new ArrayList<>(5);
		list.add(ref);
 
		for (int i = 1; i < nums.length; ++i) {
			final int another = nums[i];
			if (Math.max(another, ref) > ref) {
				list.add(another);
				for (int k = i + 1; k < nums.length; k++) {
					int thirdNum = nums[k];
					if (thirdNum > another) {
						list.add(thirdNum);
						return true ;
					}
				}
				list.remove(1);

			} else {
				int count =0 ; 
				for(int qulified = i ; qulified <nums.length; ++qulified) {
					final int qulifiedValue = nums[qulified];
					if (another < qulifiedValue) {
						count++;
					}
				}
				if (another < list.get(0) && count > 0) {
					list = new ArrayList<>(5);
					list.add(another);
				}
				

			}
			ref = another;
		}

		return false;
	}
}
