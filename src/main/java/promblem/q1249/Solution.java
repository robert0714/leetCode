package promblem.q1249;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.Stack;

public class Solution {
	public String minRemoveToMakeValid(String s) {
		return minRemoveToMakeValidV1(s);
	}
	 
	public String minRemoveToMakeValidV1(String s) {

//		char[] chars = new char[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			chars[i] = s.charAt(i);
//		}
		char[] chars = 	s.toCharArray();

		final Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (chars[i] == '(') {
				
				st.push(i);
				
			} else if (chars[i] == ')') {
				if (st.size() == 0) {
					chars[i] = '.';
				}else {
					st.pop();
				}
			}
		}
		while (st.size() != 0) {
			chars[st.pop()] = '.';
		}
			

		final StringBuilder ans = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != '.') {
				ans.append(chars[i]);
			}
				
		}
		return ans.toString();

	}
	public String minRemoveToMakeValidV3(final String input) {
		String string = input;

		final Map<Character, Integer> record = new HashMap<>();
		Stack<Character> stack = new Stack<Character>();
		for (int j = 0; j < string.length(); ++j) {
			char ch = string.toCharArray()[j];
			if (ch == '(') {
				int amount = record.getOrDefault(ch, 0);
				record.put(ch, ++amount);
				stack.add(')');

			} else if (ch == ')') {

				int amount = record.getOrDefault(ch, 0);
				int formerAmount = record.getOrDefault('(', 0);

				if ((amount - formerAmount) == 0) {
					final StringBuffer sbf = new StringBuffer();
					for (int z = 0; z < string.length(); ++z) {
						if (z == j) {
							continue;
						}
						sbf.append(string.toCharArray()[z]);
					}
					string = sbf.toString();
					--j;
				} else {
					record.put(ch, ++amount);
				}
			}
		}
		int amount = Math.min(record.getOrDefault('(', 0), record.getOrDefault(')', 0));
		char symbol;
		if (record.getOrDefault('(', 0) > amount) {
			symbol = '(';
		} else {
			symbol = ')';
		}
		int differ = record.getOrDefault(symbol, 0) - amount;
		if(differ==0) {
			return string ;
		}
		String result = string;
		final StringBuffer sbf = new StringBuffer();
		stack.clear() ; 
		
		for (int j = 0; j < string.length(); ++j) {
			char ch = string.toCharArray()[j];
			if (ch != '(' && ch != ')') {
				sbf.append(string.toCharArray()[j]);
				continue;
			} else if (ch == '(') {
				stack.add(')');
				int cal = record.getOrDefault('(', 0);
				--cal;
				record.put('(', cal);
				if (record.getOrDefault(')', 0) > 0) {
					sbf.append(string.toCharArray()[j]);
				}

			} else if (stack.size() > 0 && stack.pop() == ch) {
				System.out.println("--");
				int cal = record.getOrDefault(')', 0);
				--cal;
				record.put(')', cal);

				if (record.getOrDefault('(', 0) > 0) {
					sbf.append(string.toCharArray()[j]);
				}
			} else if (record.getOrDefault(symbol, 0) == 0 && ch == symbol) {
				--differ;
				continue;
			} 
		}
		result = sbf.toString();
		return result; 
	}

	public String minRemoveToMakeValidV2(String s) {
		Stack<Character> stack = new Stack<Character>();
		final char[] arrays = s.toCharArray();
		final StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < s.length(); ++i) {
			final char c = arrays[i];
			final char[] newArrays = Arrays.copyOfRange(arrays, i, s.length());
			Arrays.sort(newArrays);
			int found = Arrays.binarySearch(newArrays, ')');
			if (c == '(' && found > 0) {
				stack.push(')');
				sbf.append(c);
			} else if (stack.isEmpty() && c != ')' && c != '(') {

				sbf.append(c);
			} else if (stack.size() > 0 && stack.peek() != c && c != '(') {

				sbf.append(c);
			} else if (stack.size() > 0 && stack.peek() == c && c != '(') {

				char tmp = stack.pop();
				sbf.append(tmp);
//				sbf.append(c);
			} else {
//				sbf.append(c);
			}

		}
		String initResult = sbf.toString();

		return initResult;
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		final char[] arrays = s.toCharArray();
		for (char c : arrays) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}
