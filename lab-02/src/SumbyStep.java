import java.util.Scanner;

public class SumbyStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, i = 0;
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("输入错误");
            return;
        } finally {
            sc.close();
        }
        while (i < n){
            i++;
            sum +=i;
        }
        System.out.println(sum);
    }
}
