
/*Write a JAVAprogram to enter a number and print its reverse */
import java.util.*;

public class Reverseofnumber {
  public static void main(String[] args) {
    int n;
    int rev = 0;
    int rem;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    n = sc.nextInt();

    while (n > 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      // n/=10;
      n = n / 10;

    }

    System.out.println("The Reverse of a number is:" + rev);

  }
}
