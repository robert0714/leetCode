package promblem.q653;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

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
	public void testFindTarget() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		final boolean root01 = s.findTarget(root1, 9);

		assertTrue(root01);
	}

	@Test
	public void testGetSet() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		Set<Integer> set = s .getSet(root1);
		assertEquals(6,set.size());
	}

	@Test
	public void testFindTargetV2() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 5, 3, 6, 2, 4, null, 7 });
		final boolean root01 = s.findTargetV2(root1, 9);

		assertTrue(root01);
	}

}
