package promblem.q102;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	public void testLevelOrder() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		List<List<Integer>> result1 = s.levelOrder(root1);
		String verifyData1 = show2dArray(result1);
		System.out.println(verifyData1);
		assertEquals("[[3],[9,20],[15,7]]", verifyData1);

		TreeNode root2 = parser(new Integer[] { 1 });
		List<List<Integer>> result2 = s.levelOrder(root2);
		String verifyData2 = show2dArray(result2); 
		System.out.println(verifyData2);
		assertEquals("[[1]]", verifyData2);
		
		TreeNode root3 = parser(new Integer[] {});
		List<List<Integer>> result3 = s.levelOrder(root3);
		String verifyData3 = show2dArray(result3); 
		
		System.out.println(verifyData3);
		assertEquals("[]", verifyData3);
	}

	public static String show2dArray(List<List<Integer>> mat) {
		final StringBuffer sbf = new StringBuffer();
		sbf.append("[");
		for (int i = 0; i < mat.size(); i++) {
			List<Integer> col = mat.get(i);
			sbf.append("[");
			for (int j = 0; j < col.size(); j++) {
				sbf.append(col.get(j));
				if (j < (col.size() - 1)) {
					sbf.append(",");
				}
			}
			if (i < (mat.size() - 1)) {
				sbf.append("],");
			} else if (i < (mat.size())) {
				sbf.append("]");
			} else {
				sbf.append("]");
			}
		}
		sbf.append("]");
		return sbf.toString();
	}
}
