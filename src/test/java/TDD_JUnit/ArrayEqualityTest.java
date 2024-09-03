package TDD_JUnit;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrays() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testMultiDimensionalArrays() {
        int[][] a1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] a2 = {{1, 2, 3}, {4, 5, 6}};
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testStringArrays() {
        String[] a1 = {"Carrot", "Apple", "Banana"};
        String[] a2 = {"Carrot", "Apple", "Banana"};
        assertArrayEquals("Should be equal", a1, a2);
    }

}