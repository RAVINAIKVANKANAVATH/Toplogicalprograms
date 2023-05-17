/* Implement a java program to find the kth largest element in an unsorted array.*/
	    import java.util.*;
	 public class findingKthvalue 
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

   int a[]={1,3,4,8,65,34,61,97};
   System.out.println("enter kth value:");
   int k=sc.nextInt();
   for(int i=0;i<a.length;i++){
       for(int j=i+1;j<a.length;j++){
           if(a[i]<a[j])
           {
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
       }
       if(i==k-1)
       {
           System.out.println(a[i]);
           break;
       }
   }
   
    }
}

