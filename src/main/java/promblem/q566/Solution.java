package promblem.q566;

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
		int[][] prices = {{1,2},{3,4} };
			int r=2,c=4;
		int[][] profit = s.matrixReshape(prices,r,c);
		show2dArray(prices);
		 System.out.println("**********************************");
		show2dArray(profit);
	}

	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        
		int[][] result = new int[r][c];
		final List<Integer> tmp =new ArrayList();
		for(int i=0; i<mat.length; i++){
			int[] col = mat[i] ;  
			for (int j = 0; j < col.length; j++) {				 
				tmp.add(col[j]);
			}	    
		}
		int index =0 ; 
		for(int i=0; i<result.length; i++){
			int[] col = result[i] ;  
			for (int j = 0; j < col.length; j++) {
				if(tmp.size()<=index) {
					break;
				}
				col[j]= tmp.get(index);
				index++;
			}	    
		}
		
		return result;
	}
	public int[][] matrixReshapeV2(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) return nums;
        
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return result;
    }
	public static  void show2dArray(int[][] mat) {
		for(int i=0; i<mat.length; i++){
			int[] col = mat[i] ; 
			System.out.print("{");
			for (int j = 0; j < col.length; j++) {
				System.out.print(col[j] + " ");
				if(j <(col.length-1) ) {
					System.out.print(","); 
				}
			}			
			if(i <(mat.length-1) ) {
				System.out.print("},"); 
			}else {
				System.out.println("}"); 
			}		    
		}
	}
	
}
