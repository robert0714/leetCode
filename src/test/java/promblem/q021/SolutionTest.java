package promblem.q021;

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
	public void testMergeTwoLists() {
		Solution s = new Solution();
		ListNode list1 = ListNodeUtils.convert(new int[] { 1, 2, 4 });

		ListNode list2 =  ListNodeUtils.convert(new int[] { 1, 3, 4 });

		ListNode result = s.mergeTwoLists(list1, list2);
		 
		while (result != null) {
			System.out.println(result.val);
			result = result.next;

		}
	}
	

}
