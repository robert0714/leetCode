package promblem.q083;

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

import common.model.ListNode;

public class Solution {
	 
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode();		
        ListNode curr = new ListNode();
        dummy.next = curr;
        
        
       
		Set<Integer> record = new HashSet<Integer>();
		while (head != null) {
			if(!record.contains(head.val)) {
				record.add(head.val);
				curr.next=head;
				curr=curr.next;
			}else {
				curr.next=null;
			}
			head=head.next;
		}
		
		  
		return dummy.next.next  ;   
    }
	public ListNode deleteDuplicatesV2(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode count= head; 
		Set<Integer> record = new HashSet<Integer>();
		while (count != null) {
			record.add(count.val);
			count = count.next;
		}
		
		ListNode curr = new ListNode();
		ListNode next = new ListNode();
        List<Integer> record2 =new ArrayList<Integer>(record);
        Collections.sort(record2);
      	Integer[] arrayRecord = record2.toArray(new Integer[] {});
		for (int i = record2.size() - 1; i > -1; i--) {
			if (i == (record2.size() - 1)) {
				next = null;
			} else {
				next = curr;
			}

			curr = new ListNode(arrayRecord[i]);
			curr.next = next;
		}
		return curr ;   
    }
	 
 
}
