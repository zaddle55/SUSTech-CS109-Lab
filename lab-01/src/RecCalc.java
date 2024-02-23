import java.util.Scanner;
public class RecCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, width, area, perimeter;
        System.out.print("Enter height of rectangle: ");
        height = sc.nextDouble();
        System.out.print("\nEnter width of rectangle: ");
        width = sc.nextDouble();
        area = height * width;
        perimeter = 2 * (height + width);
        System.out.printf("Area of rectangle: %.2f\n", area); // output in two decimal places
        System.out.printf("Perimeter of rectangle: %.2f\n", perimeter);
    }

}