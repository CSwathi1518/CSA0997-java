import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }
        System.out.print("First " + n + " perfect numbers are: ");
        int count = 0, number = 2;
        while (count < n) {
            if (isPerfectNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    public static boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
