/* Write a JAVAprogram to find frequency of each digit in a given integer */
import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] freq = new int[10];
        while(num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        System.out.println("Digit Frequency:");
        for(int i=0; i<10; i++) {
            System.out.println(i + " -> " + freq[i]);
        }
    }
}
