package promblem.q415;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
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
 * https://leetcode.com/problems/add-strings/?envType=study-plan&id=data-structure-ii
 * *****/
public class Solution {
    public String addStrings(String num1, String num2) {
    	BigInteger total = new BigInteger(num1).add(  new BigInteger(num2) ) ;
        return  total.toString();
    }
}
