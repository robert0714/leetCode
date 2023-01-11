package promblem.q112;

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
 * https://leetcode.com/problems/path-sum/description/?envType=study-plan&id=data-structure-i
 * */
public class Solution {

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;
		int count  = targetSum - root.val;
		
		if(root.left == null && root.right == null && count==0 ) {
			return true ;
		}else   {
			//special point : use the function to loop 
			return hasPathSum(root.left ,count) ||hasPathSum(root.right ,count) ;
		}  
	} 
	
}
