package promblem.q145;

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
	 

	public List<Integer> postorderTraversal(TreeNode root) {
        final List<Integer> result = new ArrayList<Integer>();
		postorder(root, result);
        
       return result;
    }
    private void  postorder(TreeNode node , final List<Integer> result) { 
		if (node == null) {
			return  ;//  沒有節點往回走
		}
		
		postorder(node.left, result);// 前往左邊子節點
		postorder(node.right, result); // 前往右邊子節點
        result.add(node.val); //   右邊子節點回來以後，將目前節點的值紀錄到list中
	}
 

}
