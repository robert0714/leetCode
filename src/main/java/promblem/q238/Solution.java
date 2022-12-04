package promblem.q238;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
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

import common.model.TreeNode;

/****
 * 238. Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan&id=data-structure-ii
 **/
public class Solution {
	public int[] productExceptSelf(int[] nums) {

		return productExceptSelfV3(nums);
	}

	public int[] productExceptSelfV3(int[] nums) {
		int[] result = new int[nums.length];
		int data = 1;
		boolean hasZero =false;
		int zeroCount = 0; 
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] == 0) {
				hasZero = true;
				zeroCount++;
				continue;
			}
			data = nums[i] * data;
		}
		for (int i = 0; i < nums.length; ++i) {
			if(!hasZero) {
				result[i] = (data / nums[i]);
			}else {
				if(nums[i] == 0 && zeroCount==1) {
					result[i] =  data ;
				}else if(nums[i] == 0 && zeroCount >1) {
					result[i] =  0 ;
				}else {
					result[i] =  0 ;
				}
				
			}
			
		}
		return result;
	}
 

	public int[] productExceptSelfV1(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; ++i) {
			int data = 1;
			for (int j = 0; j < nums.length; ++j) {
				if (i == j) {
					continue;
				}
				data = nums[j] * data;
			}
			result[i] = data;
		}
		return result;
	}
}