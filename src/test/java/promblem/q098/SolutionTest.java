package promblem.q098;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
	public void testIsValidBST() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 2,1,3 });
		final boolean root01 = s.isValidBST(root1 );

		assertTrue(root01);
		
		TreeNode root2 = parser(new Integer[] { 0 });
		final boolean root02= s.isValidBST(root2 );

		assertTrue(root02);
		
		TreeNode root3 = parser(new Integer[] { 5,1,4,null,null,3,6});
		final boolean root03= s.isValidBST(root3 );

		assertFalse(root03);
		
		TreeNode root4 = parser(new Integer[] { 1,1});
		final boolean root04= s.isValidBST(root4);

		assertFalse(root04);
		
		TreeNode root5 = parser(new Integer[] { 0,null,-1});
		final boolean root05= s.isValidBST(root5);

		assertFalse(root05);
		
		TreeNode root6 = parser(new Integer[] { 5,4,6,null,null,3,7});
		final boolean root06= s.isValidBST(root6);

		assertFalse(root06);
	}

}
