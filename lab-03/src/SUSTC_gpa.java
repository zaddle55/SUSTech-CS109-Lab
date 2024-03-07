import java.util.Scanner;

public class SUSTC_gpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.close();
        switch (grade / 10) {
            case 10:
                System.out.println(4.0);
                break;
            case 9:
                System.out.println(4.0);
                break;
            case 8:
                System.out.println(3.0);
                break;
            case 7:
                System.out.println(2.0);
                break;
            case 6:
                System.out.println(1.0);
                break;
            default:
                System.out.println(0);
                break;
        }
    }
}
