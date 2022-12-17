package thread;

import java.util.Scanner;

public class ThreadMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhập số bất kỳ : ");
        int m = scanner.nextInt();
        ThreadRandom random= new ThreadRandom(m);
        ThreadRandom count = new ThreadRandom(m);

        Thread thread1 = new Thread(count);
        Thread thread2 = new Thread(random);
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread1.start();
        thread2.start();
    }
}
