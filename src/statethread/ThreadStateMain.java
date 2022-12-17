package statethread;

import java.util.Scanner;

public class ThreadStateMain {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(" nhập và số tiền cần rút: ");
        int rut= sc.nextInt();



        ThreadState threadState = new ThreadState(rut);

        Thread thread2 = new Thread(threadState);
        Thread thread1 = new Thread(threadState);
        thread1.setName("thread 1");
        thread2.setName("thread 2");
        thread1.start();
        thread2.start();
//        System.out.println(" State of " + thread1.getName() + " : " + thread1.getState());
//        System.out.println(" State of " + thread2.getName() + " : " + thread2.getState());


    }
}
