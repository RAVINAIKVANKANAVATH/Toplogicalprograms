
/* Write a JAVAprogram to check whether a number is palindrome or not */
import java.util.*;

public class Palindrome {
  public static void main(String[] args) {
    int n;
    int rev = 0;
    int rem;
    int temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    n = sc.nextInt();
    temp = n;
    while (n != 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      // n/=10;
      n = n / 10;

    }
    if (temp == rev) {
      System.out.println("number is palindrome");
    } else
      System.out.println("number is not palindrome");
  }
}
