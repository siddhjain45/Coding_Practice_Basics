import java.util.Scanner;
public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
     int n,i,sum=0;
     System.out.println("Enter a number");
     n = obj.nextInt();
     for(i=1; i<=n; i++)
     {
    	 sum = sum+i;
    	  }
     System.out.print("Sum from 1 to " + n);
     System.out.print("  is = " +sum);
     
     
	
	
	
	
	}

}
