package promblem.q155;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
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
import java.util.Stack;

import common.model.TreeNode;

/**
 * 155. Min Stack
 * https://leetcode.com/problems/min-stack/?envType=study-plan&id=data-structure-ii
 */
public class MinStack {
	private Stack<Integer> stack = null;
	private Integer mini;

	public MinStack() {
		this.stack = new Stack<Integer>();
	}

	public void push(int val) {
		if (this.stack.size() == 0) {
			this.mini = val;
		} else {
			this.mini = Math.min(val, this.mini);
		}
		this.stack.push(val);
	}

	public void pop() {
		Integer val = this.stack.pop();
		 
		if (val != null && val.equals(this.mini)) {

			final Iterator<Integer> iterator = this.stack.iterator();
			this.mini = null;
			while (iterator.hasNext()) {
				Integer tmp = iterator.next();
				if (this.mini == null) {
					this.mini = tmp;
				} else {
					this.mini = Math.min(tmp, this.mini);
				}
			}

		}
	}

	public int top() {
		return this.stack.lastElement();
	}

	public int getMin() {
		return this.mini;
	}

}
/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
 * param_4 = obj.getMin();
 */
