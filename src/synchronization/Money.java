package synchronization;

public class Money implements Runnable {

    private static int tien = 100;
    private int a;
    private int b;

    public Money(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public synchronized static void rutien() {

        if (tien > 2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tien = tien - 100;
            System.out.println(Thread.currentThread().getName() + " " + tien);
        } else
            System.out.println(Thread.currentThread().getName() + " " + "Khong con tien");
    }

    public  void add() {
        int x = a++;
        int y = b++;
        System.out.println(x + y);
    }


    @Override
    public void run() {
        add();
    }
}
