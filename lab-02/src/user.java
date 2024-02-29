import java.util.Scanner;

public class user {

    public String name;
    public int age;

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(name + "的年龄是" + age);
    }

    public static void main(String[] args) {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        name = sc.next();
        user u = new user(name, age);
        u.print();
        sc.close();
    }
}
