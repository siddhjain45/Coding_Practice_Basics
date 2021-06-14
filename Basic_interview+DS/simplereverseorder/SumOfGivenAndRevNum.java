package simplereverseorder;
import java.util.*;
public class SumOfGivenAndRevNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,a,b,rev=0;
       System.out.println("Enter numbers");
       n = sc.nextInt();
       int m = n;
       while(n>0)
       {
    	   a=n%10;
    	   rev = (rev*10)+a;
    			   n = n/10;
       }
         System.out.println( "Reverse of the number =  "+rev);
         int total = m+rev;
         System.out.println("Sum of given number and its reverse is = "+total);
       

	}

}
