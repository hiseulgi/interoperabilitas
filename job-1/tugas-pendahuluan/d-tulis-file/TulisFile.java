import java.io.*;

public class TulisFile {
  public static void main(String[] args) {
    FileOutputStream out = null;
    String data = "semangat cugabbb";

    // buka file
    try {
      out = new FileOutputStream("about.txt");
    } catch (FileNotFoundException fn) {
      System.out.println("File tidak ditemukan");
    }

    // menulis data ke file
    try {
      for (int i = 0; i < data.length(); i++) {
        out.write((int) data.charAt(i));
      }
    } catch (IOException io) {
      System.out.println(io.getMessage());
    }

    // tutup file
    try {
      out.close();
    } catch (IOException eo) {
    }
  }
}
