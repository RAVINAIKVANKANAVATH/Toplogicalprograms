
/*Write a JAVAprogram to calculate product of digits of a number */
import java.util.*;

public class Productofdigit {
  public static void main(String[] args) {
    int n;
    int rev = 0;
    int rem;
    int pro = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    n = sc.nextInt();

    while (n != 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      // n/=10;
      n = n / 10;
      pro = pro * rem;

    }

    System.out.println("The product of digit of a number is:" + pro);

  }
}
