import java.util.HashMap;
import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();
        int result = romanToInteger(roman);
        if (result == -1) {
            System.out.println("Invalid Roman numeral entered.");
        } else {
            System.out.println("The equivalent integer is: " + result);
        }
        scanner.close();
    }
    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.getOrDefault(currentChar, -1);
            if (currentValue == -1) {
                return -1; 
            }
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
