package promblem.q002;
 
 

import common.model.ListNode;
 

/**
 * 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/?envType=study-plan&id=data-structure-ii  <br/>
 * https://www.youtube.com/watch?v=zaJhgYbN9h0 
 *  <br/>
 * 1) 243+564 = 807 , to reverse : 708 <br/>
 * 2) 9999999 + 9999 = 10009998, to reverse : 89990001 <br/>
 * 
 * 1. Set two pointers , one for each input list. Create head of new list .  <br/>
 * 2. Add values that our pointers are at . <br/>
 * 3. Check if there's a carry , add 1 . <br/>
 * 4. Check if sum >= 10 . If it is , mod it and set carry flag = true . <br/>
 * 5. Move pointers forward.  <br/>
 * 6. After loop , check if carry is true. If it is , add additional node to result list  <br/>
 * 7. return result list  <br/>
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode resultHead = new ListNode(0);		
		ListNode resultIterator = resultHead;
		
		//1. Set two pointers , one for each input list. Create head of new list .
		ListNode pointer1 = l1;
		ListNode pointer2 = l2;
		boolean carry = false;

		while (pointer1 != null || pointer2 != null) {
			int sum = 0;
			if (pointer1 == null) {
				//2. Add values that our pointers are at
				
				sum += pointer2.val;
				pointer2 = pointer2.next;
				
			} else if (pointer2 == null) {
				//2. Add values that our pointers are at
				
				sum += pointer1.val;
				pointer1 = pointer1.next;
				
			} else {
				//2. Add values that our pointers are at
				
				sum += (pointer1.val + pointer2.val);
				pointer1 = pointer1.next;
				pointer2 = pointer2.next;
			}
			//3. Check if there's a carry , add 1 .
			if (carry) {
				sum++;
			}
			
			//4. Check if sum >= 10 . If it is , mod it and set carry flag = true . 
			if (sum >= 10) {
				sum %= 10;
				carry = true;
			} else {
				carry = false;
			}
			
			//5. Move pointers forward.
			
			
			ListNode newNode = new ListNode(sum);
			
			
			resultIterator.next =newNode ; 
			resultIterator = resultIterator.next ; 
		}
		
		//6. After loop , check if carry is true. If it is , add additional node to result list 
		if(carry) {
			resultIterator.next = new ListNode(1);
		}
		// 7. return result list 
		return resultHead.next ; 
	}
}