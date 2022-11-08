package promblem.q203;

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
		ListNode list1 = convert(new int[] {7,7,7,7 }); 
		int val = 7 ;

		ListNode result = s.removeElements(list1 ,val); 
		while (result != null) {
			System.out.println(result.val);
			result = result.next;

		}
	}
	public ListNode  removeElements(ListNode head, int val)  {
        if(head==null){
            return null;
        }
        ListNode count= head; 
        List<Integer> record =new ArrayList<Integer>();
		while (count != null) {
			if(count.val != val) {
				record.add(count.val);
			}
			
			count = count.next;
		}
		
		ListNode curr = new ListNode();
		ListNode next = new ListNode();
       
        
      	Integer[] arrayRecord = record.toArray(new Integer[] {});
      	boolean isNotNull = false;
		for (int i = record.size() - 1; i > -1; i--) {
			isNotNull=true;
			if (i == (record.size() - 1)) {
				next = null;
			} else {
				next = curr;
			}

			curr = new ListNode(arrayRecord[i]);
			curr.next = next;
		}
		if(isNotNull) {
			return curr ;   
		}else {
			return null;
		}
		
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
