
/*Write a JAVAprogram to check whether a number is Armstrong number or not*/
import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int num = input.nextInt();

    int sum = 0;
    int temp = num;

    while (temp > 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, 3);
      temp /= 10;
    }

    if (num == sum) {
      System.out.println(num + " is an Armstrong number");
    } else {
      System.out.println(num + " is not an Armstrong number");
    }
  }
}
