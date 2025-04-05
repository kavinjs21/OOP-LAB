// Java - Print File Content, Display File

import java.io.*;

public class PrintFile {
  public static void main(String args[]) throws IOException {
    File fileName = new File("d:/sample.txt");

    FileInputStream inFile = new FileInputStream("E:\MyPrograms\java\sample.txt");
    int fileLength = (int) fileName.length();

    byte Bytes[] = new byte[fileLength];

    System.out.println("File size is: " + inFile.read(Bytes));

    String file1 = new String(Bytes);
    System.out.println("File content is:\n" + file1);

    //close file
    inFile.close();
  }
}
