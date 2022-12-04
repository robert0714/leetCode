package promblem.q560;

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

/***
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * **/
public class Solution {
	public int subarraySum(int[] nums, int needTobeQualifiedValue) {
		 
		return subarraySumV1(nums, needTobeQualifiedValue);
	}
	public int subarraySumV3(int[] nums, int needTobeQualifiedValue) {
		int n = nums.length;
		int count = 0;
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
//				return true; // find a number greater than both, index of left < index of right
			}
		}
		return count;
	}
	
	
	public int subarraySumV2(int[] nums, int needTobeQualifiedValue) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += nums[k];
				}
				count += (sum == needTobeQualifiedValue ? 1 : 0);
			}
		}
		return count;
	}

	public int subarraySumV1(int[] nums, int k) {
		int count = 0;
		List<Integer> list =new ArrayList<>();
		for (int i = 0; i < nums.length; ++i) {
			int others = k - nums[i];
			
			if(others==0) {
				count++;
			}
			if (i < (nums.length - 1) && others == nums[i + 1]) {
				count++;
			}

		}
		return count;
	}

}
