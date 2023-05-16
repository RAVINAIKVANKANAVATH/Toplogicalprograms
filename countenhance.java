
public class Main
{
	public static void main(String[] args) {
	    
	    int a[]={1,2,3,4,5,3,1,5,3,2,};
	    int target=2;
	    int c=0;
	    for( int obj:a){
	        if (target==obj){
	            c++;
	        } 
	    }
	    System.out.println("count is:"+c);
		
	}
}
