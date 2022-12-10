package promblem.q142;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.model.ListNode;

/***
 *  
 **/
public class SolutionTest {
	Solution solution = new Solution();

	@BeforeEach
	protected void setUp() throws Exception {

	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testAddTwoNumbers() {

		ListNode node1 = ListNode.build(Arrays.asList(3, 2, 0, -4));
		// head = [3,2,0,-4], pos = 1
		node1.next.next.next.next = node1.next;

		ListNode node2 = ListNode.build(Arrays.asList(1, 2));
		// head = [1,2], pos = 0
		node2.next.next = node2;

		// head = [1], pos = -1
		ListNode node3 = ListNode.build(Collections.singletonList(1));

		ListNode result01 = solution.detectCycle(node1);
		assertEquals(node1.next, result01);

		ListNode result02 = solution.detectCycle(node2);
		assertEquals(node2, result02);

		ListNode result03 = solution.detectCycle(node3);
		assertNull(result03);

	}

	/**
	 *  head = [3,2,0,-4], pos = 1
	 * */
	@Test
	public void Test1() {
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(-2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2; // pos=1
		ListNode head = n1;
		ListNode actual = solution.detectCycle(head);
		assertEquals(n2, actual);
	}
	/**
	 *  head = [3], pos = -1
	 * */
	@Test
	public void Test2() {
		ListNode n1 = new ListNode(3);
		ListNode head = n1;
		ListNode actual = solution.detectCycle(head);
		assertEquals(null, actual);
	}
	
	/**
	 *  head = [3], pos = 0
	 * */
	@Test
	public void Test3() {
		ListNode n1 = new ListNode(3);
		n1.next = n1;//pos = 0
		ListNode head = n1;
		ListNode actual = solution.detectCycle(head);
		assertEquals(n1, actual);
	}
	/**
	 *  head = [1,2,3], pos = 2
	 * */
	@Test
	public void Test4() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n3;//pos=2
		ListNode head = n1;
		ListNode actual = solution.detectCycle(head);
		assertEquals(n3, actual);
	}
	/**
	 *  head = [1,2,3], pos = -1
	 * */
	@Test
	public void Test5() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		ListNode head = n1;
		ListNode actual = solution.detectCycle(head);
		assertEquals(null, actual);
	}
}
