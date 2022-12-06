package promblem.q005;

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
import java.util.Stack;

public class Solution {
	public String longestPalindrome(String s) {
		if (s.length() == 1) {
			return s;
		}
		char[] characters = s.toCharArray();
		int[] lastIndex = new int[26];
		int[] topIndex = new int[26];
		for (int i = 0; i < s.length(); ++i) {
			lastIndex[characters[i] - 'a'] = i;
		}
		for (int i = s.length() - 1; i >= 0; --i) {
			topIndex[characters[i] - 'a'] = i;
		}

//		int i = 0;
//		while (i < s.length()) {
//			int j = i + 1;
//			int alphabet1 = characters[i] - 'a';
//			while()
//			int alphabet2 = characters[j] - 'a';
//		}

		Set<String> record = new HashSet<>();
		for (int i = 0; i < s.length(); ++i) {
			int top = topIndex[characters[i] - 'a'];
			int end = lastIndex[characters[i] - 'a'];
			if (top != end) {
				String tmp = s.substring(top, end + 1);
				String reverse   =reverse(tmp) ;
				if(tmp.equals(reverse)) {
					return tmp;
				}else {
					int index = reverse.compareTo(tmp);
					System.out.println(index);
				}
				
			}
		}
		if (record.size() == 0) {
			return s.substring(0, 1);
		}
		return "";
	}

	public String reverse(String s) {
		char[] characters = s.toCharArray();
		char[] newcharacters = new char[s.length()];
		for (int i = 0; i < s.length(); ++i) {
			int j = s.length() - i - 1;
			newcharacters[j] = characters[i];
		}
		return String.copyValueOf(newcharacters);
	}
}
