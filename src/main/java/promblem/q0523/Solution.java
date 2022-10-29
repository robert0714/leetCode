package promblem.q0523;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[] {23,2,4,6,6 };
		int p = 7;

		System.out.println(s.checkSubarraySum(nums, p));

	}

	public boolean checkSubarraySum(int[] nums, int k) {

		for (int i = 0; i < nums.length; i++) {
			int subArrayAmount = 0 ;
			for (int j = i; j < nums.length; j++) {				 
				subArrayAmount= subArrayAmount+ nums[j];
			}
			if(subArrayAmount %k ==0) {
				return true;
			}
		}
		return false;
	}
	public int sumary(int[] nums) {
		int total =0 ;
		for(int val :nums) {
			total= total + val ;
		}
		return total;
	}
}
