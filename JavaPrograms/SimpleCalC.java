import java.util.Scanner;

class SimpleCalC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        System.out.println("Enter first number:");
        double number1 = input.nextDouble();

        System.out.println("Enter second number:");
        double number2 = input.nextDouble();

        double result;

        if (operator == '+') {
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        } else if (operator == '/') {
            if (number2 != 0) {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        input.close();
    }
}
