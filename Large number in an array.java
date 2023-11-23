import java.util.*;
public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = getIntInput(scanner);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = getIntInput(scanner);
        }

        System.out.print("Enter N: ");
        int n = getIntInput(scanner);
        scanner.close();
        Arrays.sort(arr);

        if (n <= 0 || n > size) {
            System.out.println("Invalid input");
        } else {
            System.out.println("The " + n + "th Largest number: " + arr[size - n]);
        }
    }

    public static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}
