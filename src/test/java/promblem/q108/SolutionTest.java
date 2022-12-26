package promblem.q108;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import common.model.TreeNode;
import common.utils.TreeNodeUtils;

public class SolutionTest {
	//https://ithelp.ithome.com.tw/articles/10275460 
	//https://pjchender.dev/dsa/dsa-bst/
    private Solution solution;
    
	@BeforeEach
	protected void setUp() throws Exception {
		 solution = new Solution();
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	 

    //        3 
    //      /   \
    //     1     4 
    //      \      \
    //       2      5
    @Test
    @Timeout(value = 10 ,unit = TimeUnit.MILLISECONDS )
    public void Test1() {
        int[] nums = {1, 2, 3, 4, 5};
        TreeNode actual = solution.sortedArrayToBST(nums);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t3, t1, t4);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t4, null, t5);
        TreeNode expected = t3;
        assertTrue(TreeNodeUtils.isSameTree(actual, expected));
    }

    //   [1]   ==>   1
    @Test
    @Timeout(value = 10 ,unit = TimeUnit.MILLISECONDS )
    public void Test2() {
        int[] nums = {1};
        TreeNode actual = solution.sortedArrayToBST(nums);
        TreeNode t1 = new TreeNode(1);
        TreeNode expected = t1;
        assertTrue(TreeNodeUtils.isSameTree(actual, expected));
    }

    //                      2 
    //                    /   \   
    //   [1,2,3,4]  ==>  1     3  
    //                          \
    //                           4
    @Test
    @Timeout(value = 10 ,unit = TimeUnit.MILLISECONDS )
    public void Test3() {
        int[] nums = {1, 2, 3, 4};
        TreeNode actual = solution.sortedArrayToBST(nums);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode.connect(t2, t1, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode expected = t2;
        assertTrue(TreeNodeUtils.isSameTree(actual, expected));
    }
}
