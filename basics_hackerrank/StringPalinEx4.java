package hackerrankprogramsex;

import java.util.Scanner;

public class StringPalinEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String A = sc.next();
      // StringBuffer b = new StringBuffer(A);
       //StringBuffer c =b;
      if(A.equals(new StringBuffer(A).reverse().toString()))
       {
    	   System.out.println("Yes");
       }
     /*  System.out.println(b);
       if(c.equals(b.reverse()))
       {
    	   System.out.println("Yes");
       }*/
       
       else
       {
    	   System.out.println("No");
       }
	}

}
