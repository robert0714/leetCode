package promblem.q226;

import static common.utils.TreeNodeUtils.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.model.TreeNode; 
public class SolutionTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	@AfterEach
	protected void tearDown() throws Exception {
	}

	@Test
	public void testInvertTree() {
		Solution s = new Solution();

		TreeNode root1 = parser(new Integer[] { 4,2,7,1,3,6,9 });
	    final 	TreeNode root01 = s.invertTree(root1);
	   
	    String  verifyData1 =  parse(root01);
		System.out.println(verifyData1);
		assertEquals("[[3],[9,20],[15,7]]", verifyData1);
	    
	    TreeNode root2 = parser(new Integer[] { 2,1,3 });
	    final 	TreeNode root02 = s.invertTree(root2);
	    parse(root02);
	    
		String verifyData2 = parse(root02);
		System.out.println(verifyData2);
		assertEquals("[[3],[9,20],[15,7]]", verifyData2);
	    
	    TreeNode root3 = parser(new Integer[] {  });
	    final 	TreeNode root03 = s.invertTree(root3);
	    parse(root03);
	    
		String verifyData3 = parse(root03);
		System.out.println(verifyData3);
		assertEquals("[[3],[9,20],[15,7]]", verifyData3);
	}
	public List<Integer> getValues(final TreeNode root){
		 List<Integer> result = new ArrayList<>();
		 if(root ==null ) {
			 return result ; 
		 }
		 result.add(root.val);
		 if(root.left !=null ) {
			 result.addAll(getValues(root.left )) ;
		 }
		 if(root.right !=null ) {
			 result.addAll(getValues(root.right )) ;
		 }
		 return result ; 
	 }
	 public String parse(final TreeNode root){
		 final StringBuffer sbf =new StringBuffer();
		 List<Integer>  data = getValues(root);
		 for (Integer integer : data) {
			 sbf.append(integer.toString()).append(",") ;
		 };
		 return sbf.toString() ; 
	 }
	
}
