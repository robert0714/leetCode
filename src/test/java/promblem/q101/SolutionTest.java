package promblem.q101;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;

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
	public void testIsSymmetric() {
		Solution s = new Solution();
		
		TreeNode root1 = parser(new Integer[] { 1, 2, 2, 3, 4, 4, 3 });
		boolean result1 = s.isSymmetric(root1);
		assertTrue(result1);
		System.out.println(result1);

		TreeNode root2 = parser(new Integer[] { 1, 2, 2, null, 3, null, 3 });
		boolean result2 = s.isSymmetric(root2);
		assertFalse(result2);
		System.out.println(result2);		
		
		TreeNode root3 = parser(new Integer[] { 1  });
		assertTrue(s.isSymmetric(root3));
		
		TreeNode root4 = parser(new Integer[] { 2,3,3,4,null,5,4  });
		boolean result4 = s.isSymmetric(root4);
		assertFalse(result4);
	}

	@Test
	public void testReverseNode() {
		Solution s = new Solution();
		TreeNode root1 = parser(new Integer[] {1,2,2,null,3,null,3 });
		s.reverseNode(root1);
		System.out.println();
	}

	@Test
	public void testEquals() {
		TreeNode root1 = parser(new Integer[] { 1, 2, 2, 3, 4, 4, 3 });
		TreeNode root2 = parser(new Integer[] {1,2,2,null,3,null,3 });
		TreeNode root3 = parser(new Integer[] {1,2,2,null,3,null,3 });
		Solution s = new Solution();
		boolean result1 =	s.equals(root2, root3);
		assertTrue(result1);
		boolean result2 =	s.equals(root1, root2);
		assertFalse(result2);
	}
}
