package promblem.q142;

import common.model.ListNode;

/**
 * 142. Linked List Cycle II
 * https://leetcode.com/problems/add-two-numbers/?envType=study-plan&id=data-structure-ii <br/>
 * https://leetcode.cn/problems/linked-list-cycle-ii/ <br/>
 * <br/>
 * https://www.baeldung.com/cs/find-cycle-in-list <br/>
 * https://github.com/eugenp/tutorials/tree/master/algorithms-modules/algorithms-miscellaneous-2/src/main/java/com/baeldung/algorithms/linkedlist  <br/>
 * https://github.com/eugenp/tutorials/tree/master/algorithms-modules/algorithms-miscellaneous-2/src/main/java/com/baeldung/algorithms/linkedlist  <br/>
 * https://www.youtube.com/watch?v=pfA0VuvwpVg <br/>
 * https://github.com/JamesHuangUC/LeetCode-Java/blob/master/142.linked-list-cycle-ii.java<br/>
 * https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0142.Linked%20List%20Cycle%20II/README_EN.md <br/>
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head, fast = head;
		boolean hasCycle = false;
		while (!hasCycle && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			hasCycle = slow == fast;
		}
		if (!hasCycle) {
			return null;
		}
		ListNode p = head;
		while (p != slow) {
			p = p.next;
			slow = slow.next;
		}
		return p;
	}

	public ListNode detectCycleV1(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode intersect = intersection(head);
		if (intersect == null || intersect.next == null) {
			return null;
		}
		ListNode curr = head;
		while (intersect != curr) {
			curr = curr.next;
			intersect = intersect.next;
		}
		return curr;
	}

	public ListNode intersection(ListNode head) {
		ListNode slowPointer = head ;
		ListNode fastPointer = head ;
		
		while (fastPointer!=null && fastPointer.next!=null) {
			slowPointer =  slowPointer.next;
			fastPointer = fastPointer.next.next ;
			if(slowPointer== fastPointer) {
				return slowPointer ;
			}
		}
		return null;
	}
}