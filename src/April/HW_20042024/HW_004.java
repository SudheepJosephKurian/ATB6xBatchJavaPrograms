package HW_20042024;

public class HW_004 {
    public static void main(String[] args) {
        double x = 10;
        System.out.println("x = "+x);
        double y = 12.4;
        System.out.println("y = "+y);
        double z = 56.78;
        System.out.println("z = "+z);
        x=x*x;
        y=y*y;
        double result = Math.cbrt(x + y - Math.abs(z));
        System.out.println("New value x = "+x);
        System.out.println("Nwe value y = "+y);
        System.out.println("New value z = "+z);
        System.out.println("Result = " + result);
    }
}