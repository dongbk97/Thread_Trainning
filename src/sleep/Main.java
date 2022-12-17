package sleep;

import sleep.CustomThread;
import sleep.CustomThread2;

public class Main {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread();
        CustomThread2 t2 = new CustomThread2();
        t1.start();
        t2.start();

    }
}
