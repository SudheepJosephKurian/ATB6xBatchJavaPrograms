package HW_20042024;

public class HW_001 {
    public static void main(String[] args) {
        // Max between 3 Numbers with ? operators.
        int a = 10;
        int b = 30;
        int c = 20;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);

    }
}
