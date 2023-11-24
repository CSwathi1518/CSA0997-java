import java.util.Scanner;
class Student {
    private int[] marks = new int[4];
    public void setMarks(int subjectIndex, int marks) {
        this.marks[subjectIndex] = marks;
    }
    public int getMarks(int subjectIndex) {
        return marks[subjectIndex];
    }
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    public double getAggregate() {
        return getTotalMarks() / (double) marks.length;
    }
    public String getClassification() {
        double aggregate = getAggregate();
        if (aggregate > 75) {
            return "DISTINCTION";
        } else if (aggregate >= 60 && aggregate <= 75) {
            return "FIRST DIVISION";
        } else if (aggregate >= 50 && aggregate < 60) {
            return "SECOND DIVISION";
        } else if (aggregate >= 40 && aggregate < 50) {
            return "THIRD DIVISION";
        } else {
            return "FAIL";
        }
    }
}
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the marks in subject " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            student.setMarks(i, marks);
        }
        System.out.println("Total= " + student.getTotalMarks());
        System.out.println("Aggregate = " + student.getAggregate());
        System.out.println("Class: " + student.getClassification());

        scanner.close();
    }
}



