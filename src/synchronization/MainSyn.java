package synchronization;

public class MainSyn {

    public static void main(String[] args) {
        Money  t= new Money(3,7);
        Money  t0= new Money(3,9);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t0);
        t1.setName("thread 1");
        t2.setName("thread 2");
        t1.start();
        t2.start();

    }
}
