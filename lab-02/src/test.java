import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("输入错误");
            return;
        } finally {
            sc.close();
        }
        if (n <= 100){
            if (n % 2 == 1){
                System.out.println(n * 2);
            }
            else{
                System.out.println(n - 1);
            }
        } 
        else {
            System.out.println(n + 1);
        }
    }

}
