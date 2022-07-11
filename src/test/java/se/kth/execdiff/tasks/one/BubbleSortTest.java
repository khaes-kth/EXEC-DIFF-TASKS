package se.kth.execdiff.tasks.one;

import org.junit.jupiter.api.Test;
import se.kth.execdiff.tasks.one.BubbleSort;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void test_sortReverseArr(){
        int[] arr = new int[] {4, 4, 3, 3, 2, 2, 1, 1};
        BubbleSort.sort(arr);
        assertEquals(1, arr[0]);
    }
}
