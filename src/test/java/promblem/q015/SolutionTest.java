package promblem.q015;

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
	public void testThreeSum() {
		Solution s =new Solution();
		
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> result01 = s.threeSum(nums);
		showData(result01);
	}
	public static void showData(final List<List<Integer>> output) {
//		System.out.print("[");;
		for(List<Integer> row : output) {
			System.out.print("[");
			for(int i =0 ; i <row.size();  ++i) {
				if(i ==0) {
					System.out.print("[");
				}
				System.out.print(row.get(i));
				System.out.print(",");
				if(i == (row.size()-1)) {
					System.out.print("]");
				}
			}			
			System.out.print("],");
		}
//		System.out.print("]");
	}
}
