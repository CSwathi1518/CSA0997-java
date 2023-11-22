import java.util.Scanner;
public class CharacterSearchInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);
        scanner.close();
        int index = findCharacter(inputString, searchChar);
        if (index != -1) {
            System.out.println("Character '" + searchChar + "' is present at index " + index);
        } else {
            System.out.println("Character '" + searchChar + "' is not present in the string.");
        }
    }
    public static int findCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
