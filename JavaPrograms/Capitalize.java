import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = scanner.nextLine();

        if (!name.isEmpty()) {
            String firstLetter = name.substring(0, 1).toUpperCase();
            String remainingLetters = name.substring(1);
            name = firstLetter + remainingLetters;
        }

        System.out.println("Capitalized String: " + name);
        scanner.close();
    }
}
