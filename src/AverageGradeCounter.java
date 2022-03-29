import java.util.Scanner;

public class AverageGradeCounter {
    public static void main(String[] args) {
        int GradeCounter = 1;
        int Total = 0;

        while (GradeCounter <= 10) {
            System.out.print("Enter student grade: ");
            Scanner input = new Scanner(System.in);
            int Grade = input.nextInt();
             Total = Total + Grade;
             GradeCounter = 1 + GradeCounter;
        }

        int Average = Total / 10;
        System.out.printf("Total student is %d%n", Total);
        System.out.printf("Average score of student is %d", Average);

    }
}