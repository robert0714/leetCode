package promblem.q409;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
/****
 * https://leetcode.com/problems/longest-palindrome/description/?envType=study-plan&id=data-structure-ii
 * *****/
public class Solution {
    public int longestPalindrome(String s) {
    	char[] charray = s.toCharArray();
    	Map<Character,Integer> record = new HashMap<>();
    	for(Character character : charray) {
    		Integer count = record.getOrDefault(character, 0);
    		record.put(character, count+1);
    	}
    	boolean odds =false ;
    	int count =0; 
    	for(Integer amount :record.values() ) {
    		if(amount%2 ==1) {
    			odds=true;
    		}
    		count += ((amount/2)*2)  ; 
    		 		
    	}
    	if(odds){
    		return count+1;
    	}else
    		return count ;  
    }
}
