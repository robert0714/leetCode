package promblem.q232;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyQueue {
	private final Stack<Integer> s1;
	private int front;

	/**
	 * Initialize your data structure here.
	 */
	public MyQueue() {
		s1 = new Stack<>();
	}

	/**
	 * Push element x to the back of queue.
	 */
	public void push(int x) {
		if (s1.isEmpty()) {
			front = x;
		}
			
		s1.push(x);
	}

	/**
	 * Removes the element from in front of queue and returns that element.
	 */
	public int pop() {
		Stack<Integer> s2 = new Stack<>();
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
			
		int elem = s2.pop();
		if (!s2.isEmpty()) {
			front = s2.peek();
		}
			
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
			
		return elem;

	}

	/**
	 * Get the front element.
	 */
	public int peek() {
		return front;
	}

	/**
	 * Returns whether the queue is empty.
	 */
	public boolean empty() {
		return s1.isEmpty();
	}
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */