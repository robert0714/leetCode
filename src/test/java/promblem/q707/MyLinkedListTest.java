package promblem.q707;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testMyLinkedListV1() {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3 
		assertEquals(2, myLinkedList.get(1)); // return 2
		myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
		assertEquals(3, myLinkedList.get(1));              // return 3
	}
	@Test
	public void testMyLinkedListV2() {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3 
		assertEquals(2, myLinkedList.get(1)); // return 2
		myLinkedList.deleteAtIndex(0);    // now the linked list is 2->3
		assertEquals(2, myLinkedList.get(0));              // return 2
	}
	 

}
