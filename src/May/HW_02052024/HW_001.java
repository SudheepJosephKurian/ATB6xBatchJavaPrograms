package HW_02052024;

import java.util.Scanner;

public class HW_001 {
    public static void main(String[] args) {
        //Create a Program which takes arrays and print all the marks.
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter Sub 1 Marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter Sub 2 Marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter Sub 3 Marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter Sub 4 Marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter Sub 5 Marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
