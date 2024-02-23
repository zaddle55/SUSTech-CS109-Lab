import java.util.Scanner;
public class TimeConventer {
    public static void main(String[] args) {
        int seconds, minutes, hours;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;
        System.out.printf("The equalivant time is %d hours %d minutes %d seconds", hours, minutes, seconds);
    }
}
