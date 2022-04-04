import java.util.Scanner;
public class SalaryDeterminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TotalSells = 0;
        double Total = 0;
        double SellsPersonSalary;
        int Counter = 0;

        System.out.print("Enter the item sold (1-4) or 0 to quit:");
        int Itemsold = input.nextInt();

        while (Itemsold != 0) {
            System.out.print("Enter quantity of item sold:");
            int Quantity = input.nextInt();

            ++Counter;
            if (Itemsold == 1)
                Total = 239.99 * Quantity;

            else if (Itemsold == 2)
                Total = 129.75 * Quantity;

            else if (Itemsold == 3)
                Total = 99.95 * Quantity;

            else if (Itemsold == 4)
                Total = 350.89 * Quantity;

            else
                System.out.println("Enter a valid entry (1-4)");

            TotalSells += Total;

            System.out.println();
            System.out.print("Enter the item sold (1-4) or 0 to quit:");
            Itemsold = input.nextInt();
        }

            System.out.println();
        if (Counter != 0) {
            SellsPersonSalary = (TotalSells * 0.09) + 200;
            System.out.println("The salesperson's salary is $" + SellsPersonSalary);
        }
        else
            System.out.println("No value was entered");


    }
}
