public class Terima extends Thread {
  int threadNumber;
  public Terima (int num) {
    threadNumber = num;
  }
  public void run() {
    for(int g=1;g<=10;g++){
      if (g%2==0)
        System.out.println("bilangan genap= "+g);
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println(threadNumber + "Selesai");
    }
  }
  public static void main(String[] args) {
    Thread t1= new Terima(1);
    Thread t2= new Terima(2);
    Thread t3= new Terima(3);
    Thread t4= new Terima(4);
    Thread t5= new Terima(5);
    Thread t6= new Terima(6);
    Thread t7= new Terima(7);
    Thread t8= new Terima(8);
    Thread t9= new Terima(9);
    Thread t10= new Terima(10);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    t9.start();
    t10.start();
  }
}