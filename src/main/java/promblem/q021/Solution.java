package promblem.q021;

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
		ListNode list1 = convert(new int[] { 1, 2, 4 });

		ListNode list2 = convert(new int[] { 1, 3, 4 });

		ListNode result = s.mergeTwoLists(list1, list2);
		ListNode curr = new ListNode();
		while (result != null) {
			System.out.println(result.val);
			result = result.next;

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
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();		
        ListNode curr = new ListNode();
        dummy.next = curr;
        while(list1 != null || list2 != null){
            /*
            1. If both not null:
            -- compare values and update next node of current
            -- advance current and list pointer to next node according to comparison result
            -- continue loop
            
            2. One of the list is already null (all elements have been added)
            -- pointer current's next to the rest of the other list
            -- terminate loop and return
            */
            if(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    curr.next = list1;
                    curr = curr.next;
                    list1 = list1.next;
                } else{
                    curr.next = list2;
                    curr = curr.next;
                    list2 = list2.next;
                }
            } else if(list1 == null){
                curr.next = list2;
                break;
            } else{
                curr.next = list1;
                break;
            }
        }
        return dummy.next.next;
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
}
