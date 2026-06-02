import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelThreeTest {

    @Test
    public void testThatFunctionFlattensTwoDimensionalArray(){

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] actual = LevelThree.flatten(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatFunctionRotatesArray(){

        int[] array = {1, 2, 3, 4, 5};

        int[] expected = {4, 5, 1, 2, 3};

        int[] actual = LevelThree.rotate(array, 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatFunctionMergesAndSortsTwoArrays(){

        int[] first = {1, 3, 5};

        int[] second = {2, 4, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};

        int[] actual = LevelThree.mergeSorted(first, second);

        assertArrayEquals(expected, actual);
    }
}