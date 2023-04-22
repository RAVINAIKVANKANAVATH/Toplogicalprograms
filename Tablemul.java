
/* Write a JAVA program to print multiplication table of any number.*/
import java.util.*;

public class Tablemul {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter numer:");
    num = sc.nextInt();
    System.out.println("multiplecation table of:" + num + ":");
    for (int i = 1; i <= 10; i++)

      System.out.println(num + "x" + i + "=" + num * i);

  }
}