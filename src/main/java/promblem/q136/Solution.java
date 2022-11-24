package promblem.q136;

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
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.DelayQueue;

class Solution {
	public int singleNumber(int[] nums) {
		 
        return singleNumberV2(nums);
	}
	 
	
	public int singleNumberV2(int[] nums) {
		final HashMap<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
        	int count = map.getOrDefault(nums[i], 0);
        	map.put(nums[i],count + 1);
        }
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value.intValue() == 1) {
                return key;
            }
        }
        return -1;
	}
	public int singleNumberV1(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		final Deque<Integer> queue = new LinkedList<>(); 
		for (int i = 0; i < nums.length; ++i) {
			if (queue.contains(nums[i])) {
				queue.remove(nums[i]);
			} else {
				queue.add(nums[i]);
			}
		}
		return queue.peek();
	}
}
