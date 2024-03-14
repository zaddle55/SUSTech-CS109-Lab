import java.util.Scanner;
public class GetGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of subjects: ");
        int cNum = sc.nextInt();
        System.out.println();
        System.out.printf("Enter the number of students: ");
        int sNum = sc.nextInt();
        System.out.println();
        int[][] grades = new int[sNum][cNum];
        for (int i = 0; i < sNum; i++) {
            for (int j = 0; j < cNum; j++) {
                grades[i][j] = sc.nextInt();
            }
        }
        sc.close();
        double[] sAvg = new double[sNum];
        for (int i = 0; i < sNum; i++) {
            int sum = 0;
            for (int j = 0; j < cNum; j++) {
                sum += grades[i][j];
            }
            sAvg[i] = sum / cNum;
        }

        double[] cAvg = new double[cNum];
        for (int i = 0; i < cNum; i++) {
            int sum = 0;
            for (int j = 0; j < sNum; j++) {
                sum += grades[j][i];
            }
            cAvg[i] = sum / sNum;
        }

        System.out.printf("\t\t");
        for (int i = 0; i < cNum; i++){
            System.out.printf("Course%d\t", i + 1);
        }
        System.out.printf("Average\n");

        for (int i = 0; i < sNum; i++) {
            System.out.printf("Student%d\t", i + 1);
            for (int j = 0; j < cNum; j++) {
                System.out.printf("%d\t", grades[i][j]);
            }
            System.out.printf("%.2f\n", sAvg[i]);
        }

        System.out.printf("Average\t\t");
        for (int i = 0; i < cNum; i++) {
            System.out.printf("%.2f\t", cAvg[i]);
        }

    }
}
