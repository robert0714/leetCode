package promblem.q160;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import common.model.ListNode;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		final Set<ListNode> set = new HashSet<>();
		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}
		while (headB != null) {
			if (set.contains(headB))
				return headB;
			set.add(headB);
			headB = headB.next;
		}
		return null;
	}

	public ListNode getIntersectionNodeV1(ListNode headA, ListNode headB) {
		ListNode countA = headA;
		ListNode countB = headB;
		final List<ListNode> sequenceA = new ArrayList<>();
		while (countA != null) {
			sequenceA.add(countA);
			countA = countA.next;
		}

		while (countB != null) {
			if (sequenceA.contains(countB)) {
				return countB;
			}
			countB = countB.next;
		}
		return null;
	}
}
