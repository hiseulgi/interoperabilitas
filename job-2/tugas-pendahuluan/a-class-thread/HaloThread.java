import java.util.logging.Level;
import java.util.logging.Logger;

class HaloThread extends Thread {
  String s;

  public HaloThread(String ss) {
    this.s = ss;
  }

  @Override
  public void run(){
    for (int i = 0; i < 10; i++) {
      System.out.println(s + " " + i + " : Haloo");
      try{
        sleep(300);
      }
      catch (InterruptedException ex){
        Logger.getLogger(HaloThread.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
  public static void main(String[] args) {
    HaloThread h1 = new HaloThread(" TH1 ");
    HaloThread h2 = new HaloThread(" TH2 ");
    HaloThread h3 = new HaloThread(" TH3 ");
    h1.start();
    h2.start();
    h3.start();
  }
}
