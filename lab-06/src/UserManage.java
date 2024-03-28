import java.util.Scanner;

public class UserManage {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter the number of users:");
        int n = in.nextInt();
        User[] user = new User[n];
        for (int i = 1; i <= n; i++) {
            System.out.printf("Please enter the account name of user %d:", i);
            String name = in.next();
            user[i-1].setAccount(name);
            System.out.printf("Please enter the balance of user %d:", i);
            user[i-1].setMoney(in.nextDouble());
        }
        for (int i = 0; i < n; i++) {
            user[i].introduce();
        }
        in.close();
        
    }
}
