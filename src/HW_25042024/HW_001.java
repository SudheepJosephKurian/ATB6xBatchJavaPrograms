package HW_25042024;
import java.util.Scanner;
public class HW_001 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter first number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                return;
            }
            int input1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                return;
            }
            int input2 = scanner.nextInt();

            System.out.print("Enter the operation (+, *, /, %, -): ");
            char operation;
            String operationInput = scanner.next();
            if (operationInput.length() != 1 || "+-*/%".indexOf(operationInput.charAt(0)) == -1) {
                System.out.println("Invalid operation! Please enter one of: +, -, *, /, %.");
                return;
            }
            operation = operationInput.charAt(0);

            // Declaring result variable outside the switch statement
            int result;

            // Performing arithmetic operation based on user input
            switch (operation) {
                case '+':
                    result = input1 + input2;
                    break;
                case '-':
                    result = input1 - input2;
                    break;
                case '*':
                    result = input1 * input2;
                    break;
                case '/':
                    if (input2 == 0) {
                        System.out.println("Division by zero is not allowed!");
                        return;
                    }
                    result = input1 / input2;
                    break;
                case '%':
                    result = input1 % input2;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return; // Exit the program if operation is invalid
            }

            System.out.println("Result: " + result);
            scanner.close();
        }
    }