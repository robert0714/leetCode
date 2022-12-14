package promblem.q143;

import static org.junit.Assert.assertTrue;

import java.util.List;

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
	public void testReorderList() {
		Solution s = new Solution();

		ListNode smaple01 = ListNodeUtils.constructLinkedList(List.of(1, 2, 3, 4));
		ListNode expected01 = ListNodeUtils.constructLinkedList(List.of(1, 4, 2, 3));
		s.reorderList(smaple01);
		assertTrue(ListNodeUtils.isSameList(expected01, smaple01));

		ListNode smaple02 = ListNodeUtils.constructLinkedList(List.of(1, 2, 3, 4, 5));
		ListNode expected02 = ListNodeUtils.constructLinkedList(List.of(1, 5, 2, 4, 3));
		s.reorderList(smaple02);
		assertTrue(ListNodeUtils.isSameList(expected02, smaple02));
	}

}
