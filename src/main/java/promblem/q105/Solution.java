package promblem.q105;

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
 * <p/>
 * https://www.youtube.com/watch?v=GeltTz3Z1rw
 * <p/>  * LeetCode 105. Construct Binary Tree from Preorder and Inorder Traversal
 * <p/>  * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/?envType=study-plan&id=data-structure-ii
 * 
 */
public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length != inorder.length || preorder.length == 0) {
            return null;
        }
        int preStart = 0;
        int preEnd = preorder.length - 1;
        int inStart = 0;
        int inEnd = inorder.length - 1;
        return buildTree(preorder, preStart, preEnd, inorder, inStart, inEnd);
	}
	//https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
	//https://ithelp.ithome.com.tw/articles/10289814
	protected TreeNode buildTree(
			int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd) {
		
        // base case
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }
        
        // recursive case
        int rootVal = preorder[preStart];
        
        // find index of root in inorder array
        int rootIndexInInorder = -1; 
        
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndexInInorder = i;
                break;
            }
        }
        
        //TODO: if rootIndex == -1, throws exception
        TreeNode root = new TreeNode(rootVal);
        int leftEnd = rootIndexInInorder - inStart + preStart;
        
        
        root.left = buildTree(preorder, preStart + 1, leftEnd,
                inorder, inStart, rootIndexInInorder - 1);
        root.right = buildTree(preorder, leftEnd + 1, preEnd, 
                inorder, rootIndexInInorder + 1, inEnd);
        
        return root;
    }
}