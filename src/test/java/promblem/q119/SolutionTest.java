package promblem.q119;

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
	public void testGetRow() {
		Solution s =new Solution();
		
		List<Integer> list = s.getRow(3);
		System.out.println(list.size());
		assertEquals(4, list.size());
		
		
		List<Integer> list2 = s.getRow(4);
		System.out.println(list2.size());
		assertEquals(5, list2.size());
		
		
		List<Integer> list31 = s.getRow(31);
		System.out.println(list31.size());
		assertEquals(32, list31.size());
	}

	@Test
	public void testGetValueFromPosition() {
		Solution s =new Solution();
		
		int value0 = s.getValueFromPosition(0, 0);
		assertEquals(1, value0);
		int value1 = s.getValueFromPosition(2, 0);
		assertEquals(1, value1);
		int value2 = s.getValueFromPosition(2, 1);
		assertEquals(2, value2);
		int value3 = s.getValueFromPosition(2, 2);
		assertEquals(1, value3);
		
		
		int value5 = s.getValueFromPosition(5, 3);
		assertEquals(10, value5);
		
		int value6 = s.getValueFromPosition(4, 2);
		assertEquals(6, value6);
	}

}
