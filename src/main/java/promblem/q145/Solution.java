package promblem.q145;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
/**
 * https://ithelp.ithome.com.tw/articles/10271719
 * */
public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode list1 = parser(new Integer[] { 1, null, 2, 3 }); 
		  
		List<Integer> result = s.inorderTraversal(list1);
		System.out.println(result);
	}

	public List<Integer> inorderTraversal(TreeNode root) { 

      return covertFromTreeNode(root);
    }
    public List<Integer> covertFromTreeNode(TreeNode root){
         final List<Integer> result = new ArrayList<Integer>();
         if(root == null ){
             return result ;
         }
         final TreeNode left = root.left;
         if(left!=null){
            result.addAll(covertFromTreeNode(left));
         }         
         result.add(root.val);
         final TreeNode right = root.right;
         if(right!=null){
            result.addAll(covertFromTreeNode(right));
         }

         return result ; 
    }

	public static TreeNode parser(Integer[] arr) {
		if (arr.length == 0) {
			return null;
		}
		TreeNode[] nodes = new TreeNode[arr.length + 1];
		for (int i = 1; i < nodes.length; i++) {
			if( arr[i - 1]==null) {
				nodes[i] = null;
				continue;
			}
			if (  arr[i - 1] != Integer.MAX_VALUE) {
				nodes[i] = new TreeNode(arr[i - 1]);
			} else {
				nodes[i] = null;
			}
		}

		TreeNode node = null;
		for (int i = 1; i < nodes.length / 2; i++) {
			node = nodes[i];
			if (node == null)
				continue;
			node.left = nodes[2 * i];
			node.right = nodes[2 * i + 1];
		}
		return nodes[1];
	} 
	
	
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

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

}
