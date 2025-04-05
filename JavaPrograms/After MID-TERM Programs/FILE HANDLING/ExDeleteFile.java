// Java program to get file size 
// and file path

import java.io.File;

public class ExDeleteFile {
  public static void main(String args[]) {
    final String fileName = "file3.txt";

    //File class object
    File objFile = new File(fileName);

    //check file is exist or not, if exist delete it
    if (objFile.exists() == true) {
      //file exists
      //deleting the file
      if (objFile.delete()) {
        System.out.println(objFile.getName() + " deleted successfully.");
      } else {
        System.out.println("File deletion failed!!!");
      }
    } else {
      System.out.println("File does not exist!!!");
    }
  }
}
