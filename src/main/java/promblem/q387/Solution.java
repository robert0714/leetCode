package promblem.q387;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class Solution {
	public int firstUniqChar(String s) {
		final Map<Character, Unit> record = new HashMap<>(s.length());
		final List<Unit> record2 =new ArrayList<>(); 
		final char[] input = s.toCharArray();
		for (int i = 0; i < s.length(); ++i) {
			Unit count = record.getOrDefault(input[i], new Unit(0,i,input[i]));
			count.amount =count.amount +1;
			record.put(input[i], count); 
		}
		 
		Set<Entry<Character, Unit>> entrySet = record.entrySet();
		entrySet.parallelStream().forEach(unit ->{
			int amount = unit.getValue().amount;
			if(amount==1) {
				record2.add(unit.getValue());
			}
		});
		
		if(record2.size()==0) {
			return -1;
		}
		record2.sort((a,b) -> {
			return a.position-b.position;
		});
		
		return record2.get(0).position;
	}
	class Unit{
		int amount;
		int position;
		char sym;
		public Unit(int amount, int position, char sym) {
			super();
			this.amount = amount;
			this.position = position;
			this.sym = sym;
		}
		public Unit( ) {
			super(); 
		}
		
		
	}
}
