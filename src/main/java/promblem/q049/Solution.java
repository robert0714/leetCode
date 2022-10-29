package promblem.q049;

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

class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		final String[] strs= {"eat","tea","tan","ate","nat","bat"} ;
		List<List<String>> profit = s.groupAnagrams(strs);
		 
		 System.out.println("**********************************");
		show2dArray(profit);
	}
	public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int miniPlantTime = sum (plantTime);
        int mini =growTime[0] ;
        for(int val: growTime){
            mini = Math.min(val,mini);
        }
        // int lastGrowTime = growTime [growTime.length-1] ;
        
        return miniPlantTime+ mini;
    }
    int sum(int[] time){
        int count =0 ;
        for(int val: time){
            count = count +val;
        }
        return count ; 
    }
	public List<List<String>> groupAnagrams(String[] strs) {  
        final  Map<String ,List<String> > map = new HashMap();
        for(String val: strs){
        	String key = convert2Key(val) ; 
        	List<String> unit =	map.getOrDefault(key, new ArrayList<String>());
        	unit.add(val);
        	Collections.sort(unit);
        	map.put(key, unit);
        }
        final List<List<String>> result =new ArrayList<List<String>>(map.values()); 
        return result ; 
	}
        
	 protected String convert2Key(final String origin) {
		 char[] newArray = origin.toCharArray();
		 Arrays.sort(newArray);		 
		 return String.valueOf(newArray);
				
	 }
	 public List<List<String>> groupAnagramsV3(String[] strs) {
	        List<List<String>> list = new ArrayList<>();
	        HashMap<String , ArrayList<String>> map = new HashMap<>();
	        for(String s : strs){
	            char[] ch = s.toCharArray();
	            Arrays.sort(ch);
	            String sorted_string = new String(ch);
	            if(map.containsKey(sorted_string)){
	                ArrayList<String> currlist = map.get(sorted_string);
	                currlist.add(s);
	                map.put(sorted_string,currlist);
	            }
	            else{
	                ArrayList<String> li = new ArrayList();
	                li.add(s);
	                map.put(sorted_string,li);
	            }
	        }
	        
	        
	        for(String s : map.keySet()){
	            list.add(new ArrayList(map.get(s)));
	        }
	        
	        return list;
	    }
	 public List<List<String>> groupAnagramsV1(String[] strs) {
		    Arrays.sort(strs);
	        int count = 0 ;
	        int array = 0;
	        List<List<String>> result =new ArrayList();
	        List<String> tmp =new  ArrayList(strs.length);
	        for(String val: strs){
	              tmp.add(val);
	        }
	        final  Iterator<String> iterator = tmp.iterator();
	        while(true){
	            count++;
	            List<String> subList = new ArrayList(count);
	            for(int i = 0 ; i < count ;++i){
	                if(iterator.hasNext()){
	                    String val =  iterator.next();
	                 
	                  subList.add(val);
	                }else{
	                    break;
	                }
	                
	            }
	            if(subList.size() >0){
	                result.add(subList);
	            }
	            if( count  >= strs.length ){
	                break;
	            }
	        }
	        return result ;
	    }
	 
	public static  void show2dArray(List<List<String>> mat) {
		for(int i=0; i<mat.size(); i++){
			List<String> col = mat.get(i) ; 
			System.out.print("{");
			for (int j = 0; j < col.size(); j++) {
				System.out.print(col.get(j) + " ");
				if(j <(col.size()-1) ) {
					System.out.print(","); 
				}
			}			
			if(i <(mat.size()) ) {
				System.out.print("},"); 
			}else {
				System.out.println("}"); 
			}		    
		}
	}
	
}
