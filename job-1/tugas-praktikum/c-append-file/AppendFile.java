import java.io.*;
import java.util.Vector;
import java.util.Enumeration;

public class AppendFile {
  public static void main(String[] args) throws IOException {
    FileInputStream fileInputStream1 = null;
    FileInputStream fileInputStream2 = null;
    FileOutputStream fileOutputStream = null;
    SequenceInputStream sequenceInputStream = null;

    try {
      fileInputStream1 = new FileInputStream("file1.txt");
      fileInputStream2 = new FileInputStream("file2.txt");
      fileOutputStream = new FileOutputStream("outputfile.txt");
      Vector<FileInputStream> vector = new Vector<FileInputStream>();

      vector.add(fileInputStream1);
      vector.add(fileInputStream2);

      Enumeration<FileInputStream> enumeration = vector.elements();
      sequenceInputStream = new SequenceInputStream(enumeration);

      int i;
      while ((i = sequenceInputStream.read()) != -1) {
        fileOutputStream.write(i);
      }

      System.out.println("Berhasil menggabungkan 2 file menjadi 1.");
    }

    finally {
      if (fileInputStream1 != null) {
        fileInputStream1.close();
      }

      if (fileInputStream2 != null) {
        fileInputStream2.close();
      }

      if (fileOutputStream != null) {
        fileOutputStream.close();
      }

      if (sequenceInputStream != null) {
        sequenceInputStream.close();
      }
    }
  }
}