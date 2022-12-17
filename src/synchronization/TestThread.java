package synchronization;

public class TestThread implements Runnable {
    private int name;

    public TestThread() {
        this.name = 100;
    }


    @Override
    public void run() {
        Money.rutien();
//          if(this.name>2)  {
//              try {
//                  Thread.sleep(1000);
//              } catch (InterruptedException e) {
//                  throw new RuntimeException(e);
//              }
//              name=name-100;
//              System.out.println(Thread.currentThread().getName()+" "+  name);
//          }else
//              System.out.println(Thread.currentThread().getName()+" "+"Khong con tien");
    }
}

