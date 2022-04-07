public class SumOfArray extends Thread {
  int threadNumber;
  int[] arr1, arr2, arr3;
  int total = 0;
  public SumOfArray (int num, int[] arr1, int[] arr2, int[] arr3) {
    this.threadNumber = num;
    this.arr1 = arr1;
    this.arr2 = arr2;
    this.arr3 = arr3;
  }

  public void run() {
    this.total += this.arr1[this.threadNumber-1];
    this.total += this.arr2[this.threadNumber-1];
    this.total += this.arr3[this.threadNumber-1];
    System.out.println("Thread " + this.threadNumber + " = " + this.total);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println(threadNumber + "Selesai");
    }
  }

  public static void main(String[] args) {
    System.out.println("Bagus Adi Prayoga");
    int[] arr1 = {6, 9, 1, 2, 3, 5};
    int[] arr2 = {7, 11, 6, 4, 3, 1};
    int[] arr3 = {5, 4, 3, 2, 1, 12};
    Thread t1= new SumOfArray(1, arr1, arr2, arr3);
    Thread t2= new SumOfArray(2, arr1, arr2, arr3);
    Thread t3= new SumOfArray(3, arr1, arr2, arr3);
    Thread t4= new SumOfArray(4, arr1, arr2, arr3);
    Thread t5= new SumOfArray(5, arr1, arr2, arr3);
    Thread t6= new SumOfArray(6, arr1, arr2, arr3);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
  }
}