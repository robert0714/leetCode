package promblem.q082;

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
		ListNode pointer = head; 
		Map<Integer, Integer> record = new HashMap<>();
		while (pointer != null) {
			int key = pointer.val;
			Integer amount = record.getOrDefault(key, 0);
			record.put(key, ++amount);
			pointer = pointer.next;
		}
		pointer = head;
		final List<ListNode> list = new ArrayList<>();
		while (pointer != null) {
			int key = pointer.val;
			int amount = record.getOrDefault(key, 0);

			if (amount == 1) {
				list.add(pointer);
			}  
			pointer = pointer.next;
		}
		ListNode sentinel = new ListNode();
		ListNode pre = sentinel;
		for (ListNode node : list) {
			node.next = null;
			pre.next = node;
			pre = node;
			
		}
		return sentinel.next;
	}
}