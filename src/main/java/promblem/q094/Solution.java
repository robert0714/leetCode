package promblem.q094;
 
import java.util.ArrayList;  
import java.util.List; 

 

import common.model.TreeNode;
/**
 * https://ithelp.ithome.com.tw/articles/10271719
 * */
public class Solution {
	 

	public List<Integer> inorderTraversal(TreeNode root) {
		final List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		final TreeNode left = root.left;
		if (left != null) {
			result.addAll(inorderTraversal(left));
		}
		result.add(root.val);
		final TreeNode right = root.right;
		if (right != null) {
			result.addAll(inorderTraversal(right));
		}

		return result;
	}
}
