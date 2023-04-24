import java.util.Scanner;

public class SumOfFirstAndLastDigit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int firstDigit = number;
    while (firstDigit >= 10) {
      firstDigit /= 10;
    }
    int lastDigit = number % 10;
    int sum = firstDigit + lastDigit;
    System.out.println("Sum of first and last digit: " + sum);
  }
}
