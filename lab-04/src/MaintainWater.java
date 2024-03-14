import java.util.Scanner;

public class MaintainWater {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int j = 0; j < length; j++) {
            arr[j] = sc.nextInt();
        }
        int waterArea = 0;
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int j = 1; j < arr.length; j++) {
            leftMax[j] = Math.max(leftMax[j - 1], arr[j]);
        }
        for (int j = arr.length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }
        for (int j = 0; j < arr.length; j++) {
            waterArea += Math.min(leftMax[j], rightMax[j]) - arr[j];
        }
        System.out.println(waterArea);
    }
}
