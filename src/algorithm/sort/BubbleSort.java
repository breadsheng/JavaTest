package algorithm.sort;

// 时间复杂度O(n2)，空间复杂度O(1)，稳定
public class BubbleSort extends SortingAlgorithm {

    public void sort(int[] array) {
        final int length = array.length;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                        swap = true;
                    }
                }
            }
        }
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 90, 9, 10, 34, 24, 22, 11, 220};
        new BubbleSort().sort(array);
    }
}
