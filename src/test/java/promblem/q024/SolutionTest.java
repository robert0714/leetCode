package promblem.q024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

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
	@Timeout(value = 2000, unit = TimeUnit.MICROSECONDS)
	public void testSwapPairs() {
		Solution s = new Solution();

		ListNode sample01 = ListNodeUtils.constructLinkedList(1, 2, 3, 4);
		ListNode result01 = s.swapPairs(sample01);
		ListNode expected = ListNodeUtils.constructLinkedList(2, 1, 4, 3);
		assertEquals("2->1->4->3", ListNodeUtils.toString(result01));
		assertTrue(ListNodeUtils.isSameList(result01, expected));

		ListNode sample02 = ListNodeUtils.constructLinkedList(1, 2, 3);
		ListNode result02 = s.swapPairs(sample02);
		ListNode expected2 = ListNodeUtils.constructLinkedList(2, 1, 3);
		assertEquals("2->1->3", ListNodeUtils.toString(result02));
		assertTrue(ListNodeUtils.isSameList(result02, expected2));

		ListNode sample03 = ListNodeUtils.constructLinkedList(1, 2, 3, 4, 5);
		ListNode result03 = s.swapPairs(sample03);
		ListNode expected3 = ListNodeUtils.constructLinkedList(2, 1, 4, 3, 5);
		assertEquals("2->1->4->3->5", ListNodeUtils.toString(result03));
		assertTrue(ListNodeUtils.isSameList(result03, expected3));

	}

}
