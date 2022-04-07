public class Kirim extends Thread {
  int threadNumber;

  public Kirim (int num) {
    threadNumber = num;
  }

  public void run() {
    for(int g=1;g<=10;g+=2){
      if (g%2!=0)
        System.out.println("bilangan ganjil= "+g);
      }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println(threadNumber + "Selesai");
    }
  }
  public static void main(String[] args) {
    Thread t1= new Kirim(1);
    Thread t2= new Kirim(2);
    Thread t3= new Kirim(3);
    Thread t4= new Kirim(4);
    Thread t5= new Kirim(5);
    Thread t6= new Kirim(6);
    Thread t7= new Kirim(7);
    Thread t8= new Kirim(8);
    Thread t9= new Kirim(9);
    Thread t10= new Kirim(10);
    
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