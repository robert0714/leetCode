package promblem.q653;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import common.model.TreeNode;

class Solution {
	public boolean findTarget(TreeNode root, int k) {
		if (root == null) {
			return false;
		}
		Set<Integer> set = getSet(root);
		while (set.iterator().hasNext()) {
			int prime = set.iterator().next();
			int other = k - prime;
			
			if (set.contains(other)) {
				set.remove(other);
				set.remove(prime);
			} else {
				return false;
			}
		}
		return true;
	}

	public Set<Integer> getSet(TreeNode root) {
		final Set<Integer> result = new HashSet<Integer>();
		if (root == null) {
			return result;
		}
		if (root.left != null) {
			result.addAll(getSet(root.left));
		}
		result.add(root.val);
		if (root.right != null) {
			result.addAll(getSet(root.right));
		}
		return result;
	}

	public boolean findTargetV2(TreeNode root, int k) {
		HashSet<Integer> table = new HashSet<>();

		LinkedList<TreeNode> list = new LinkedList<>();
		list.add(root);

		while (!list.isEmpty()) {
			root = list.pollFirst();
			if (table.contains(k - root.val))
				return true;
			table.add(root.val);

			if (root.left != null)
				list.addLast(root.left);
			if (root.right != null)
				list.addLast(root.right);
		}

		return false;
	}
}
