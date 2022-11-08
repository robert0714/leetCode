package promblem.q242;

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

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "anagram" ;
		String t = "nagaram";
		boolean result = solution.isAnagram(s, t);
		System.out.println(result);
	}

	public boolean isAnagram(String s, String t) {
		char[] s01 = s.toCharArray();
		char[] t01 = t.toCharArray();
		Arrays.sort(s01);
		Arrays.sort(t01);
		for(int i = 0 ; i < s01.length ;i++ ) {
			if(s01[i] != t01[i]) {
				return false ; 
			}
		}
		return true;
	}
}
