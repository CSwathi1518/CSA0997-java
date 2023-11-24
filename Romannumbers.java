import java.util.Scanner;
public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to convert to Roman number: ");
        int number = scanner.nextInt();
        String romanNumber = convertToRoman(number);
        System.out.println("The Roman number for " + number + " is " + romanNumber);
        scanner.close();
    }
    public static String convertToRoman(int number) {
        String romanNumber = "";
        while (number >= 1000) {
            romanNumber += "M";
            number -= 1000;
        }
        while (number >= 900) {
            romanNumber += "CM";
            number -= 900;
        }
        while (number >= 500) {
            romanNumber += "D";
            number -= 500;
        }
        while (number >= 400) {
            romanNumber += "CD";
            number -= 400;
        }
        while (number >= 100) {
            romanNumber += "C";
            number -= 100;
        }
        while (number >= 90) {
            romanNumber += "XC";
            number -= 90;
        }
        while (number >= 50) {
            romanNumber += "L";
            number -= 50;
        }
        while (number >= 40) {
            romanNumber += "XL";
            number -= 40;
        }
        while (number >= 10) {
            romanNumber += "X";
            number -= 10;
        }
        while (number >= 9) {
            romanNumber += "IX";
            number -= 9;
        }
        while (number >= 5) {
            romanNumber += "V";
            number -= 5;
        }
        while (number >= 4) {
            romanNumber += "IV";
            number -= 4;
        }
        while (number >= 1) {
            romanNumber += "I";
            number -= 1;
        }
        return romanNumber;
    }
}
