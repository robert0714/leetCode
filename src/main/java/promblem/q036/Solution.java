package promblem.q036;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
	 
	public boolean isValidSudokuSpecial(char[][] board) {
		 
		final Set<Character>	checker = new HashSet<Character>();
		for (int i = 0; i < 9; ++i) {	
			for (int j = 0; j < 9; ++j) {
				checker .add(  board[j][i] );
			}
		}
		return (checker.size() ==1 );
	}
	public boolean isValidSudoku(final char[][] board) {
		final HashSet<String> record = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                	final String r = 'r' + "-" + i + "-" + board[i][j];
                	final String c = 'c' + "-" + j + "-" + board[i][j];
                	final String rc = (i / 3) + "-" + board[i][j] + "-" + (j / 3);
					if (!record.add(r) || !record.add(c) || !record.add(rc))
						return false;

                }
            }
        }
        return true;
    }
	
	public boolean isValidSudokuV1(char[][] board) {
		final char staticData = ".".charAt(0);
		final Map<Integer, Set<Character>> record = new HashMap<Integer, Set<Character>>(9);		 
		for (int i = 0; i < 9; ++i) {			 		
			final int xIndex = i / 3;

			final char[] row = board[i];
			Set<Character> rowChecker = null;
			for (int j = 0; j < 9; ++j) {
				if (j == 0) {
					rowChecker = new HashSet<Character>();
				}
				final int yIndex = j / 3;

				int position = 10 * xIndex + yIndex;

				char value = row[j];

				final Set<Character> unit = record.getOrDefault(position, new HashSet<Character>());

				rowChecker.add(value);
				 
				if (j == 8 && rowChecker.size() == 1) {
					return false;
				}
				
				if (staticData == value) {
					continue;
				}
				if (!unit.add(value)) {
					return false;
				}
				record.put(position, unit);
			}
		}
		Collection<Set<Character>> set = record.values();
		for(Set<Character> data: set) {
			if(data.size() ==0 ) {
				return false;
			}
		}
		return true;
    }
	public char[][] reverse(char[][] board){
		char[][] result = new char[board.length][board.length];
		for (int i = 0; i < 9; ++i) {	
			for (int j = 0; j < 9; ++j) {
				result[i][j] = board[j][i];
			}
		}
		return result;
		
	}
	
}
