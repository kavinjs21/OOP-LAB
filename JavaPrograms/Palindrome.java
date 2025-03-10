import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reverseStr = "";
        int strLength = str.length();

        for (int i = strLength - 1; i >= 0; --i) {
            reverseStr += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }

        scanner.close();
    }
}
