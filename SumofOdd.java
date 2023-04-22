
/*  Write a JAVA program to find sum of all odd numbers between 1 to n.*/
import java.util.*;

public class SumofOdd {
  public static void main(String[] args) {
    int n;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value:");
    n = sc.nextInt();
    for (int i = 1; i <= n; i += 2) {

      sum += i;

    }
    System.out.println("sum of n odd numbers" + sum);

  }
}