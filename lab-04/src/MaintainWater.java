import java.util.Scanner;

public class MaintainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int j = 0; j < length; j++) {
            arr[j] = sc.nextInt();
        }
        sc.close();
        int waterArea = 0;
        int[] leftMax = new int[arr.length]; // define an array to store the maximum value of the left side of each element
        int[] rightMax = new int[arr.length]; // define an array to store the maximum value of the right side of each element
        leftMax[0] = arr[0]; // initialize the first element of leftMax
        rightMax[arr.length - 1] = arr[arr.length - 1]; // initialize the last element of rightMax
        // calculate the maximum height of the left side of each element
        for (int j = 1; j < arr.length; j++) {
            leftMax[j] = Math.max(leftMax[j - 1], arr[j]);
        }
        // calculate the maximum height of the right side of each element
        for (int j = arr.length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }
        // calculate the water area
        for (int j = 0; j < arr.length; j++) {
            waterArea += Math.min(leftMax[j], rightMax[j]) - arr[j];
        }
        System.out.println(waterArea);
    }
}
