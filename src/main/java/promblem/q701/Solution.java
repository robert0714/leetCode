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
	public TreeNode searchBST(TreeNode root, int val) {
        if(root ==null ){
            return null;
        }else if(root.val == val ){
            return root;
        }
        TreeNode left = searchBST(root.left ,val );
        if(root.left!= null && left !=null ){
            return left ;
        }
        TreeNode right = searchBST(root.right ,val );
        if(root.right!= null && right !=null  ){
            return right;
        }
        return null;
    }
}
 
 