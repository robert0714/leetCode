package promblem.q230;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.model.TreeNode;
import common.utils.TreeNodeUtils; 
public class SolutionTest {
	Solution solution;
	@BeforeEach
	protected void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	  @Test
	    public void Test1() {
	        TreeNode root = TreeNodeUtils.getTree0();
	        int k = 1;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 1;
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void Test2() {
	        TreeNode root = TreeNodeUtils.getTree1();
	        int k = 1;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 1;
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void Test3() {
	        TreeNode root = TreeNodeUtils.getTree1();
	        int k = 2;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 2;
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void Test4() {
	        TreeNode root = TreeNodeUtils.getTree1();
	        int k = 3;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 3;
	        assertEquals(expected, actual);
	    }

	    //      10
	    //     /  \
	    //    5   12
	    //   / \
	    //  4   7
	    @Test
	    public void Test5() {
	        TreeNode root = TreeNodeUtils.getTree5();
	        int k = 1;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 4;
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void Test6() {
	        TreeNode root = TreeNodeUtils.getTree5();
	        int k = 5;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 12;
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void Test7() {
	        TreeNode root = TreeNodeUtils.getTree5();
	        int k = 3;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 7;
	        assertEquals(expected, actual);
	    }

	    //          5
	    //         /
	    //       4
	    //      /
	    //     3
	    //    /
	    //   2
	    //  /
	    // 1
	    @Test
	    public void Test8() {
	        TreeNode root = TreeNodeUtils.getTree6();
	        int k = 1;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 1;
	        assertEquals(expected, actual);
	    }

	    //          5
	    //         /
	    //       4
	    //      /
	    //     3
	    //    /
	    //   2
	    //  /
	    // 1
	    @Test
	    public void Test9() {
	        TreeNode root = TreeNodeUtils.getTree6();
	        int k = 5;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 5;
	        assertEquals(expected, actual);
	    }

	    //          5
	    //         /
	    //       4
	    //      /
	    //     3
	    //    /
	    //   2
	    //  /
	    // 1
	    @Test
	    public void Test10() {
	        TreeNode root = TreeNodeUtils.getTree6();
	        int k = 3;
	        int actual = solution.kthSmallest(root, k);
	        int expected = 3;
	        assertEquals(expected, actual);
	    }
	
}
