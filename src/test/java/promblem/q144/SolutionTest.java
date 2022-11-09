package promblem.q144;

import java.util.ArrayDeque;
import java.util.Deque;
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
	public void testPreorderTraversal() {
		Solution s = new Solution();
		TreeNode list1 =  parser(new Integer[] { 1, null, 2, 3 }); 
		  
		List<Integer> result = s.preorderTraversal(list1);
		System.out.println(result);
	}
	
}
