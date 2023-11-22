import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        System.out.println("Enter characters (stop with '*'):");
        while (true) {
            char input = scanner.next().charAt(0);
            if (input == '*') {
                break;
            }
            if (Character.isUpperCase(input)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(input)) {
                lowercaseCount++;
            } else if (Character.isDigit(input)) {
                digitCount++;
            }
        }
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
    }
}
