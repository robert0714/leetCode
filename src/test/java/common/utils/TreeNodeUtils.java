package common.utils;

import java.util.ArrayDeque;
import java.util.Deque;

import common.model.TreeNode;
 

public class TreeNodeUtils {
	public static TreeNode parser(Integer[] nums) {
    	final Deque<TreeNode> queue = new ArrayDeque<>();
    	if(nums.length ==0 ) {
    		return null;
    	}
    	final TreeNode root = new TreeNode(nums[0]);
    	queue.add(root);

    	int i = 1;
    	while (i < nums.length) {
    		final TreeNode parent = queue.poll();
    		
    		Integer leftNum = nums[i++];
    		
    		if (leftNum != null) {
    			final TreeNode left = new TreeNode(leftNum);
    			parent.left = left;
    			
    			queue.add(left);
    		}
    		
    		if (i < nums.length) {
    			Integer rightNum = nums[i++];
    			
    			if (rightNum != null) {
    				final TreeNode right = new TreeNode(rightNum);
    				parent.right = right;
    				
    				queue.add(right);
    			}
    		}
    	}
    	
    	return root;
    } 
}
