package promblem.q098;

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
	public boolean isValidBST(TreeNode root) {
		return isValidBSTV2(root);
	}

	public boolean isValidBSTV1(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (root.left != null && root.right != null) {
			return (root.left.val < root.val) && (root.val < root.right.val);
		} else if (root.left != null && root.right == null) {
			return !(root.left.val >= root.val);
		} else if (root.left == null && root.right != null) {
			return !(root.right.val <= root.val);
		} else {
			return isValidBST(root.left) && isValidBST(root.right);
		}
	}

	public boolean isValidBSTV2(TreeNode root) {
		double dmax = 2147483648d;
		            //2^31
		double dmin = -2147483649d;
	            	//-2^31
		return isBST(root, dmin, dmax);
	}

	public boolean isBST(TreeNode root, double min, double max) {
		if (root == null)
			return true;
		return root.val > min && root.val < max && isBST(root.left, min, (double) root.val)
				&& isBST(root.right, (double) root.val, max);
	}
}
