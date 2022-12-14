package promblem.q143;

import java.util.ArrayList;
import java.util.List;

import common.model.ListNode;

/**
 * 143. Reorder List
 **/
public class Solution {
	public void reorderList(ListNode head) {
		List<ListNode> order = new ArrayList<>();
		ListNode initRecord = head;

		while (head != null) {
			order.add(head);
			head = head.next;
		}
		order.parallelStream().forEach(unit -> {
			unit.next = null;
		});
		List<ListNode> newOrder = new ArrayList<>(order.size());

		for (int i = 0; i < order.size(); ++i) {
			if (i != 0 && i % 2 == 1) {
				//odds
				int j = order.size() - i / 2 - 1;
				newOrder.add(order.get(j));
			}else {
				newOrder.add(order.get(i/2));
			}
		}
		head = initRecord;
		initRecord = newOrder.get(0);
		for (int i = 1; i < newOrder.size(); ++i) {
			initRecord.next=newOrder.get(i);
			initRecord = initRecord.next;
		}
		System.out.println(newOrder);
		;
	}
}