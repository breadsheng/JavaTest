package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static ExecutorService threadPool = Executors.newFixedThreadPool(20);
    private static Semaphore semaphore = new Semaphore(10);
    public static void main(String[] args) {
        threadPool.execute(() -> {
            try {
                semaphore.acquire();
                System.out.println(semaphore.availablePermits());
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPool.shutdown();
    }
}
