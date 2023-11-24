import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        char inputChar;
        System.out.println("Enter * to exit...");
        do {
            System.out.print("Enter any character: ");
            inputChar = scanner.next().charAt(0);
            if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isDigit(inputChar)) {
                digitCount++;
            }
        } while (inputChar != '*');
        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("Lowercase count: " + lowercaseCount);
        System.out.println("Digit count: " + digitCount);
    }
}
