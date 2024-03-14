import java.util.Scanner;
public class CountTimes {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[1024];
        input(arr);
        int[] ref = new int[101];
        while(i < arr.length){
            ref[arr[i]]++;
            i++;
        }
        i = 1;
        while(i < 101){
            if (ref[i] != 0){
                System.out.printf("%d occurs %d times\n", i, ref[i]);
            }
            i++;
        }
    }
    public static void input(int[] arr){
        int temp, i = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            temp = sc.nextInt();
            if (temp!=0){
                arr[i] = temp;
                i++;
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
