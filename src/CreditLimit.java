import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number or (-1 to Cancel):");
        int AccountNo = input.nextInt();
        System.out.println();

        while (AccountNo != -1) {
            System.out.print("Enter balance at the beginning of the month:$");
            int BeginningBalance = input.nextInt();
            System.out.println();

            System.out.print("Total item charged this month:$");
            int Charge = input.nextInt();
            System.out.println();

            System.out.print("Total credit applied:$");
            int Credit = input.nextInt();
            System.out.println();

            System.out.print("Enter credit limit:$");
            int CreditLimit = input.nextInt();
            System.out.println();

            int NewBalance = (BeginningBalance + Charge) - Credit;

            System.out.printf("Account:%d%n", AccountNo);
            System.out.printf("CreditLimit:$%d%n", CreditLimit);
            System.out.printf("New balance:%d", NewBalance);
            System.out.println();

            if (NewBalance > CreditLimit)
                System.out.println("Credit limit exceeded");

            System.out.println();
            System.out.print("Enter account number or (-1 to Cancel):");
             AccountNo = input.nextInt();

        }

        System.out.println("No input was recorded");
    }
}