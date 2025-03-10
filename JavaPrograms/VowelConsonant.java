import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read the first character input

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else if (Character.isLetter(ch)) { // Check if it's a letter
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println("Invalid input! Please enter an alphabetic character.");
        }

        scanner.close();
    }
}
