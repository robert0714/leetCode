package promblem.q104;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.model.TreeNode;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testMaxDepth() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		int result1 = s.maxDepth(root1);
		assertEquals(3, result1);
		System.out.println(result1);

		TreeNode root2 = parser(new Integer[] { 1, null, 2 });
		int result2 = s.maxDepth(root2);
		assertEquals(2, result2);
		System.out.println(result2);

		TreeNode root3 = parser(new Integer[] { 0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8 });
		int result3 = s.maxDepth(root3);
		assertEquals(4, result3);
		System.out.println(result3);
	}

}
