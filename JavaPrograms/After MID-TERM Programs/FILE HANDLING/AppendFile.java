import java.io.*;

public class AppendFile {
  public static void main(String[] args) {
    String strFilePath = "E:/JAVA/IncludeHelp.txt";

    try {
      FileOutputStream fos = new FileOutputStream(strFilePath, true);

      String strContent = "Text to be appended.";

      fos.write(strContent.getBytes());

      fos.close();
      System.out.println("Content Successfully Append into File...");
    } catch (FileNotFoundException ex) {
      System.out.println("FileNotFoundException : " + ex.toString());
    } catch (IOException ioe) {
      System.out.println("IOException : " + ioe.toString());
    } catch (Exception e) {
      System.out.println("Exception: " + e.toString());
    }
  }
}
