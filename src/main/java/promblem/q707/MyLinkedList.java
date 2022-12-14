package promblem.q707;

import java.util.Deque;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
	private Deque<Integer> deque = null;

	public MyLinkedList() {
		this.deque = new LinkedList<Integer>();
	}

	public int get(int index) {
		List<Integer> tmp = (List<Integer>) this.deque;
		if (deque.size() > index) {
			return tmp.get(index);
		} else {
			return -1;
		}

	}

	public void addAtHead(int val) {
		deque.addFirst(val);
	}

	public void addAtTail(int val) {
		deque.addLast(val);
	}

	public void addAtIndex(int index, int val) {
		List<Integer> tmp = (List<Integer>) this.deque;
		if (deque.size() > index - 1) {
			tmp.add(index, val);
		}
	}

	public void deleteAtIndex(int index) {
		// deque.remove(index);
		List<Integer> tmp = (List<Integer>) this.deque;
		if (deque.size() > index) {
			tmp.remove(index);
		}

	}
}
