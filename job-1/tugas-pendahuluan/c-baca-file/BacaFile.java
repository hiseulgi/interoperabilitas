import java.io.*;

public class BacaFile {
  public static void main(String[] args) {
    FileInputStream input = null;
    int data;

    // membuka file
    try {
      input = new FileInputStream("bacalah.txt");
    } catch (FileNotFoundException fn) {
      System.out.println("File tidak ditemukan!");
    }

    // print char
    try {
      while((data = input.read()) != -1){
        System.out.println((char) data);
      }
      System.out.println();
    } catch (IOException in) {
      System.out.println(in.getMessage());
    }

    // menutup file
    try {
      input.close();
    } catch (IOException e) {
    }
  }
}
