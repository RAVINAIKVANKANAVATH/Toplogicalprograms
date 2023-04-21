import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Input marks of five subjects
    System.out.print("Enter Physics marks: ");
    double physics = input.nextDouble();

    System.out.print("Enter Chemistry marks: ");
    double chemistry = input.nextDouble();

    System.out.print("Enter Biology marks: ");
    double biology = input.nextDouble();

    System.out.print("Enter Mathematics marks: ");
    double mathematics = input.nextDouble();

    System.out.print("Enter Computer marks: ");
    double computer = input.nextDouble();

    // Calculate percentage
    double totalMarks = physics + chemistry + biology + mathematics + computer;
    double percentage = (totalMarks / 500) * 100;

    // Determine grade
    String grade;
    if (percentage >= 90) {
      grade = "A";
    } else if (percentage >= 80) {
      grade = "B";
    } else if (percentage >= 70) {
      grade = "C";
    } else if (percentage >= 60) {
      grade = "D";
    } else if (percentage >= 40) {
      grade = "E";
    } else {
      grade = "F";
    }

    // Print result
    System.out.println("Percentage: " + percentage);
    System.out.println("Grade: " + grade);

    input.close();
  }
}
