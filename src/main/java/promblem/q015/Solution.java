package promblem.q015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import java.util.Stack;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		final List<List<Integer>> result = new ArrayList<>();
		if (nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);

		for (int number1 = 0; number1 < nums.length; number1++) {
			int number2 = number1 + 1;
			int number3 = nums.length - 1;

			if (number1 > 0 && nums[number1] == nums[number1 - 1]) {
				continue;
			}
			while (number2 < number3) {
				int target = 0, sum = nums[number2] + nums[number3] + nums[number1];

				if (sum == target) {
					result.add(Arrays.asList(nums[number1], nums[number2], nums[number3]));
					number2++;

					while (number2 < number3 && nums[number2] == nums[number2 - 1]) {
						number2++;
					}
				}
				if (sum < target) {
					number2++;
				} else {
					number3--;
				}
			}

		}
		return result;
	}

	public List<List<Integer>> threeSumV1(int[] nums) {
		final List<List<Integer>> result = new ArrayList<List<Integer>>();
		final Set<String> record = new HashSet<String>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; ++i) {
			int number01 = nums[i];
			for (int j = 0; j < nums.length && i != j; j++) {
				int number02 = nums[j];
				for (int k = 0; k < nums.length && k != j && k != i; k++) {
					int others = 0 - number01 - number02;
					int number03 = nums[k];
					if (number03 == others) {
						final StringBuffer sbf = new StringBuffer().append(number01).append(",").append(number02)
								.append(",").append(number03);
						record.add(sbf.toString());
					}
				}
			}
		}
		record.forEach(str -> {
			String[] arrays = str.split(",");
			List<Integer> unitList = new ArrayList<Integer>(3);
			for (String unit : arrays) {
				unitList.add(Integer.valueOf(unit));
			}
			result.add(unitList);
		});

		return result;
	}
}
