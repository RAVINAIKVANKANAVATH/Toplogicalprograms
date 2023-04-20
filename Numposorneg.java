import java.util.*;

public class Numposorneg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num:");
    int num = sc.nextInt();
    if (num > 0) {
      System.out.println("the number is positive:");
    } else if (num < 0) {
      System.out.println("the number is Negative:");
    } else
      System.out.println("the number is zer0:");
  }

}
