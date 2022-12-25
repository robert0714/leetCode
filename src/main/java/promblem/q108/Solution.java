package promblem.q108;

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
 * <p/>https://www.youtube.com/watch?v=12omz-VAyRk
 * <p/>108. Convert Sorted Array to Binary Search Tree
 * <p/>https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=study-plan&id=data-structure-ii
 * 
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    	int len = nums.length;
        if (len == 0) {
            return null;
        } 
        int startIndex = 0;
        int endIndex = len - 1;
        return constructTreeFromArray(nums, startIndex, endIndex);
    }
    //          0   1    2  3  4  5  6       //indices
    // nums = [-10,-5 , -3, 0, 5 ,8 ,9 ]     //middle = startIndex + ( endIndex - startIndex)/2
    //                                       // 0 + ( 6 - 0 ) / 2 = 3 
    //                      0 
    //                    /   \   
    //                 -'5     8  
    //                  / \   / \
    //               -10  -3  5   9
    private TreeNode constructTreeFromArray(int[] nums, int startIndex, int endIndex) {
    	 // base case
        if (startIndex > endIndex) {
            return null;
        }
        if (startIndex == endIndex) {
            return new TreeNode(nums[startIndex]);
        }
        
        // recursive case
        int middle =  startIndex + ( endIndex -startIndex) / 2;
        
        TreeNode root = new TreeNode(nums[middle]);
        
        root.left = constructTreeFromArray(nums, startIndex, middle - 1);
        root.right = constructTreeFromArray(nums, middle + 1, endIndex);
        
        return root;
    }
}