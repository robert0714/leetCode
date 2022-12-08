package promblem.q043;

import java.math.BigDecimal;

class Solution {
	public String multiply(String num1, String num2) {
		String result;
		try {
			BigDecimal total = new BigDecimal(num1).multiply(new BigDecimal(num2));
			result = total.toString();
		} catch (Exception e) {
			result = "0";
		}
		return result;
	}

}
