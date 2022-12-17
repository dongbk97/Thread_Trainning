package statethread;

import java.util.Scanner;

public class Test {
    private static int s = 100;

    public static int getS() {
        return s;
    }

    public static void setS(int s) {
        Test.s = s;
    }

    public  static void test(int rut) {
        if (check(rut)) {
            s=s-rut;
            System.out.println(Thread.currentThread().getName() +" Số tiền còn lại là: "+ s);
//            System.out.println(Thread.currentThread().getName() + " gia trị s= " + Test.getS());
        }else
            System.out.println(Thread.currentThread().getName() +" Tiền không đủ");

//        System.out.println(Thread.currentThread().getName() + " gia trị s= " + Test.getS());

        }
        public static boolean check ( int m){

            if (s < m) {
                return false;
            } else
                return true;
        }

    }
