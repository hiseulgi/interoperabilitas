public class Kirim implements Runnable{
  public void run() {
    for(int g=1;g<=10;g+=2){
      if (g%2!=0)
        System.out.println("bilangan ganjil= "+g);
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println("Selesai");
    }
  }

  public static void main(String[] args) {
    Runnable run= (Runnable) new Kirim();

    Thread t1= new Thread(run);
    Thread t2= new Thread(run);

    t1.start();
    t2.start();
  }
}