import java.io.File;

public class CekFolder {
  public static void main(String[] args) {
    String FOLDER_FILE = "D:/buku";
    File file = new File(FOLDER_FILE);

    if (file.exists())
      System.out.println("true");
    else
      System.out.println("false");
  }

}