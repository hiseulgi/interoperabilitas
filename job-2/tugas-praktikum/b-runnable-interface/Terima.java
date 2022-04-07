public class Terima implements Runnable{
  public void run() {
    for(int g=1;g<=10;g++){
      if (g%2==0)
        System.out.println("bilangan genap= "+g);
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println("Selesai");
    }
  }

  public static void main(String[] args) {
    Runnable run= (Runnable) new Terima();

    Thread t1= new Thread(run);
    Thread t2= new Thread(run);

    t1.start();
    t2.start();
  }
}