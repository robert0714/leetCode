package promblem.q103;

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

//https://www.youtube.com/watch?v=NzPlgKJJZvo
public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		final List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		final Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		int level =0 ;
		while (!queue.isEmpty()) {
			final int size = queue.size();
			final List<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; ++i) {
				final TreeNode node = queue.remove();
				list.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			if(level %2 ==1) {
				Collections.reverse(list);
			}
			result.add(list);
			level++;
		}

		return result;
	}

}
