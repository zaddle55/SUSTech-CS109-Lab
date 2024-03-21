import java.util.Scanner;
public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input two numbers for bottom and height:");
        double a = input.nextDouble();
        if (a == -1){
            System.out.println("Bye~");
            input.close();
            return;
        }
        double b = input.nextDouble();
        System.out.printf("The area is %.3f.\n", area(a, b));

        System.out.println("Please input three numbers for a and b:");
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("Please input a number in (0, 180) for angle (angle is int)");
        int c = input.nextInt();
        System.out.printf("The area is %.3f.", area(a, b, c));
        input.close();
    }
    public static double area(double bottom, double height) {
        return bottom * height / 2;
    }
    public static double area(double a, double b, int angleOfAandB) {
        return a * b * Math.sin(Math.toRadians(angleOfAandB)) / 2;
    }
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

