package promblem.q169;

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
	public int majorityElementV2(int[] nums) {
		final HashMap<Integer, Integer> map = new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			int count = map.getOrDefault(nums[i], 0);
			map.put(nums[i], count + 1);
		}
		final HashMap<Integer, Integer> map2 = new HashMap<>(nums.length);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (value.intValue() > 1) {
				map2.put(value, key);
			}
		}
		List<Integer> keys = new ArrayList<>(map2.keySet());
		keys.sort((a, b) -> {
			return b.intValue() - a.intValue();
		});
		if (keys.size() > 0) {
			return map2.get(keys.get(0));
		} else {
			return 1;
		}
	}

	public int majorityElement(int[] nums1) {
		return majorityElementV2(nums1);
	}
}
