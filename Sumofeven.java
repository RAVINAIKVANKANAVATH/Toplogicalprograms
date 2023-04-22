
/*  Write a JAVA program to find sum of all even numbers between 1 to n.*/
import java.util.*;

public class Sumofeven {
  public static void main(String[] args) {
    int n;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value:");
    n = sc.nextInt();
    for (int i = 2; i <= n; i += 2) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("sum of n even numbers" + sum);

  }
}