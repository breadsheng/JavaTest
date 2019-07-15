package concurrent;

public class JoinTest {
    public static void main(String[] args) {
        Thread b = new Thread(() -> printNumber("b"));

        Thread a = new Thread(() -> {
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printNumber("a");
        });

        a.start();
        b.start();
    }

    private static void printNumber(String threadName) {
        int i=0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }
    }
}
