import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posCount = 0, negCount = 0;
        double posSum = 0.0, negSum = 0.0;
        System.out.println("Enter numbers (enter -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            if (num > 0) {
                posCount++;
                posSum += num;
            } else if (num < 0) {
                negCount++;
                negSum += num;
            }
        }
        if (posCount > 0)
            System.out.println("The average of positive numbers is: " + (posSum / posCount));
        else
            System.out.println("No positive numbers entered.");

        if (negCount > 0)
            System.out.println("The average of negative numbers is: " + (negSum / negCount));
        else
            System.out.println("No negative numbers entered.");
    }
}
