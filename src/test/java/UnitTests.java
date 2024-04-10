import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class UnitTests {

    @Test
    public void ArbitraryArrTest() {
        int[] actual = {10,228,1337,1,5};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {1,5,10,228,1337};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void NegativeNumArrTest() {
        int[] actual = {-52,-552,-5};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {-552,-52,-5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void SameNumArrTest(){
        int[] actual = {52,52,52,52,1};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {1,52,52,52,52};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void SortedArrTest(){
        int[] actual = {1,2,3,4,5,6};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void EmptyArrTest() {
        int[] actual = {};
        int low = 0;
        int high = actual.length - 1;
        QuickSort.sort(actual,low,high);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

}