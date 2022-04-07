public class TestThread implements Runnable {
  String s;

  public TestThread(String ss) {
    this.s = ss;
  }

  @Override
  public void run() {
    
    for (int i = 0; i < 5; i++) {
      System.out.println(s + " : ke-" + i);
    }
  }

  public static void main(String[] args) {
    TestThread ex1 = new TestThread(" TH1 ");
    TestThread ex2 = new TestThread(" TH2 ");
    Thread t1 = new Thread(ex1);
    Thread t2 = new Thread(ex2);
    t1.start();
    t2.start();
  }
}