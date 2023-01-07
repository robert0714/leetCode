package promblem.q103;

import static common.utils.TreeNodeUtils.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import common.model.TreeNode;
import static org.junit.Assert.*;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}
    //    3
    //   / \
    //  9  20
    //     / \
    //    15  7
	@Test
	@Timeout(200)
	public void testZigzagLevelOrder() {
		Solution solution = new Solution();
		TreeNode root1 = parser(new Integer[] { 3, 9, 20, null, null, 15, 7 });

		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		TreeNode.connect(t1, t2, t3);
		TreeNode.connect(t3, t4, t5);
		
//		TreeNode root = t1;
		TreeNode root = root1;
		
		List<List<Integer>> actual = solution.zigzagLevelOrder(root);

		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(20, 9));
		expected.add(Arrays.asList(15, 7));

		assertEquals(expected, actual);
	}

}
