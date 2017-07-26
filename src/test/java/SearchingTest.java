import static org.junit.Assert.assertTrue;

public class SearchingTest {

    Searching search = new Searching();
    int find = 3;

    @org.junit.Test
    public void sortedArray() {
        int[] array = new int[]{1, 3, 4, 5, 6, 9, 10, 15};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_1() {
        int[] array = new int[]{3, 4, 5, 6, 9, 10, 15, 1};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_2() {
        int[] array = new int[]{4, 5, 6, 9, 10, 15, 1, 3};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_3() {
        int[] array = new int[]{5, 6, 9, 10, 15, 1, 3, 4};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_4() {
        int[] array = new int[]{6, 9, 10, 15, 1, 3, 4, 5};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_5() {
        int[] array = new int[]{9, 10, 15, 1, 3, 4, 5, 6};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_6() {
        int[] array = new int[]{10, 15, 1, 3, 4, 5, 6, 9};
        assertTrue(search.binarySearch(array, find));
    }

    @org.junit.Test
    public void shiftedSortedArray_7() {
        int[] array = new int[]{15, 1, 3, 4, 5, 6, 9, 10};
        assertTrue(search.binarySearch(array, find));
    }

}
