package threadpoolexcutor;

import java.util.concurrent.*;

public class MainThreadPool {
    private static  ThreadRejectHandler threadRejectHandler= new ThreadRejectHandler();
    public static void main(String[] args) throws InterruptedException {



        ThreadPoolExecutor executor= new ThreadPoolExecutor(5,10
                ,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>(true),threadRejectHandler );


        for( int i=1; i<500;i++){
            threadRejectHandler.setA(i);
            executor.execute(new ThreadCount("Thread "+i));
//            Thread.sleep(50);

        }

        executor.shutdown(); // Không cho threadpool nhận thêm nhiệm vụ nào nữa

        while (!executor.isTerminated()) {
//            System.out.println(" Đã xử lý hết các request trong queue ");
        }




    }
}
