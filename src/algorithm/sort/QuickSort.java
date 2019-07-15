package algorithm.sort;

// 时间复杂度平均O(nlogn)，最差O(n2)，空间复杂度O(1)，不稳定
public class QuickSort extends SortingAlgorithm {

    public void sort(int[] array) {
        final int length = array.length;
        quickSort(array, 0, length - 1);
        for (int a : array) {
            System.out.println(a);
        }
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int povit = array[right];
        while (left < right) {
            while (array[left] < povit) {
                left++;
            }
            while (array[right] > povit) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 90, 9, 10, 34, 24, 22, 11, 220};
        new QuickSort().sort(array);
    }
}
