import java.io.*;
import java.util.*;

public class CopyFile {

  public static void copyContent(File a, File b)
      throws Exception {
    FileInputStream in = new FileInputStream(a);
    FileOutputStream out = new FileOutputStream(b);

    try {

      int n;

      while ((n = in.read()) != -1) {
        out.write(n);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
    System.out.println("File Berhasil di Copy!");
  }

  public static void main(String[] args) throws Exception {
    // file asli
    File x = new File("fileAsli.txt");

    // file hasil copy
    File y = new File("fileKedua.txt");

    copyContent(x, y);
  }
}