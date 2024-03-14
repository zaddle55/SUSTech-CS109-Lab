import java.util.Scanner;

public class CountTimes {
    // main function
    public static void main(String[] args) {
        int i = 1; // ignore the existence of 0
        int[] arr = new int[1024];
        input(arr);
        int[] freq = new int[101]; // define an array to store the frequency of each element(1~100)
        for (int j = 0; j < arr.length; j++){
            freq[arr[j]]++; // count the frequency of each element and store it in ref
        }
        while(i < 101){
            if (freq[i] != 0){ // ignore the element with frequency 0
                System.out.printf("%d occurs %d times\n", i, freq[i]);
            }
            i++;
        }
    }

    // input function
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
