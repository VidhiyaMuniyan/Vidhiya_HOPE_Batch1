package Day_3;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            case '%':
                System.out.println("Modulus: " + (a % b));
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
