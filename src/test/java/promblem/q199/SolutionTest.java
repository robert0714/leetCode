package promblem.q199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import common.model.TreeNode;
import promblem.q199.Solution;

public class SolutionTest {
	Solution solution = null;

	@BeforeEach
	protected void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}
    /**
     *      1       <--- 
     *    /   \ 
     *   2     3     <--- 
     *    \     \ 
     *     5     4     <--- 
     */   
	@Test
	@Timeout(200)
	public void testRightSideView() {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode.connect(t1, t2, t3);
		TreeNode.connect(t2, null, t5);
		TreeNode.connect(t3, null, t4);
		TreeNode root = t1;
		List<Integer> actual = solution.rightSideView(root);
		List<Integer> expected = Arrays.asList(1, 3, 4);
		assertEquals(expected, actual);
	}
   
}
