package promblem.q560;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testSubarraySum() {
		Solution s =new Solution();
		
//		int[] nums01 = {1,1,1};
//		int k1 = 2 ; 
//		int act01 = s.subarraySum(nums01, k1);
//		assertEquals(2, act01);
//		
//		int[] nums02 = {1,2,3};
//		int k2 = 3 ; 
//		int act02 = s.subarraySum(nums02, k2);
//		assertEquals(2, act02);
		
		int[] nums03 = {1,-1,0};
		int k3 = 0 ; 
		int act03 = s.subarraySum(nums03, k3);
		assertEquals(3, act03);
	}

}
