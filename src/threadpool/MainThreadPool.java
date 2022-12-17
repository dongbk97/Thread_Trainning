package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);
        ExecutorService executorService3 = Executors.newCachedThreadPool();
        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 1; i <= 10; i++) {
            MyThread myRunnable = new MyThread("Runnable " + i);
            executorService3.execute(myRunnable);
        }
        // Phương thức này sẽ được nói sau ở ExecutorService
        executorService2.shutdown();
    }
}
