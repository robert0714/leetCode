package common.utils;

import common.model.ListNode;

public class ListNodeUtils {
	public static ListNode convert(int[] params) {
//		ListNode curr = new ListNode();
//		ListNode next = new ListNode();
		ListNode curr = null;
		ListNode next = null;
		for (int i = params.length - 1; i > -1; i--) {
			if (i == (params.length - 1)) {
				next = null;
			} else {
				next = curr;
			}

			curr = new ListNode(params[i]);
			curr.next = next;
		}
		return curr;
	}
}
