package promblem.q350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
		 PriorityQueue<Integer> sorted = new PriorityQueue<Integer>();
		int[] nums1 = { 4,9,5 };
		int m = 3;
		int[] nums2 = { 9,4,9,8,4};
		int n = 3;
		int[] nums = s.intersect(nums1,   nums2 );
		for (int val : nums) {
			System.out.println(val);
		}
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		if (m == 0 || n == 0){
			return (new int[0]);
        }
		Arrays.sort(nums1);
		Arrays.sort(nums2);
        
		final List<Integer> res = new ArrayList<Integer>(Math.max(m,n));
        
        //This is important !
		int p = 0, q = 0;
		while (true) {
			if (p == m || q == n){
                //只要一個陣列跑完時
				break;
            }
			if (nums1[p] < nums2[q]){
                //數值小的就換下一個
				p++;
            }
			else if (nums1[p] > nums2[q]){
                //數值小的就換下一個
				q++;
            }
			else {
                //相同時
				res.add(nums1[p]);
				p++;
				q++;
			}
		}        
		return convertFromList(res);
    }	
	
	public int[] intersectV2(int[] nums1, int[] nums2) {
        Map<Integer,Integer> counter1 = getCounter(nums1);
        Map<Integer,Integer> counter2 = getCounter(nums2);
        List<Integer> result = null;
        int size1 =  counter1.keySet().size();
        int size2 =  counter2.keySet().size();
        if(size1 < size2) {
        	 result =filter(counter1,counter2) ;
        }else {
        	result =filter(counter2,counter1) ;
        }
        
        return convertFromList(result);
    }
	private int[] convertFromList(List<Integer> from) {
		int[] result =new int[from.size()];
		for(int i =0 ; i<  from.size() ; ++i) {
			result[i] = from.get(i);
		}
		return result;
	}
    private  List<Integer> filter(Map<Integer,Integer> small  ,Map<Integer,Integer> large){
        final List<Integer> result =new ArrayList<Integer> ();
        Set<Entry<Integer, Integer>> smallEn = small.entrySet();
        for(Entry<Integer, Integer> entry : smallEn) {
        	Integer key = entry.getKey();
        	Integer value = entry.getValue();
        	if(!large.containsKey(key)) {
        		continue ;
        	}
        	int amount = Math.min(value, large.get(key)) ;
        	while(amount >0) {
        		result.add(key);
        		amount--;
        	}
        }
        return result ; 
    }

    
    private Map<Integer,Integer> getCounter(int[] nums){
        final Map<Integer,Integer> result  =new HashMap<Integer,Integer>();
        
        for(int val : nums){
           int count =  result.getOrDefault( val, 0);
            result.put( val, count+1);
        }
        return result; 
    }

}
