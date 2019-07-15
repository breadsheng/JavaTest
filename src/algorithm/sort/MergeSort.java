package algorithm.sort;

// 时间复杂度O(nlogn)，空间复杂度O(1)，不稳定
public class MergeSort extends SortingAlgorithm {

    public void sort(int[] array) {
        final int length = array.length;

        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 90, 9, 10, 34, 24, 22, 11, 220};
        new MergeSort().sort(array);
    }
}
