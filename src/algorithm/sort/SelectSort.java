package algorithm.sort;

// 时间复杂度O(n2)，空间复杂度O(1)，不稳定
public class SelectSort extends SortingAlgorithm {

    public void sort(int[] array) {
        final int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[index]) index = j;
            }
            swap(array, i, index);
        }
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 90, 9, 10, 34, 24, 22, 11, 220};
        new SelectSort().sort(array);
    }
}
