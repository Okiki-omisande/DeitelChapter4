//nested control statement
import java.util.Scanner;

public class ExamAnalysis {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        //initial stage
        int Passes = 0;
        int Failures = 0;
        int Counter =1;
        String msg1 = ("Enter result (1 for pass or 2 for failed):");

        //process stage
        while(Counter <= 10){
            System.out.print(msg1);
            int Result = entry.nextInt();
            if (Result == 1)
                Passes = 1 + Passes;
            else
              Failures = 1 + Failures;
              Counter = Counter + 1;
        }
         //termination process
        System.out.printf("%n%d student(s) passed while %d student(s) failed%n", Passes, Failures);
        if (Passes > 8)
            System.out.println("Bonus to Teacher!");
    }

}
