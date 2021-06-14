import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
      int n,m,a, rev=0;
      System.out.println("Enter number");
      n = sc.nextInt();
      m=n;
      while(n>0){
    	  a = n%10;
         rev = (rev*10)+a;
         n = n/10;
    	  
      }
      System.out.println("reverse num  " + rev);
      if(m==rev){
    	  System.out.print("No is palindrome");
      }
      else{
    	  System.out.print("No is not polindrome");
      }
   
   
   
	}

}
