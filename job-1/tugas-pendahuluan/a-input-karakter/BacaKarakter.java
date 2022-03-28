import java.io.*;

public class BacaKarakter{
  public static void main (String[] args) {
    char c;
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Masukkan karakter dan akhiri dengan '.\'");
      do {
        c = (char) br.read();
        System.out.println("Karakter terbaca : " + c);
      } while (c != '.');
    } catch (Exception e) {
      System.out.print("ada error IO");
      System.exit(0);
    }
  }
}