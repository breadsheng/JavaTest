package concurrent;

public class WaitNotifyTest {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread a = new Thread(() -> {
            synchronized (lock) {
                System.out.println("a 1");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a 2");
                System.out.println("a 3");
            }
        });
        Thread b = new Thread(() -> {
           synchronized (lock) {
               System.out.println("b 1");
               System.out.println("b 2");
               System.out.println("b 3");
               lock.notify();
           }
        });
        a.start();
        b.start();
    }
}
