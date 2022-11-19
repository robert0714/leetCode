package promblem.q102;

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

 
public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		final List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		final Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int cnt = queue.size();
			final List<Integer> level = new ArrayList<>(cnt);
			for (int i = 0; i < cnt; i++) {
				final TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			res.add(level);
		}
		return res;
	}
	
}
