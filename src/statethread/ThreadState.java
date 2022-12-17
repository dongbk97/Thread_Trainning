package statethread;

public class ThreadState implements Runnable {
    private int sotienrut;

    public ThreadState(int sotienrut) {
        this.sotienrut = sotienrut;
    }

    @Override
    public void run() {
        Test.test(sotienrut);

    }


}
