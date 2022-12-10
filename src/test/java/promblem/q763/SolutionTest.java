package promblem.q763;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testPartitionLabels() {
		final Solution s = new Solution();
		
		String s01 = "ababcbacadefegdehijhklij";
		final List<Integer> result01 = s.partitionLabels(s01);
		assertEquals(3, result01.size());
		assertEquals("ababcbaca".length(), result01.get(0));
		assertEquals("defegde".length(), result01.get(1));
		assertEquals("hijhklij".length(), result01.get(2));

		
		String s02 = "eccbbbbdec";
		final List<Integer> result02 = s.partitionLabels(s02);
		assertEquals(1, result02.size());
		assertEquals("eccbbbbdec".length(), result02.get(0)); 
		
		
		String s03 = "caedbdedda";
		final List<Integer> result03 = s.partitionLabels(s03);
		assertEquals(2, result03.size());
		assertEquals("c".length(), result03.get(0));
		assertEquals("aedbdedda".length(), result03.get(1)); 
		
		
		String s04 = "eaaaabaaec";
		final List<Integer> result04 = s.partitionLabels(s04);
		assertEquals(2, result04.size());
		assertEquals("eaaaabaae".length(), result04.get(0));
		assertEquals("c".length(), result04.get(1)); 
		
		String s05 = "vhaagbqkaq";
		final List<Integer> result05 = s.partitionLabels(s05);
		assertEquals(3, result05.size());
		assertEquals("v".length(), result05.get(0));
		assertEquals("h".length(), result05.get(1)); 
		assertEquals("aagbqkaq".length(), result05.get(2)); 
	}

}
