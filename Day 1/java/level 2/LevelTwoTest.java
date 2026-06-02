import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class LevelTwoTest {

		@Test
		public void testThatFunctionReturnsRepeatedValues(){

			int[] array = {1,2,3,2,4,3};

			int[] expected = {2,3};
	
			int[] actual = repeatedValues.LevelTwo(array);

			assertArrayEquals(expected, actual);

}

		@Test
		public void testThatFunctionReturnsRepeatedValuesAndIndexes(){

    		int[] array = {-11, -9, 3, -9, 2, -11};

    		int[][] expected = {{-11, 0, 5},{-9, 1, 3}};
        			
    		int[][] actual = LevelTwo.getRepeatedValuesAndIndexes(array);

    		assertArrayEquals(expected, actual);
}

		@Test
		public void testThatFunctionMovesAllZerosToTheEnd(){

    		int[] array = {5, 0, 3, 0, 2, 0};

    		int[] expected = {5, 3, 2, 0, 0, 0};

    		int[] actual = LevelTwo.moveZerosToEnd(array);

    		assertArrayEquals(expected, actual);
}


		












































}

