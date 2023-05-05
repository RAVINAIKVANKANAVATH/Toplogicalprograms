
/*Write a JAVAprogram to find all prime factors of a number*/
import java.util.Scanner;

public class PrimeFactors {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int num = input.nextInt();

    System.out.print("The prime factors of " + num + " are: ");

    for (int i = 2; i <= num; i++) {
      while (num % i == 0) {
        System.out.print(i + " ");
        num /= i;
      }
    }
  }
}
