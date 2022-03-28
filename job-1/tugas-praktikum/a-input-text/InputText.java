import java.io.*;

public class InputText {
  public static void main(String[] args) throws IOException {
    System.out.println("Masukkan kata dan akhiri dengan 'Exit'");

    InputStreamReader masuk = new InputStreamReader(System.in);
    BufferedReader baca = new BufferedReader(masuk);

    while (true) {
      String konversi = (String) baca.readLine();
      System.out.println("Kata terbaca : " + konversi);

      if (konversi.toLowerCase().equals("exit")) break;
    }

    System.out.println("SELESAI");
  }
}
