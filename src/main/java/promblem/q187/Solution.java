package promblem.q187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * https://www.youtube.com/watch?v=V2VrBK5FjoY
 * */
public class Solution {
	public List<String> findRepeatedDnaSequences(final String s) {
		final List<String> result = new ArrayList<>();
		if (s.length() < 10) {
			return result;
		}
		final Map<String, Integer> record = new HashMap<>();
		for (int i = 0; i < s.length() - 9; ++i) {
			final String dna = s.substring(i, i + 10);
			int amount = record.getOrDefault(dna, 0);
			record.put(dna, amount+1);
		}
		for(Map.Entry<String, Integer> entry :record.entrySet() ) {
			int amount = entry.getValue();
			if(amount > 1 ) {
				result.add(entry.getKey());
			}
		}
		

		return result;
	}
}
