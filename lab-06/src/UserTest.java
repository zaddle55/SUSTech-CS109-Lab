import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Lucy");
        Scanner in = new Scanner(System.in);
        user.setPassword("123456");
        user.setMoney(1000);
        System.out.println(user.getPassword());
        user.introduce();
        user.expense(2000, in);
        user.expense(500, in);
        user.income(1000);
        in.close();
    }
}
