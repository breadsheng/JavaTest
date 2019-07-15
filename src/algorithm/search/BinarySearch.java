package algorithm.search;

public class BinarySearch {
    // 时间复杂度logN
    public static int search(int[] array, int target) {
        final int length = array.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midValue = array[mid];
            if (midValue < target) {
                low = mid + 1;
            } else if (midValue > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return ~low;
    }

    // recursive
    public static int binSearch(int[] array, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) >>> 1;
        if (target > array[mid]) {
            return binSearch(array, mid + 1, high, target);
        } else if (target < array[mid]) {
            return binSearch(array, low, mid - 1, target);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 9, 10, 23, 34, 45, 89, 220};
        System.out.println(search(array, 6));
        System.out.println(binSearch(array, 0, array.length, 9));
    }

}
