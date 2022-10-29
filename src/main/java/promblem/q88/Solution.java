package promblem.q88;

import java.util.ArrayList;
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
	public static void main(String[] args) {
		Solution s = new Solution();
		 PriorityQueue<Integer> sorted = new PriorityQueue<Integer>();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		int[] nums = s.merge(nums1, m, nums2, n);
		for (int val : nums) {
			System.out.println(val);
		}
	}

	public int[] merge(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list1 = reserve(nums1, m);
		List<Integer> list2 = reserve(nums2, n);
		List<Integer> result = new ArrayList(m + n);
		result.addAll(list1);
		result.addAll(list2);
		Collections.sort(result);

		int[] nums = new int[result.size()];
		for (int i = 0; i < result.size(); ++i) {
			nums[i] = result.get(i).intValue();
			 nums1[i] = nums[i] ; 
		}
		return nums;

	}

	private List<Integer> reserve(int[] nums1, int m) {
		List<Integer> result = new ArrayList<Integer>(nums1.length);
		int count =1;
		for (int val : nums1) {
			if(count > m)
				break;
			result.add(val);
			count++;
		}
		return result;
	}

}
