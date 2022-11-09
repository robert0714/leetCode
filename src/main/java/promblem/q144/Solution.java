package promblem.q144;

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
 * https://ithelp.ithome.com.tw/articles/10270986
 * */
public class Solution {
	 

	public List<Integer> preorderTraversal(TreeNode root) {
		final List<Integer> result = new ArrayList<Integer>();
		preOrder(root, result);
		return result;
	}

	private void preOrder(TreeNode node, List<Integer> result) {
		if (node == null) {
			return;
		}
		result.add(node.val);

		preOrder(node.left, result);
		preOrder(node.right, result);
	}

	
	 

}
