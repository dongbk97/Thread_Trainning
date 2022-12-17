package thread;

import java.util.Random;

public class ThreadRandom implements Runnable {
    private String name;
    private int count = 0;
    private int a;
    private int m;
    private boolean check = false;

    public ThreadRandom(int m) {
        this.m = m;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (!check) {
            Random random = new Random();
            a = random.nextInt(100);
            count++;
            if (isCheck()) {
                System.out.println(" số lần random là : " + count + " với : " + Thread.currentThread().getName());
                break;
            } else
                System.out.println(Thread.currentThread().getName() + " đoán số " + a);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void end() {
        check = true;
    }

    public boolean isCheck() {

        if (a == m) {
            return true;
        } else
            return false;
    }
}
