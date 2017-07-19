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
    public void shiftedSortedArray() {
        int[] array = new int[]{10, 15, 1, 3, 4, 5, 6, 9};
        assertTrue(search.binarySearch(array, find));
    }

}
