
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initial stage
        int Counter = 0;
        double MPG;
        double Total = 0;

        //process stage
        System.out.print("Enter miles driven or -1 to stop:");
        int M = input.nextInt();//stores mile driven value


        while (M != -1) {

            System.out.print("Enter gallon:");
            int G = input.nextInt();//stores gallon value

            System.out.println();

            ++Counter;//added 1 to counter
            MPG = (double) M*1.609 / (G*3.785);//converted miles(M) to km and gallon(G) to litres using US value of (1 gallon = 3.785L).
            System.out.printf("The MPG for this trip is:%.2f%n", MPG);
            Total= MPG + Total;

            System.out.println();

            System.out.print("Enter miles driven or -1 to stop:");
            M = input.nextInt();

            System.out.println();
        }

        //termination stage
        if (Counter != 0){
        System.out.println("The total MPG of this Journey is:" +Total);

        double Average =  Total/Counter;
        System.out.printf("The average MPG is:%.2f%n", Average);
        }

        else
        System.out.println("No value was entered");
    }
}
