package promblem.q160;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import common.model.ListNode;

/**
 * reference: https://github.com/interviewcoder/leetcode/blob/master/test/_160_IntersectionOfTwoLinkedLists/SolutionTest.java
 * 
 * */
public class SolutionTest {
	/** Test method for {@link promblem.q160.Solution } */
	Solution solution;

	@BeforeEach
	protected void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		solution = null;
	}

    //        a1 -> a2
    //                \
    //                  -> c1 -> c2 -> c3
    //                /
    // b1 -> b2 -> b3 
	@Test
	@Timeout(200)
	public void testGetIntersectionNodeV1() {
		ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;

        ListNode headA = a1;
        ListNode headB = b1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = c1;
        assertEquals(expected, actual);
	}
    //   a1 -> a2 -> a3
    //                \
    //                  -> c1 -> c2 
    //                /
    //              b1 
	@Test
//	@Disabled
	@Timeout(200)
	public void testGetIntersectionNodeV2() {
		ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(1);
        ListNode b1 = new ListNode(3);  
        ListNode c1 = new ListNode(2);
        ListNode c2 = new ListNode(4); 
        a1.next = a2;
        a2.next = a3;
        a3.next = c1;
        b1.next = c1; 
        c1.next = c2; 

        ListNode headA = a1;
        ListNode headB = b1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = c1;
        assertEquals(expected, actual);
	}
	//   a1 -> a2 -> a3
    //         b1 -> b2
    @Test
//    @Disabled
    @Timeout(200)
    public void Test4() {
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(6);
        ListNode a3 = new ListNode(4);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(5); 
        a1.next = a2;
        a2.next = a3;
        b1.next = b2; 

        ListNode headA = a1;
        ListNode headB = b1;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        ListNode expected = null;
        assertEquals(expected, actual);
    }
}
