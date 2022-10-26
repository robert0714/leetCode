package com.example.demo;

public class IntArrayParser {
	public TreeNode parser(int [] data) {
		TreeNode result =null;
		if(data.length==0) {
			return null;			
		}
		for(int i = 0 ; i< data.length ;i++) {
			if(i==0) {
				result = new TreeNode(data[0]);
			}
		}
		return result;
	}
}
