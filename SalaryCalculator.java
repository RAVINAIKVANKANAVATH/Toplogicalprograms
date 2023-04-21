import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Input basic salary
    System.out.print("Enter basic salary: ");
    double basicSalary = input.nextDouble();

    // Calculate gross salary
    double hra, da, grossSalary;
    if (basicSalary <= 10000) {
      hra = 0.2 * basicSalary;
      da = 0.8 * basicSalary;
    } else if (basicSalary <= 20000) {
      hra = 0.25 * basicSalary;
      da = 0.9 * basicSalary;
    } else {
      hra = 0.3 * basicSalary;
      da = 0.95 * basicSalary;
    }
    grossSalary = basicSalary + hra + da;

    // Print result
    System.out.println("Basic Salary: " + basicSalary);
    System.out.println("HRA: " + hra);
    System.out.println("DA: " + da);
    System.out.println("Gross Salary: " + grossSalary);

    input.close();
  }
}
