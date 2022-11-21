package promblem.q226;

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

 
public class Solution {
	public TreeNode invertTree(TreeNode root) {
        if(root==null) {
			return null ;
		}
		final TreeNode  left = root.left ; 
		final TreeNode  right = root.right ;
		root.left = right ;
		root.right = left ;
		invertTree(root.left);
		invertTree(root.right);
		return root ;
    }
	
}
