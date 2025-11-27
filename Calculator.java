import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- Simple Calculator ----");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("+  Addition");
        System.out.println("-  Subtraction");
        System.out.println("*  Multiplication");
        System.out.println("/  Division");
        System.out.print("Enter operator: ");

        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        System.out.println("\nResult: " + result);
        sc.close();
    }
}
//
C:\xxxxxxxxxxxxxxxxx>javac Calculator.java

C:\xxxxxxxxxxxxxxxxx>java Calculator
---- Simple Calculator ----
Enter first number: 5+24
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:964)
        at java.base/java.util.Scanner.next(Scanner.java:1619)
        at java.base/java.util.Scanner.nextDouble(Scanner.java:2590)
        at Calculator.main(Calculator.java:11)

C:\xxxxxxxxxxxxxxxxx>java Calculator
---- Simple Calculator ----
Enter first number: 566
Enter second number: 344

Choose an operation:
+  Addition
-  Subtraction
*  Multiplication
/  Division
Enter operator: *

Result: 194704.0

C:\xxxxxxxxxxxxxxxxx>//