package promblem.q141;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode list1 = convert(new int[] { 3, 2,0, -4}); 

		boolean result = s.hasCycle(list1 ); 
		System.out.println(result );
	}
    public boolean hasCycle(ListNode head) {
    	ListNode fast = head.next;
    	ListNode slow = head;
    	while(fast != slow) {
    		  if(fast == null || fast.next == null) {
    		    return false;
    		  }
    		    
    		  fast = fast.next.next;
    		  slow = slow.next;
    		}
    		  
    		return true;
    }
	 

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public static ListNode convert(int[] params) {
		ListNode curr = new ListNode();
		ListNode next = new ListNode();
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
