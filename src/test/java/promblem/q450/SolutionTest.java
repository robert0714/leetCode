package promblem.q450;

import static com.leetcode.Test.assertEqualsIgnoreOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import common.model.TreeNode;
import common.utils.TreeNodeUtils;

public class SolutionTest {
	Solution solution ;

	@BeforeEach
	protected void setUp() throws Exception {
		solution =new Solution();
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

    //        5
    //      /   \
    //     3     6
    //    / \     \
    //   2   4     7
    //              
    //        5
    //      /   \
    //     4     6
    //    /       \
    //   2         7
    @Test
    @Timeout(200)
    public void Test1() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(7);
         
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode.connect(t3, null, t6); 
         
        final  TreeNode actual = solution.deleteNode(t1, 3);
        
        
        TreeNode expected = new TreeNode(5);
        TreeNode e2 = new TreeNode(4);
        TreeNode e3 = new TreeNode(6);
        TreeNode e4 = new TreeNode(2); 
        TreeNode e6 = new TreeNode(7);
         
        TreeNode.connect(expected, e2, e3);
        TreeNode.connect(e2, e4, null);
        TreeNode.connect(e3, null, e6); 
        assertTrue(TreeNodeUtils.isSameTree(actual, expected));
        
    }

}
