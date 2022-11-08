package promblem.q021;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import promblem.q021.Solution.ListNode;

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
		ListNode list1 = convert(new int[] { 1, 2, 4 });

		ListNode list2 = convert(new int[] { 1, 3, 4 });

		ListNode result = s.mergeTwoLists(list1, list2);
		 
		while (result != null) {
			System.out.println(result.val);
			result = result.next;

		}
	}
	public static ListNode convert(int[] params) {
		ListNode curr = new ListNode();
		ListNode next = new ListNode();
		for (int i = params.length - 1; i > -1; i--) {
			if (i == (params.length - 1)) {
				next = null;
			} else {
				next = curr;
			}

			curr = new ListNode(params[i]);
			curr.next = next;
		}
		return curr;
	}

}
