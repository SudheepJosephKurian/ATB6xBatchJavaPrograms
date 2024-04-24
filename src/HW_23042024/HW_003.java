package HW_23042024;
// Check char is vowel, consonant.
import java.util.Scanner;

public class HW_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }

        scanner.close();
    }
}