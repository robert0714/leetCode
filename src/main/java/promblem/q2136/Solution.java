package promblem.q2136;

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
		final int[] plantTime= {27,5,24,17,27,4,23,16,6,26,13,17,21,3,9,10,28,26,4,10,28,2} ;
		final int[] growTime= {6,9,14,17,6,14,23,24,11,6,27,14,13,1,15,5,12,15,23,27,28,12} ;
		int day = s.earliestFullBloom(plantTime , growTime);
		 
		 System.out.println("**********************************");
		System.out.println(day);
	}
	
	public int earliestFullBloom(int[] plantTime, int[] growTime) {
		int n = plantTime.length;
//		int[][] temp = new int[n][2];
		Flower[] flowers = new Flower[ n]  ;
		for (int i = 0; i <  n; i++) {
//			temp[i][0] = plantTime[i];
//			temp[i][1] = growTime[i];
			flowers[i] = new Flower( plantTime[i] ,growTime[i]);
		}
		//以上通常寫成物件		
		
//		Arrays.sort(temp, (a, b) -> b[1] - a[1]); //跟據growTime由大到小排序
		Arrays.sort(flowers, (a, b) -> b.growTime - a.growTime); //跟據growTime由大到小排序
		
		int max = 0;
		int cumulative = 0;//累計前次的growtime
		
//		 
//		for (int i = 0; i < temp.length; i++) {
//			int totaltimeForSpecific = temp[i][0] + temp[i][1] ; //單一花種所需要的總時間
//			int spentTime= cumulative + totaltimeForSpecific; //plantTime時間不可重疊,所以加上本次growTime
//			max = Math.max(max, spentTime);//比較目前累計時間 與  單一花種所需要的總時間+plantTime時間不可重疊部分 哪一個大?
//			cumulative = cumulative + temp[i][0];//plantTime累計
//		}
		
		for (Flower flower : flowers) {			
			int totaltimeForSpecific = flower.plantTime + flower.growTime ; //單一花種所需要的總時間
			int spentTime= cumulative + totaltimeForSpecific; //plantTime時間不可重疊,所以加上本次growTime
			max = Math.max(max, spentTime);//比較目前累計時間 與  單一花種所需要的總時間+plantTime時間不可重疊部分 哪一個大?
			cumulative = cumulative + flower.plantTime;//plantTime累計
		}
		return max;
	}
	class Flower{
		
		public Flower(int plantTime, int growTime) {
			this.plantTime = plantTime;
			this.growTime = growTime;
		}
		int plantTime;
		int growTime;
	}
	public int earliestFullBloomOld(int[] plantTime, int[] growTime) {
        int miniPlantTime = sum (plantTime);
        int mini =growTime[0] ;
        for(int val: growTime){
            mini = Math.min(val,mini);
        }
        // int lastGrowTime = growTime [growTime.length-1] ;
		final int miniRequireDays = miniRequirement(plantTime, growTime);
		int calTime = miniPlantTime + mini;
		if (miniRequireDays > calTime) {
			return miniRequireDays;
		}
		return calTime;
    }
	public int miniRequirement(int[] plantTime, int[] growTime) {
		int maxDay =plantTime[0]+growTime[0];
		for(int i = 0 ; i < plantTime.length ; ++i) {
			maxDay = Math.max(maxDay, plantTime[i]+growTime[i]) ;
		}
		return maxDay ; 
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
