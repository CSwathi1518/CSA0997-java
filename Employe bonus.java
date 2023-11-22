import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade of the employee: ");
        String grade = scanner.nextLine();
        System.out.println("Enter the employee salary: ");
        double salary = scanner.nextDouble();
        double bonus = 0;
        if (grade.equals("A")) {
            bonus = salary * 0.05;
        } else if (grade.equals("B")) {
            bonus = salary * 0.1;
        }
        if (salary < 10000) {
            bonus += salary * 0.02;
        }
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + (salary + bonus));
    }
}
