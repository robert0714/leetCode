package promblem.q235;

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
/****
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/?envType=study-plan&id=data-structure-i
 * **/
public class Solution { 

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int mini = p.val, maxi = q.val;
		if (mini > maxi) {
			mini = q.val;
			maxi = p.val;
		}

		while (true) {
			// root node's value is great than them.
			if (root.val > maxi) {
				root = root.left;

				// root node's value is less than them.
			} else if (root.val < mini) {
				root = root.right;

				// root node's value is between them.
			} else {
				return root;
			}
		}
	}
	
	public TreeNode lowestCommonAncestorV1(TreeNode root, TreeNode p, TreeNode q) {
		int min = Math.min(p.val, q.val);
		int max = Math.max(p.val, q.val);

		// root node's value is great than them.
		if (root.val > min && root.val > max) {
			return lowestCommonAncestor(root.left, p, q);

			// root node's value is less than them.
		} else if (root.val < min && root.val < max) {
			return lowestCommonAncestor(root.right, p, q);

			// root node's value is between them.
		} else {
			return root;
		}
	}

}
