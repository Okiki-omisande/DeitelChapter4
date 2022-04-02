
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Counter = 1;
        int Number;
        int Largest = 0;

        System.out.print("Enter a number or (-1 to Quit):");
        Number = input.nextInt();

        while (Number != -1 && Counter <= 10) {
            ++Counter;
            if (Number > Largest)
                Largest = Number;

            System.out.print("Enter a number or (-1 to Quit):");
            Number = input.nextInt();
        }

        if (Counter != 1 )
            System.out.printf("The largest number = %d%n",Largest);

        else
        System.out.println("No input was recorded");



    }
}
