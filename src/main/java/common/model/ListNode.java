package common.model;

import java.util.List;

/**
 * 
 * For problems:
 * <p>
 * {@link _021_MergeTwoSortedLists [021]Merge Two Sorted Lists}
 * <p>
 * {@link _203_RemoveLinkedListElements [203]Remove Linked List Elements}
 * https://github.com/interviewcoder/leetcode/blob/master/src/com/leetcode/ListNode.java
 * <p>
 * https://github.com/wzx140/LeetCode/blob/master/src/main/java/com/wzx/entity/ListNode.java
 */
public class ListNode {
	
	public int val;

	public ListNode next;

	public ListNode() {
	}

	public ListNode(int x) {
		val = x;
	}

//	public String toString() { 
//		return super.showValue() ;
//	}
	public String showValue() {
		ListNode node = next;
		String str = "[" + val;
		while (node != null) {
			str += "->" + node.val;
			node = node.next;
		}
		str += "]";
		return str;
	}
 

	

}