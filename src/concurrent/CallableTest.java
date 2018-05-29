package concurrent;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> "breadsheng";
        Future<String> future = Executors.newSingleThreadExecutor().submit(callable);
        System.out.println(future.get());
    }
}