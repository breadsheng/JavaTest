package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// 五个线程执行到同一个点的时候往下走
public class CyclicBarrierTest {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + "hello");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName() + ":" + "world");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
