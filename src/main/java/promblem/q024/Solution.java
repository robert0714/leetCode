package promblem.q024;

import java.util.ArrayList;
import java.util.List;

import common.model.ListNode;
/***
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 * **/
public class Solution {
	public ListNode swapPairs(ListNode head) {
		return swapPairsV2(head);
	}
	public ListNode swapPairsV2(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode tmp = head;
		final List<Integer> list = new ArrayList<>();
		while (tmp != null) {
			list.add(tmp.val);
			tmp = tmp.next;
		}
		final List<Integer> newlist = new ArrayList<>();
		if (list.size() % 2 == 0) {
			// even
			for (int i = 0; i < list.size(); i += 2) {
				newlist.add(list.get(i + 1));
				newlist.add(list.get(i));
			}

		} else {
			// odds
			final Integer last = list.get(list.size() - 1);
			// note:   i += 2   not equal  i=+2
			for (int i = 0; i < list.size() - 1; i  += 2) {
				newlist.add(list.get(i + 1));
				newlist.add(list.get(i));
			}
			newlist.add(last);
		}
		ListNode sentinel = new ListNode();

		ListNode pre = sentinel;
		for (int num : newlist) {
			ListNode node = new ListNode(num);
			pre.next = node;
			pre = node;
		}

		return sentinel.next;
	}

	public ListNode swapPairsVold(ListNode head) {

		if (head == null) {
			return null;
		}

		final List<ListNode> list = new ArrayList<>();
		// break relationship in order to happen to infinite loop
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		for (ListNode node : list) {
			node.next = null;
		}
		final List<ListNode> newlist = new ArrayList<>();
		if (list.size() % 2 == 0) {
			// even
			for (int i = 0; i < list.size(); i += 2) {
				newlist.add(list.get(i + 1));
				newlist.add(list.get(i));
			}

		} else {
			// odds
			final ListNode last = list.get(list.size() - 1);
			for (int i = 0; i < list.size() - 1; i += 2) {
				newlist.add(list.get(i + 1));
				newlist.add(list.get(i));
			}
			newlist.add(last);
		}
		ListNode pre = new ListNode(0);
		ListNode node = pre;
		for (ListNode number : newlist) {
			node.next = number;
			node = node.next;
		}
		return pre.next;

	}
}
