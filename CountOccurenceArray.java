/* Write a program to count the number of occurrences of each element in an array */
import java.util.*;
public class CountOccurenceArray
{
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		int a[]={1,2,3,4,5,4,2,6,3,63,6,4,7,8,3,23,6,5};
		System.out.println("enter the value:");
		int val=sc.nextInt();
		for(int v:a){
		    if(val==v)
		    {
		        count++;
		    }
		    
		}
		System.out.println("the count occurrences of this number is:" +count);
	}
}
