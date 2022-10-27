package promblem.q876;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;


class Solution {
	public static void main(String[] args) {
		
		
		Solution s =new Solution();
		int[] nums ={-2,1,-3,4,-1,2,1,-5,4} ;
		int max= s.maxSubArrayV2(nums);
		System.out.println(max);
		
	}
	 public int maxSubArrayV2(int[] nums) {
	        int max = nums[0];
	        int result = max;  
	        
	        for (int i = 1; i < nums.length; ++i) {
	            if (max>0){ //如果之前的和是正数，还可以往后加一加，观望一下
	                max = max+nums[i];
	            }else{ //如果之前的和是负数，还不如不加，从头开始
	                max=nums[i];
	            }
	             
	            result = Math.max(result, max);	             
	        }
	        return result;
	    }
	// O(n), Kadane's  Algorimth
	public int maxSubArray(int[] nums) {
		int sum = detect(nums);
		if (sum < 0)
			return sum;
		int max = nums[0];
		for (int i = 0; i < nums.length; ++i) {
			sum += nums[i];
			sum = Math.max(0, sum);//計算以該點數值為結束點的子數列的最大和（正數和）
			max = Math.max(sum, max);//計算以該點數值為結束點的子數列的最大和（正數和）
		}
		return max;
	}
	

    // 測試是否全為負數，是的話回傳最大的負數，否則回傳0
    private static int detect(int[] array)
    {
        int max = array[0];
        for (int i = 0; i < array.length; ++i)
        {
            if (array[i] >= 0)
                return 0;
            max = Math.max(array[i], max);
        }
        return max;
    }
}
 
 