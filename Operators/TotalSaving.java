import java.util.Scanner;

public class TotalSaving {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        double saving = sc.nextDouble();

        double monthlyInterrest = 0.05 / 12;
        double totalSaving = 0;

        // for (int i = 1; i <= 3; i++) {
        totalSaving = (totalSaving + saving) * (1 + monthlyInterrest);
        totalSaving = (totalSaving + saving) * (1 + monthlyInterrest);
        totalSaving = (totalSaving + saving) * (1 + monthlyInterrest);
        totalSaving = (totalSaving + saving) * (1 + monthlyInterrest);
        totalSaving = (totalSaving + saving) * (1 + monthlyInterrest);
        totalSaving = (totalSaving + saving) * (1 + monthlyInterrest);

        // }

        System.out.println(totalSaving);

    }

}
