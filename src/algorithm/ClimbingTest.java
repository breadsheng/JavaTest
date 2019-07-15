package algorithm;

public class ClimbingTest {
    static int getClimbingCount(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return getClimbingCount(n - 1) + getClimbingCount(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(getClimbingCount(10));
    }
}
