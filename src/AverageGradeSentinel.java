//develop a class averaging program that process grade for an arbitrary number of student
import java.util.Scanner;

public class AverageGradeSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initial stage
        int TotalGrade = 0;
        int Counter = 0;

        //process stage
        System.out.print("Enter a grade or -5 to quit:");
        int Grade = input.nextInt();

        while (Grade != -5) {
            TotalGrade = TotalGrade + Grade;
            Counter = 1 + Counter;
            System.out.print("Enter a grade or -5 to quit:");
            Grade = input.nextInt();
        }


        // termination process
        if (Counter != 0) {
            double Average = (double) TotalGrade / Counter;
            System.out.printf("the average of the %d grade(s) entered is %.2f", Counter, Average);
        }

        else {
            System.out.println("No grade was entered");
        }
    }
}