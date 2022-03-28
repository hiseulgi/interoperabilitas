import java.io.*;

public class BacaString {
  public static void main(String[] args) throws IOException{
    System.out.println("Masukkan Sembarang karakter");
    InputStreamReader masuk = new InputStreamReader(System.in);
    BufferedReader baca = new BufferedReader(masuk);
    String konversi = (String)baca.readLine();
    System.out.println("String yang dimasukkan yaitu " + konversi);
  }
}
