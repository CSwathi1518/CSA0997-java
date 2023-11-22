import java.util.Scanner;
public class CompositeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start and end of the range (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i > 1 && isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
    static boolean isComposite(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
