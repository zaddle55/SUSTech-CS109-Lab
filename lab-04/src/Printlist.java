import java.util.Scanner;
public class Printlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length of the myList: ");
        int length = sc.nextInt();
        System.out.println();
        System.out.printf("Enter %d values: ", length);
        double[] myList = new double[length];
        for (int i = 0; i < length; i++) {
            myList[i] = sc.nextDouble();
        }
        sc.close();
        System.out.println();
        double reverse[] = new double[length];
        for (int i = 0; i < length; i++) {
            reverse[i] = myList[length - 1 - i];
        }
        double sum[] = new double[length];
        for (int i = 0; i < length; i++) {
            sum[i] = myList[i] + reverse[i];
        }
        System.out.printf("myList1:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%f ", reverse[i]);
        }
        System.out.println();
        System.out.printf("myList2:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%f ", myList[i]);
        }
        System.out.println();
        System.out.printf("myList3:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%f ", sum[i]);
        }
        System.out.println();

    }
}
