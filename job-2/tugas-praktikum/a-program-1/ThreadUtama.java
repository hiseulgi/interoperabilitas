public class ThreadUtama extends Thread {
  int threadNumber;
    public ThreadUtama (int num) {
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
    Thread t11= new Kirim(1);
    Thread t12= new Kirim(2);
    Thread t13= new Kirim(3);
    Thread t14= new Kirim(4);
    Thread t15= new Kirim(5);
    Thread t16= new Kirim(6);
    Thread t17= new Kirim(7);
    Thread t18= new Kirim(8);
    Thread t19= new Kirim(9);
    Thread t20= new Kirim(10);

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
    t11.start();
    t12.start();
    t13.start();
    t14.start();
    t15.start();
    t16.start();
    t17.start();
    t18.start();
    t19.start();
    t20.start();
  }
}