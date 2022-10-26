package com.example.demo;

import org.junit.jupiter.api.Test;

public class IntArrayParserTest {
	IntArrayParser parser =new IntArrayParser();

	@Test
	public void testParser() {
		int[] data = {1,2,3};
		parser.parser(data);
	}

}
