package promblem.q383;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;
import java.util.Set;


class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		 
		String ransomNote ="aa";
		String magazine ="aab";
		boolean result =  s.canConstruct(ransomNote, magazine);
		System.out.println(result);
		
	}
	public boolean canConstruct(String ransomNote, String magazine) {
        Map <Character , Integer>  magazineLetters =  new HashMap< >();
           
        for(int i =0 ; i<magazine.length() ; ++i) {
        	char m = magazine.charAt(i);
        	int concurrent = magazineLetters.getOrDefault(m, 0);
        	magazineLetters.put(m, concurrent+1);
        } 
        for(int i =0 ; i<ransomNote.length() ; ++i) {
        	char r = ransomNote.charAt(i);
        	int currentCount = magazineLetters.getOrDefault(r, 0);

        	if(currentCount == 0) {
        		return false;
        	}else {
        		magazineLetters.put(r, currentCount-1);
        	}
        }  
        
        
        
         
        return true ; 
    }
	 
	public boolean canConstructV2(String ransomNote, String magazine) {
        char[] check =   ransomNote.toCharArray();
        
        for(int i = 0 ; i< ransomNote.length(); ++i){
        	char checker = check[i] ;
        	int index = magazine.indexOf(checker);
        	if(index ==-1) {
        		return false;
        	}
        	String prefix = magazine.substring(0 ,index );
        	String sufix = magazine.substring(index+1 );
        	magazine = 	prefix +sufix;
        }
        return true ; 
    }
}
 