package promblem.q876;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;


class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] head = new int[] {1,2, 3,4,5,6};
		ListNode data = parser(head);
		ListNode answer = s.middleNode(data);
		
		while(answer !=null) {
			System.out.print(answer.val);
			answer = answer.next;
			if(answer != null)
				System.out.print(",");
		}
		
	}
	public ListNode middleNode(ListNode head) {
		ListNode count = head;
		int total =0 ; 
		while(count !=null) { 
			count = count.next;
			total++;
		}
		int divideBy2 = total/2;
		ListNode count2 = head;
		
		int cal =0 ;
		while(count2 !=null) {
			cal++;
			count2 = count2.next;
			if(cal==divideBy2) {
				head = count2;
				break;
			}
			
		}
		
		return head;
	}
	public  static ListNode parser(int[] head) {
		ListNode result =null ; 
		for(int i = head.length-1 ; i>=0;i--) {
			if(i==head.length-1) {
				result = new ListNode(head[i]);
			}else {
				result = new ListNode(head[i],result);
			}
			
		}
		return result ; 
	}
}

class ListNode {
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
 