package promblem.q763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import common.model.TreeNode;

/**
 * PARTITION LABELS <br/>
 * https://leetcode.com/problems/partition-labels/description/?envType=study-plan&id=data-structure-ii
 * <br/>
 * https://www.youtube.com/watch?v=uennJMJRIJw <br/>
 * https://www.youtube.com/watch?v=ED4ateJu86I <br/>
 **/
public class Solution {
	public List<Integer> partitionLabels(String s) {
		final List<Integer> result = new ArrayList<>();

		// step1. Record each alphabet's last index
		final int[] lastIndexes = new int[26];

		for (int i = 0; i < s.length(); ++i) {
			int aphabetSymbol = s.charAt(i) - 'a';
			lastIndexes[aphabetSymbol] = i;
		}

		int endIndex = s.length() - 1;
		
		int partitionCalculationStart = 0;
		while (partitionCalculationStart < s.length()) {
			int alphabetSymbolEnd = s.charAt(partitionCalculationStart) - 'a';
			int tmpEnd = lastIndexes[alphabetSymbolEnd];
			int partitionCalculationEnd = partitionCalculationStart + 1;

			// calculating partition end
			while (	partitionCalculationEnd != tmpEnd ) {

				//when the top is only one alphabet to construct one partition
				if (tmpEnd == 0 && partitionCalculationStart == 0) {
					partitionCalculationEnd =0 ;
					break;
				}
				// when the end is only one alphabet to construct one partition
				if (tmpEnd == endIndex && partitionCalculationStart == endIndex) {
					partitionCalculationEnd = endIndex;
					break;
				}

				int aphabetSymbol = s.charAt(partitionCalculationEnd) - 'a';
				int newEnd = lastIndexes[aphabetSymbol];

				// get the end of the partition
				tmpEnd = Math.max(tmpEnd, newEnd);

				partitionCalculationEnd++;
			}

			int partitionLength = partitionCalculationEnd - partitionCalculationStart + 1;

			result.add(partitionLength);
			partitionCalculationStart = partitionCalculationEnd + 1;
		}

		return result;
	}
}
