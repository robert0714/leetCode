package common.model;
 
/***
 * https://github.com/interviewcoder/leetcode/blob/master/src/com/leetcode/TreeNode.java
 *  <p>
 * https://github.com/wzx140/LeetCode/blob/master/src/main/java/com/wzx/entity/TreeNode.java
 * <p>
 * **/
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}