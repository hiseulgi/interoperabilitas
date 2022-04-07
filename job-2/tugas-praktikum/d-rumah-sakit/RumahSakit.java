public class RumahSakit extends Thread {
  int threadNumber;
  public RumahSakit (int num) {
    threadNumber = num;
  }

  public void run() {
    System.out.println("Dokter 1 menangani pasien-"+threadNumber);
    try {
    Thread.sleep(1000);
    } catch (InterruptedException ex) {
    System.out.println(threadNumber + "Selesai");
    }

    if (threadNumber <= 5)
      System.out.println("Perawat 1 menangani pasien-"+threadNumber);
    else
      System.out.println("Perawat 2 menangani pasien-"+threadNumber);

    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println(threadNumber + "Selesai");
    }
    System.out.println("Pasien ke-"+threadNumber+" membayar dikasir 1");
  }

  public static void main(String[] args) {
  Thread t1= new RumahSakit(1);
  Thread t2= new RumahSakit(2);
  Thread t3= new RumahSakit(3);
  Thread t4= new RumahSakit(4);
  Thread t5= new RumahSakit(5);
  Thread t6= new RumahSakit(6);
  Thread t7= new RumahSakit(7);
  Thread t8= new RumahSakit(8);
  Thread t9= new RumahSakit(9);
  Thread t10= new RumahSakit(10);

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