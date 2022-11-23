package promblem.q235;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import common.model.TreeNode; 

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testLowestCommonAncestor() throws RunnerException {
		Options opt = new OptionsBuilder().include(BenchmarkSingletonVsThreadLocal.class.getSimpleName()).build();

		new Runner(opt).run();
		
		
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 6,2,8,0,4,7,9,null,null,3,5 });
		TreeNode result1 = s.lowestCommonAncestor(root1 ,new TreeNode(2) ,new TreeNode(8));
		assertEquals(6, result1.val);
		
		TreeNode root2 = parser(new Integer[] { 6,2,8,0,4,7,9,null,null,3,5 });
		TreeNode result2 = s.lowestCommonAncestor(root2 ,new TreeNode(2) ,new TreeNode(4));
		assertEquals(2, result2.val);
	}
	
}
