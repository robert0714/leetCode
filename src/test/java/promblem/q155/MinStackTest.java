package promblem.q155;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinStackTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testMinStack() {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3, minStack.getMin()); // return -3
		minStack.pop(); 
		assertEquals(0, minStack.top()); // return 0
		assertEquals(-2, minStack.getMin()); // return -2
	}

	 

}
