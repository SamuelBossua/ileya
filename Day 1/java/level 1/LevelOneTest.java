import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class LevelOneTest {

	@Test
	public void testThatFunctionSplitsArrayIntoEvenAndOddArrays(){

		int[] array = {1,2,3,4,5,6};

		int[][] expected = {{2,4,6},{1,3,5}};

		int[][] actual = LevelOne.arraySplitter(array);
		
		assertArrayEquals(actual, expected);



}
		
	@Test
	public void testThatFunctionChecksIfArrayIsPallindrome(){

		int[] array = {4,6,4};

		boolean expected = true;

		boolean actual = LevelOne.palindromicArray(array);
		
		assertEquals(actual, expected);
}


	@Test
	public void testThatFunctionReturnsPerfectSquare(){

		int[] array = {3,4,5,9,12,16};
	
		int[] expected = {4,9,16};

		int[] actual = LevelOne.getPerfectSquare(array);
		
		assertArrayEquals(actual, expected);

}



	@Test 
	public void testthatFunctionReplacesNonPerfectSquaresWithNegativeOne(){

		int[] array = {7,4,3,5,9,16,21};

		int[] expected = {-1,4,-1,-1,9,16,-1};

		int[] actual  = LevelOne.replaceNonPerfectSquare(array);

		assertArrayEquals(expected, actual);



}































}