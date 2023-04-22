
/* Write a JAVAprogram to print all alphabets from a to z. - using while loop */
import java.util.*;

public class AlphabetsZ2A {
  public static void main(String[] args) {

    char ch = 'z';
    while (ch >= 'a') {
      System.out.println(ch + " ");
      ch--;
    }

  }
}
