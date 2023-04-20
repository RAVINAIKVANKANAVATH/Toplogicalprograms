import java.util.*;
public class Maxof3
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num1:");
	int num1=sc.nextInt();
		System.out.println("enter num2:");
	int num2=sc.nextInt();
		System.out.println("enter num3:");
	int num3=sc.nextInt();
	int max=num1;
	if(num2>max){
	    max=num2;
	}
	    if(num3>max){
	        max=num3;

	}
	System.out.println("the max number is:"+max);
	}
	
}
