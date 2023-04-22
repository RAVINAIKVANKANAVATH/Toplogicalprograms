
/*  Write a JAVAprogram to print all odd number between 1 to 100 */
import java.util.*;

public class Oddno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 1;

    while (i <= 100) {
      if (i % 2 != 0) {
        System.out.println(i + " ");
      }
      i++;

    }
  }
}
