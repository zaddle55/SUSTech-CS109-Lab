/*
 * @Author: zaddle55 chenyifan20050115@126.com
 * @Date: 2024-03-28 11:02:08
 * @LastEditors: zaddle55 chenyifan20050115@126.com
 * @LastEditTime: 2024-03-28 11:45:00
 * @FilePath: \lab-06\src\User.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
import java.util.Scanner;
/**
 * @description: User类
 * @return {*}
 */
public class User {

    private String account;
    private String password;
    private double money;

    public User(String name) {
        this.account = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public String getAccount(){
        return this.account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getMoney(){
        return this.money;
    }

    public void introduce() {
        System.out.printf( "%s's account has a balance of %.2f dollar.\n", account, money);
    }
    public void expense(double value, Scanner in) {
        System.out.printf("Plan to spend %.2f dollar.\n", value);
        if (value > this.money) {
            System.out.println("You don't have enough money.");
            return;
        }
        System.out.println("Please enter your password:");
        if (in.next().equals(this.password)) {
            this.money -= value;
            System.out.printf("Expense %.2f dollar and balance is %.2f.\n", value, this.money);
        } else {
            System.out.println("Password is wrong.");
        }
    }
    public void income(double value) {
        this.money += value;
        System.out.printf("Got %.2f dollar income ,balance is %.2f dollar.\n", value, this.money);
    }
}
