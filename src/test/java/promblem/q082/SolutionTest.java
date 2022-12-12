package promblem.q082;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	@Timeout(value = 40, unit = TimeUnit.MILLISECONDS)
	public void testDeleteDuplicates() {
		Solution solution = new Solution();
		
		int[] smapl01 = { 1, 2, 3, 3, 4, 4, 5 };
		final ListNode test01 = ListNodeUtils.constructLinkedList(smapl01);
		ListNode result01 = solution.deleteDuplicates(test01);
		assertEquals("1->2->5", ListNodeUtils.toString(result01));
		
		
		int[] smapl02 = { 1, 1, 1, 2, 3 };
		final ListNode test02 = ListNodeUtils.constructLinkedList(smapl02);
		ListNode result02 = solution.deleteDuplicates(test02);
		assertEquals("2->3", ListNodeUtils.toString(result02));
		
	}

}
