import java.io.File;

public class RenameFile {

  public static void main(String[] args) {
    File newFile = new File("bagus.txt");
    File renFile = new File("baguskedua.txt");
    
    if (newFile.renameTo(renFile)) {
      System.out.println(newFile.getName() + " diubah menjadi " + renFile.getName());
      System.out.println("Berhasil!");
    }

    else {
      System.out.println("Gagal Rename");
    }
  }
}