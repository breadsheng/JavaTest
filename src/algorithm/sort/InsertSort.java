package algorithm.sort;

// 时间复杂度O(n2)，空间复杂度O(1)，稳定
public class InsertSort extends SortingAlgorithm {

    public void sort(int[] array) {
        final int length = array.length;
        for (int i = 1; i < length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                // 往后移动
                array[j] = array[j - 1];
                j--;
            }
            // 插入到正确的位置
            array[j] = temp;
        }
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 90, 9, 10, 34, 24, 22, 11, 220};
        new InsertSort().sort(array);
    }
}
