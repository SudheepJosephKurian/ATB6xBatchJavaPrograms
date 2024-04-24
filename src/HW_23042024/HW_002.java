package HW_23042024;
// Largest in Three Number
import java.util.Scanner;

public class HW_002 {
    public static void main(String[] args) {
        System.out.println("Enter num 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();

        System.out.println("Enter num 3");
        int num3 = sc.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("Max by Math.max func() " + max);

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Max is -> " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Max is -> " + num2);
        } else {
            System.out.println("Max is -> " + num3);
        }

        sc.close();
    }
}
