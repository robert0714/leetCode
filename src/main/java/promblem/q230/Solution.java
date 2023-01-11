package promblem.q230;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.model.TreeNode;

public class Solution {
	public int kthSmallest(TreeNode root, int k) {
		if (root == null) {
			return -1;
		}
		List<Integer> list = convertList(root);
		Collections.sort(list);		
		return list.get(k-1);
	}

	public List<Integer> convertList(final TreeNode root) {
		final List<Integer> result = new ArrayList<>();
		final Deque<TreeNode> queue = new LinkedList<>();
		TreeNode tmp = root;

		queue.add(tmp);

		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			result.add(node.val); 
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		return result;
	}
}
