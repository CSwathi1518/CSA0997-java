import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        if (income < 0) {
            System.out.println("Invalid income entered.");
        } else {
            double taxableIncome = income - 250000;
            double tax = 0;
            if (taxableIncome > 0) {
                if (taxableIncome <= 250000) {
                    tax = 0;
                } else if (taxableIncome <= 500000) {
                    tax = taxableIncome * 0.1;
                } else if (taxableIncome <= 1000000) {
                    tax = 250000 * 0.1 + (taxableIncome - 500000) * 0.2;
                } else {
                    tax = 250000 * 0.1 + 500000 * 0.2 + (taxableIncome - 1000000) * 0.3;
                }
            }
            System.out.println("Taxable Income: " + taxableIncome);
            System.out.println("Tax= " + tax);
        }
    }
}
