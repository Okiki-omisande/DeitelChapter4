import java.util.Scanner;
public class HourlyRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double HourWorked;
        double HourlyRate;
        double Pay;
        int Counter = 1;

        System.out.print("Enter hours worked or (-1 to CANCEL):");
        HourWorked = input.nextInt();

        while (HourWorked != -1 && Counter <= 3) {
            System.out.print("Enter hourly rate:");
            HourlyRate = input.nextInt();
            System.out.println();
            ++Counter;


            if (HourWorked <= 40) {
                Pay = HourWorked * HourlyRate;
                System.out.printf("Employee's pay =$%.2f", Pay);
            }

             if (HourWorked > 40) {
                Pay = (40 * HourlyRate) + ((HourWorked - 40) * (HourlyRate / 2));
                System.out.printf("Employee's pay =$%.2f", Pay);
            }

            System.out.println();
            System.out.print("Enter hours worked or (-1 to CANCEL):");
            HourWorked = input.nextInt();

        }
        if (Counter > 3)
            System.out.println("Entry Completed");

        System.out.println("pRoGrAm EnDs");
    }
}
