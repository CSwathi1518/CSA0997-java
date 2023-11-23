import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int count = 0; 
        int number = 2; 
        while (count < N) {
            if (isPrime(number)) {
                count++;
            }
            number++;
        }
        System.out.println(N + "rd Prime number is: " + (number - 1));
        System.out.print(N + " prime numbers after " + (number - 1) + " are: ");
        printNPrimes(N, number - 1);
    }
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void printNPrimes(int N, int start) {
        int count = 0;
        int num = start + 1;
        while (count < N) {
            if (isPrime(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }
    }
}
