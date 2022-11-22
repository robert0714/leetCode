package promblem.q701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import common.model.TreeNode;

class Solution {
	public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) {
              return new TreeNode(val);
        }
        if(root.val > val ){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }
        return root ; 
    }
}
