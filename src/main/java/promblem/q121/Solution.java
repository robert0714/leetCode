package promblem.q121;

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
		int[] prices = { 2,1,2,0,2,1 };

		int profit = s.maxProfit(prices);
		System.out.println(profit);
	}

	public int maxProfit(int[] prices) { 
		return maxProfitV3(prices);
	}

	//It's too slow!
	public int exhaustion(final int[] prices) {
		int max =0 ; 
		for(int i = 0 ; i<prices.length ; ++i) {
			int[] toBuyPirce = Arrays.copyOfRange(prices, i+1, prices.length); 
			for(int val :toBuyPirce) {
				max = Math.max(max, val-prices[i]);
			}
		}
		return max ; 
	}
	//No.1 fast
	public int maxProfitV3(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;
    }
	public int exhaustionV2(final int[] prices) {
		int maxPrice = 0 ;
		int minPrice = 0 ;
		int maxPostion = -1;
		int minPostion = -1;
		int profit =0 ; 
		for (int i = 0; i < prices.length; ++i) {
			final int price =  prices[i];
			maxPrice = Math.max(maxPrice, price);
			if(minPrice == 0  ) {
				minPrice = Math.min(maxPrice, price );
			}else {
				minPrice = Math.min(minPrice, price );
			}
			
			if (maxPrice == price) {
				maxPostion = i;
			}
			if (minPrice == price) {
				minPostion = i;
			}
			if(maxPostion==-1 || minPostion==-1) {
				continue;
			}
			if(maxPostion > minPostion) {
				profit =maxPrice - minPrice; 
			}
			else if(minPostion != -1 && (maxPostion != minPostion)) {
				//發現最大值是過去式，進行剃除
				maxPrice = minPrice;
				maxPostion = -1;
			}
		}
		
		 
		return profit;
	}
}
