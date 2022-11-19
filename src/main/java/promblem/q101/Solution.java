package promblem.q101;

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
/**
 * https://ithelp.ithome.com.tw/articles/10272452
 * */
public class Solution {
	 
	public boolean isSymmetric(TreeNode root) {
		
		return isSymmetricV2(root) ;
	}
	public boolean isSymmetricV1(TreeNode root) {
		if(root==null) {
			return true;
		}
		if(root.left!=null && root.right!=null) {
			final TreeNode  left = root.left ; 
			final TreeNode  right = reverseNode(root.right );
			return equals(left , right) ;
		}else if(root.left==null && root.right==null) {
			return true ; 
		}
		return false ;
	}
	public TreeNode  reverseNode(final TreeNode root) {
		if(root==null) {
			return null ;
		}
		final TreeNode  left = root.left ; 
		final TreeNode  right = root.right ;
		root.left = right ;
		root.right = left ;
		reverseNode(root.left);
		reverseNode(root.right);
		return root ;
	}
	 
	public boolean equals(final TreeNode node1,final TreeNode node2) {
		if(node1==null && node1==null) {
			return true ; 
		}else if(node1!=null && node2!=null) {
			if(node1.val!= node2.val) {
				return false;
			} else 	if(node1.left !=null && node2.left ==null ) {
				return false;
			} else 	if(node1.left ==null && node2.left !=null ) {
				return false;
			}else 	if(node1.right !=null && node2.right ==null ) {
				return false;
			} else 	if(node1.right ==null && node2.right !=null ) {
				return false;
			}
			
			
			boolean leftValue =  equals(node1.left , node2.left) ;
			boolean rightValue =  equals(node1.right , node2.right) ;
			return leftValue && rightValue ;
			
		}else if(node1!=null && node2==null) {
			return false ; 
			
		} else if (node1 == null && node2 != null) {
			return false;

		}
		
		
		return false ; 
	}
	/****
	 * 
	 * https://leetcode.com/problems/symmetric-tree/solutions/2449864/iterative-solution-java/
	 * ****/
	 public boolean isSymmetricV2(TreeNode root) {
		    if(root == null)
		        return true;
		     final Queue<TreeNode> queue = new LinkedList<>();
		     queue.add(root.left);
		     queue.add(root.right);
		     while(!queue.isEmpty()) {
		        TreeNode node1 = queue.poll();
		        TreeNode node2 = queue.poll();
		         if(node1 == null && node2 == null)
		             continue;
		         if(node1 == null || node2 == null || node1.val != node2.val)
		             return false;
		         queue.add(node1.left);
		         queue.add(node2.right);
		         queue.add(node1.right);
		         queue.add(node2.left);
		     }
		     return true;
		}
}
