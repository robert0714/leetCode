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
		int n = nums.length;
		if (n < 3) {
			return false;
		}
		int left = Integer.MAX_VALUE;
		int right = Integer.MAX_VALUE;

		// loop invariant: left < right
		for (int num : nums) {
			if (num <= left) {
				left = num; // find the minimum in arrays
			} else if (num <= right) { // num >= left
				right = num; // find the maximum in arrays
			} else {
				// find the number great than minimum , less than maximum in arrays
				return true; // find a number greater than both, index of left < index of right
			}
		}

		return false;
	}

	public boolean increasingTripletV1(int[] nums) {
		final Set<Integer> set = new HashSet<>();
		for (int v : nums) {
			set.add(v);
		}
		if (nums.length < 3 || set.size() < 3) {
			return false;
		}
		int ref = nums[0];

		final List<Integer> list = new ArrayList<>(3);
		list.add(ref);

		int sencondRef = 1;
		for (int i = 1; i < nums.length; ++i) {
			int another = nums[i];
			sencondRef = i;
			if (Math.max(another, ref) > ref) {
				list.add(another);
				for (int k = i + 1; k < nums.length; k++) {
					int thirdNum = nums[k];
					if (thirdNum > another) {
						list.add(thirdNum);
						return true;
					} else if (thirdNum < another && thirdNum > ref) {
						// reset the second number start point
						list.remove(1);
						another = thirdNum;
						list.add(another);

						// the second number uses next candidate
						i = k;
						continue;
					}
				}
			}
			// reset the first number, second number start point
			ref = nums[sencondRef];

			// because the second number pointer could be lost
			i = sencondRef;

			list.clear();
			list.add(ref);
		}

		return false;
	}
}
