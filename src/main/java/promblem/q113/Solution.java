package promblem.q113;

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

/***
 * path sum
 * 
 * https://leetcode.com/problems/path-sum/discussion/?envType=study-plan&id=data-structure-i
 * */
public class Solution {

	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> result = new ArrayList<>();
	        if (root == null) {
	            return result;
	        }
	        int cursum = 0;
	        pathSum(root, cursum, sum, new ArrayList<Integer>(), result);
	        return result;
	    }

	    /**
	     * 
	     *
	     * @param   root   TreeNode
	     * @param   cursum   accumulated value
	     * @param   path   including path which former values
	     * @param   sum    total summary
	     * @param   result   result record
	     */
	    private void pathSum(TreeNode root, int cursum, int sum,
	            List<Integer> path, List<List<Integer>> result) {
	        if (root.left == null && root.right == null) {
	            if (cursum + root.val == sum) {
	            	
	            	// copy path in order to be affected by another calculation
	                List<Integer> copy = new ArrayList<>(path);
	                copy.add(root.val);	                
	                
	                result.add(copy);
	            }
	            return;
	        } else {
	            // recursive case
	            path.add(root.val);
	            
	            if (root.left != null) {
	                pathSum(root.left, cursum + root.val, sum, path, result);
	            }
	            if (root.right != null) {
	                pathSum(root.right, cursum + root.val, sum, path, result);
	            }
	            
	            //real path has been copied to result. we need remove other path
	            path.remove(path.size() - 1);
	        }
	    }
	
}
