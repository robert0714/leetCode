package promblem.q104;

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

/**
 * https://ithelp.ithome.com.tw/articles/10272452
 */
public class Solution {

	public int maxDepth(TreeNode root) {
		int count = 0;
		if (root == null) {
			return 0;
		}
			
		count++;

		if (root.left != null || root.right != null) {
			
			int amount1 = maxDepth(root.left);
			int amount2 = maxDepth(root.right);
			int max = Math.max(amount1, amount2);
			count = count + max;
		}
		return count;
	} 
	
}
