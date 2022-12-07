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

import javax.xml.stream.events.Characters;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/**
 * Longest Palindromic Substring 
 * https://leetcode.com/problems/longest-palindromic-substring/submissions/856156527/?envType=study-plan&id=data-structure-ii
 * https://www.youtube.com/watch?v=QfZvw8_jz1w
 */
public class Solution {
	public String longestPalindrome(String s) {

		int length = s.length();
		if (length == 1) {
			return s;
		}
		int end = 0;
		int start = 0;
		for (int i = 0; i < length; ++i) {
			int oddLength = expand(s, i, i);
			int evenLength = expand(s, i, i + 1);
			int maxlength = Math.max(oddLength, evenLength);

			// to compare which point's length is maximum
			if (maxlength > end - start + 1) {
				// If length is even .(6),distance is 2 , start-->i-2 ,end -> i+3
				// If length is odd .(5), distance is 2 , start-->i-2 ,end -> i+2
				start = i - (maxlength - 1) / 2;
				end = i + maxlength / 2;
			}
		}

		return s.substring(start, end + 1);
	}

	private int expand(final String s, int left, int right) {
		int result = 0;
//		char[] characters = s.toCharArray();
		
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			result = right - left + 1;
			left--;
			right++;

		}
		return result;
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
