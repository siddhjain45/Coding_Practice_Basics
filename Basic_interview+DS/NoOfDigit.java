import java.util.Scanner;
import java.lang.*;
public class NoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner obj = new Scanner(System.in);
         int n,count=0;
            
         System.out.println("Enter a no");
         n = obj.nextInt();
	  while(n>0){
		  n = n/10;
		  count++;
	  }
	  System.out.print("no of Digit  " + count);
	
	}

}
