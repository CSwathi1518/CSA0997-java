import java.util.Scanner;
public class NumberToTextConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numerical value: ");
        int number = scanner.nextInt();
        String text = convertNumberToText(number);
        System.out.println("Equivalent text: " + text);
        scanner.close();
    }
    public static String convertNumberToText(int number) {
        if (number == 0) {
            return "zero";
        }
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String text = "";
        if (number >= 1000) {
            text += units[number / 1000] + " thousand ";
            number %= 1000;
        }
        if (number >= 100) {
            text += units[number / 100] + " hundred ";
            number %= 100;
        }
        if (number >= 20) {
            text += tens[number / 10] + " ";
            number %= 10;
        } else if (number >= 11) {
            text += teens[number - 10] + " ";
            number = 0;
        }
        text += units[number];
        return text.trim();
    }
}
