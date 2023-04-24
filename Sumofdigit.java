
/* Write a JAVAprogram to calculate sum of digits of a number */
import java.util.*;

public class Sumofdigit {
  public static void main(String[] args) {
    int n;
    int rev = 0;
    int rem;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    n = sc.nextInt();

    while (n != 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      // n/=10;
      n = n / 10;
      sum = sum + rem;

    }

    System.out.println("The sum of digit is:" + sum);

  }
}
