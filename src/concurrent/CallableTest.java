package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> "breadsheng";
        Future<String> future = Executors.newSingleThreadExecutor().submit(callable);
        System.out.println(future.get());
    }
}