import java.util.Scanner;

public class NoteCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter amount: ");
    int amount = sc.nextInt();

    int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
    int[] count = new int[10];

    for (int i = 0; i < 10; i++) {
      if (amount >= notes[i]) {
        count[i] = amount / notes[i];
        amount = amount - (count[i] * notes[i]);
      }
    }

    System.out.println("Total number of notes:");
    for (int i = 0; i < 10; i++) {
      if (count[i] != 0) {
        System.out.println(notes[i] + " : " + count[i]);
      }
    }
  }
}
