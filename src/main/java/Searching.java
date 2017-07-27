public class Searching {

    public boolean binarySearch(int[] data, int key) {
        int length = data.length;
        int shift = getShift(data, length);
        return binarySearch(key, data, length, shift);

    }

    private int getShift(int[] data, int length) {
        int shift = 0;
        while ((shift + 1 < length) && (data[shift] < data[shift + 1])) {
            shift++;
        }
        if (shift == length - 1) {
            return 0;
        } else {
            return shift + 1;
        }
    }


    private boolean binarySearch(int key, int[] data, int length, int shift) {
        int begin = 0;
        int end = length - 1;

        while (begin <= end) {
            int mid = (end + begin) / 2;
            int mid_shifted = (mid + shift) % length;

            if (data[mid_shifted] == key) {
                return true;
            } else if (data[mid_shifted] < key) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
