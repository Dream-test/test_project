import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    private static int a;
    private static int b;

    // This is new branch
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        a = in.nextInt();
        System.out.println("Enter second number");
        b = in.nextInt();
        System.out.println("Enter operation: +, -, *, /");
        char operation = in.next().charAt(0);
        switch (operation) {
            case '+': System.out.println("Result = " + (a + b));
            break;
            case '-': System.out.println("Result = " + (a - b));
            break;
            case '*': System.out.println("Result = " + (a * b));
            break;
            case '/': System.out.println("Result = " + (a / b));
            break;
            default: System.out.println("Error operation");
        }
    }
}