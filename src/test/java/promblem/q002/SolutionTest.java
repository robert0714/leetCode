package promblem.q002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.model.ListNode;
import common.utils.ListNodeUtils;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testAddTwoNumbers() {
		Solution s = new Solution();

		int[] nums0101 = { 2, 4, 3 };
		int[] nums0102 = { 5, 6, 4 };
		ListNode test0101 = ListNodeUtils.convert(nums0101);
		ListNode test0102 = ListNodeUtils.convert(nums0102);
		ListNode result01 = s.addTwoNumbers(test0101, test0102);
		assertEquals(7, result01.val);
		assertEquals(0, result01.next.val);
		assertEquals(8, result01.next.next.val);
		
		
		int[] nums0201 = { 0 };
		int[] nums0202 = { 0 };
		ListNode test0201 = ListNodeUtils.convert(nums0201);
		ListNode test0202 = ListNodeUtils.convert(nums0202);
		ListNode result02 = s.addTwoNumbers(test0201, test0202);
		assertEquals(0, result02.val); 
		
	}
 
}
