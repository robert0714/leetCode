package promblem.q1823;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Solution {
	public int findTheWinner(int n, int k) {
		final List<Integer> list =    new ArrayList<>(n);
		for (int i = 1; i <= n; ++i) {
			list.add(i);
		}
		
		int count = 0;
		int pointer = 1;// if pointer == size , nextPointer = pointer % (size-1)

		while (list.size() > 1) {
			pointer = pointer % list.size();
			if (pointer >= 1) {
				int pointerValue = list.get(pointer - 1);
			}

			int removeIndex = (pointer + k - 1) % list.size() - 1;
			if (removeIndex < 0) {
				removeIndex = list.size() + removeIndex;
			}
			System.out.println("第" + (++count) + "次");
			if (count == 4) {
				System.out.print(false);

			}
			System.out.println("pointer postion " + pointer);

			System.out.println(list.get(removeIndex));
			System.out.println("------------------");
			list.remove(removeIndex);
			pointer = removeIndex + 1;

		}

		System.out.println(list.size());
		return list.get(0);
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	static ListNode build(int... nums) {
		ListNode dummy = new ListNode(0);
		ListNode pre = new ListNode(0);
		pre.next = dummy;
		for (int i = 0; i < nums.length; ++i) {
			ListNode node = new ListNode(nums[i]);
			dummy.next = node;
			dummy = node;
		}
		return pre.next.next;
	}
}
