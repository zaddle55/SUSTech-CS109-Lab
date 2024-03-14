import java.util.Scanner;
public class Printlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length of the myList: ");
        System.out.println();
        int length = sc.nextInt();
        System.out.printf("Enter %d values: ", length);
        double[] myList = new double[length];
        for (int i = 0; i < length; i++) {
            myList[i] = sc.nextDouble();
        }
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
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", reverse[i]);
        }
        System.out.printf("myList2:");
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", myList[i]);
        }
        System.out.printf("myList3:");
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", sum[i]);
        }
    }
}
