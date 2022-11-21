package promblem.q112;

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
	public void testHasPathSum() {
		Solution s = new Solution();

//		TreeNode root1 = parser(new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 });
//		boolean result1 = s.hasPathSum(root1, 22);
//		assertTrue(result1);
//
//		TreeNode root2 = parser(new Integer[] { 1, 2, 3 });
//		boolean result2 = s.hasPathSum(root2, 5);
//		assertFalse(result2);

		
		TreeNode root3 = parser(new Integer[] { 5, 8, 4,13, 4, 11, null, null, null, null, 1 ,  7, 2 });
		boolean result3 = s.hasPathSum(root3, 22);
		assertTrue(result3);
	}

}
