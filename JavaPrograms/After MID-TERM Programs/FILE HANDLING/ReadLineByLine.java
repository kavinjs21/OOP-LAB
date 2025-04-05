import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineByLine {
  public static void main(String[] args) {
    // create object of scanner class.
    Scanner Sc = new Scanner(System.in);

    // enter file name.
    System.out.print("Enter the file name:");
    String sfilename = Sc.next();
    Scanner Sc1 = null;
    FileInputStream fis = null;
    try {
      FileInputStream FI = new FileInputStream(sfilename);
      Sc1 = new Scanner(FI);

      // this will read data till the end of data.
      while (Sc1.hasNext()) {
        String data = Sc1.nextLine();

        // print the data.
        System.out.print("The file data is : " + data);
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }}
