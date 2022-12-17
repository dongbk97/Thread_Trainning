package threadpoolexcutor;

public class ThreadCount implements Runnable{

private String name;
private  int a;
    public ThreadCount(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" Start processing ...");
            Thread.sleep(400);

            System.out.println(Thread.currentThread().getName()+" End processing .");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
