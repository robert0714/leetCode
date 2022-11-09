package promblem.q145;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.model.TreeNode;

import static  common.utils.TreeNodeUtils.parser;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testPostorderTraversal() {
		Solution s = new Solution();
		TreeNode list1 = parser(new Integer[] { 1, null, 2, 3 }); 
		  
		List<Integer> result = s.postorderTraversal(list1);
		System.out.println(result);
	}

}
