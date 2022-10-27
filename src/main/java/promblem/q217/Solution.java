package promblem.q217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
 


class Solution {
  public static void main(String[] args) {
		
		
		Solution s =new Solution();
		int[] nums ={1,2,3,1} ;
		boolean max= s.containsDuplicate(nums);
		System.out.println(max);
		
	}
  public boolean containsDuplicate(int[] nums) {        
      Set s =new HashSet(nums.length);
      int i =0 ;
      while(i<nums.length){
          int val= nums[i];
          if(! s.add(val) ){
              return true;
          }
          ++i;
      }
       
      return false ;
  }
}
 