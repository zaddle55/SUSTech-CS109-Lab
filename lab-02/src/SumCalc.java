import java.util.Scanner;
public class SumCalc {
    public static void main(String[] args) {
        int sum = 0, i = 0, temp;
        Scanner sc = new Scanner(System.in);
        while (true){
            if (sc.hasNextInt()){
                temp = sc.nextInt();

                if (temp != -1){
                    sum += temp;
                }
                else{
                    break;
                
                }
            }
            else{
                System.out.println("error!");
                break;
            }
            i++;
        }
        sc.close();
        System.out.println(sum);
    }
}
