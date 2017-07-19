public class Searching {

    public boolean binarySearch(int[] data, int key) {
        int size = data.length;
        int low = 0;
        int high = size - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;
            }
            if(data[middle] >= data[high]) {
                low = middle;
                continue;
            }
            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }
}
