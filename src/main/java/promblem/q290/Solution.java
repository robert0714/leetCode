package promblem.q290;

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
	public boolean wordPattern(String pattern, String s) {
		char[] charray = pattern.toCharArray();
		String[] setences = s.split(" ");
		if (charray.length != setences.length) {
			return false;
		}
		Map<Character, String> record = new HashMap<>();
		for (int i = 0; i < charray.length; ++i) {
			final String data = record.get(charray[i]);
			
			if (data == null) {
				record.put(charray[i], setences[i]);
			} else if (data != null && !setences[i].equals(data)) {
				return false;
			}
			
		}
		Set<String> duplicatedvalue =new HashSet<>();
		for (String str : record.values()) {
			if (!duplicatedvalue.add(str)) {
				return false;
			}
		}
		return true;
	}
}
