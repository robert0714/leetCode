package promblem.q450;
 

import common.model.TreeNode;

/****
 * https://leetcode.com/problems/delete-node-in-a-bst/?envType=study-plan&id=data-structure-ii<p/>
 * https://www.javatpoint.com/java-program-to-construct-a-binary-search-tree-and-perform-deletion-and-in-order-traversal
 * 
 *****/
public class Solution {
	 
	//insert() will add new node to the binary search tree  
	public void insert(TreeNode root, int data) {
		// Create a new node
		TreeNode newNode = new TreeNode(data);

		// Check whether tree is empty
		if (root == null) {
			root = newNode;
			return;
		} else {
			// current node point to root of the tree
			TreeNode current = root, parent = null;

			while (true) {
				// parent keep track of the parent node of current node.
				parent = current;

				// If data is less than current's data, node will be inserted to the left of
				// tree
				if (data < current.val) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}
				// If data is greater than current's data, node will be inserted to the right of
				// tree
				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	} 
	//minNode() will find out the minimum node  
    public TreeNode minNode(TreeNode root) {  
        if (root.left != null)  
            return minNode(root.left);  
        else  
            return root;  
    } 
    //deleteNode() will delete the given node from the binary search tree  
    public TreeNode deleteNode(TreeNode root, int key) {  
        if(root == null){  
            return null;  
         }  
        else {  
            //value is less than node's data then, search the value in left subtree  
            if(key < root.val)  {
                root.left = deleteNode(root.left, key);  
            }
            //value is greater than node's data then, search the value in right subtree  
            else if(key > root.val) { 
                root.right = deleteNode(root.right, key);  
            }
            //If value is equal to node's data that is, we have found the node to be deleted  
            else {  
                //If node to be deleted has no child then, set the node to null  
                if(root.left == null && root.right == null)  
                    root = null;  

                //If node to be deleted has only one right child  
                else if(root.left == null) {  
                    root = root.right;  
                }  

                //If node to be deleted has only one left child  
                else if(root.right == null) {  
                    root = root.left;  
                }  

                //If node to be deleted has two children node  
                else {  
                    //then find the minimum node from right subtree  
                	TreeNode temp = minNode(root.right);  
                    //Exchange the data between node and temp  
                    root.val = temp.val;  
                    //Delete the node duplicate node from right subtree  
                    root.right = deleteNode(root.right, temp.val);  
                }  
            }  
            return root;  
        }  
    }  
}
